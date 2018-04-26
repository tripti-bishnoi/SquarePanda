package com.tau.test;

import com.tau.jsonschemaapi.JsonSchemaGenerator;

public class TestAPI {

	public static void main(String[] args) {

//		JsonSchemaGenerator.generateJSONSchema("/Users/triptibishnoi/Desktop/sample.txt");

		String s = "TriptiAshish";
		System.out.println(s.substring(2, 8));
		String temp = new String(s.toCharArray(), 2, 6);
		System.out.println(temp);
	}

}
