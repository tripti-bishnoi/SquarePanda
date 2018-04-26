/**
 * 
 */
package com.tau.jsonschemaapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author triptibishnoi
 *
 */
public class JsonSchemaGenerator {

	public static void generateJSONSchema(String jsonSample) {

		try {
			// getting the samples of json data from sample.txt file
			BufferedReader br = new BufferedReader(new FileReader(jsonSample));
			ArrayList<String> samples = new ArrayList<>();
			String s = "";
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("Sample")) {
					if (!s.equals("")) {
						samples.add(s);
						s = "";
					}
					continue;
				}
				s += line;
			}
			samples.add(s);

			// for each sample in the list of samples, populating the schema
			JSONObject schema = new JSONObject();
			for (String sample : samples) {
				JSONObject jsonObj = new JSONObject(sample);
				schema = helper(jsonObj, schema);
			}

			// creating json schema file
			try (FileWriter file = new FileWriter("/Users/triptibishnoi/Desktop/output.json")) {
				file.write(schema.toString());
				file.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException | JSONException e) {
			e.printStackTrace();
		}

	}

	public static String createPremitive(Object value) {
		if (value instanceof String)
			return "String";
		if (value instanceof Integer)
			return "Integer";
		if (value instanceof JSONArray)
			return "JSONArray";
		if (value instanceof JSONObject)
			return "JSONObject";
		return "unknown";
	}

	public static JSONObject helper(JSONObject jsonObj, JSONObject schema) throws JSONException {
		Iterator itr = jsonObj.keys();

		while (itr.hasNext()) {
			String key = (String) itr.next();
			String premitive = createPremitive(jsonObj.get(key));
			if (premitive.equals("unknown")) {
				// do nothing
				System.out.println("unknown sample data!!");
			} else if (premitive.equals("JSONArray")) {
				JSONArray arr = (JSONArray) jsonObj.get(key);
				JSONArray resultArr = new JSONArray();
				for (int i = 0; i < arr.length(); i++) {
					JSONObject result = helper(arr.getJSONObject(i), new JSONObject());
					resultArr.put(result);
				}
				schema.put(key, resultArr);
			} else if (premitive.equals("JSONObject")) {
				JSONObject result = helper((JSONObject) jsonObj.get(key), new JSONObject());
				schema.put(key, result);
			} else {
				schema.put(key, premitive);
			}
		}

		return schema;
	}
}
