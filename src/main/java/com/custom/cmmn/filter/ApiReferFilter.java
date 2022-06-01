package com.custom.cmmn.filter;

import java.io.IOException;
import java.util.Set;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

public class ApiReferFilter extends TypeFilterWrapper{
	private String filterType = "";
	private String targetAnnotation = "";
	
	public ApiReferFilter(String filterType) {
		this.filterType = filterType;
	};
	
	public ApiReferFilter(String filterType, String targetAnnotation) {
		this.filterType = filterType;
		this.targetAnnotation = targetAnnotation;
	};
	
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		
		if(filterType.equals("ANNOTATION")) {
			AnnotationMetadata metaData = metadataReader.getAnnotationMetadata();
			Set<String> annotationSet = metaData.getAnnotationTypes();
			
			if(targetAnnotation.equals("CONTROLLER")) {
				targetAnnotation = "org.springframework.stereotype.Controller";
			} else if(targetAnnotation.equals("APIDOCANNOTATION")) {
				targetAnnotation = "com.custom.cmmn.annotation.ApidocAnnotation";
			}
			
			if(!annotationSet.contains(targetAnnotation)) {
				return true;
			}
			
		} else if (filterType.equals("CLASS")) {	
			ClassMetadata metaData = metadataReader.getClassMetadata();
			String className = metaData.getClassName();
			
			if(className.contains("com.custom.api")) {
				return true;
			}
			
		} else if (filterType.equals("RESOURCE")) {
			
		}
		
		return false;
	}
}
