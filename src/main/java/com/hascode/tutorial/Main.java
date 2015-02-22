package com.hascode.tutorial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

public class Main {
	public static void main(final String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
		mapper.acceptJsonFormatVisitor(Book.class, visitor);
		JsonSchema schema = visitor.finalSchema();
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
	}
}
