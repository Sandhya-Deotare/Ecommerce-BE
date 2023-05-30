package com.ecommerce.api.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	private final String resourceName;
	private final String fieldName;
	private final long feildValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long feildValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, feildValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.feildValue = feildValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public long getFeildValue() {
		return feildValue;
	}	
	
}
