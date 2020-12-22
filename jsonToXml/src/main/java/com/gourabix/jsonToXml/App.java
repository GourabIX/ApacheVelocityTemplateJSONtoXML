package com.gourabix.jsonToXml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gourabix.jsonToXml.dto.PersonDTO;

/**
 * @author Gourab Sarkar
 *
 */

public class App {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		PersonDTO personDTO = null;

		try {
			personDTO = mapper.readValue(new File("src/main/resources/convertJson.json"), PersonDTO.class);
		} catch (IOException exception) {
			System.err.println("Could not read JSON file!");
			exception.printStackTrace();
		}

		// first, get and initialize an engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();

		// next, get the Template
		Template template = velocityEngine.getTemplate("src/main/resources/HelloApacheVelocity.vm");

		// create a context and add data
		VelocityContext context = new VelocityContext();
		context.put("person", personDTO);

		// now render the template into a StringWriter
		StringWriter writer = new StringWriter();
		template.merge(context, writer);

		// show the World
		try {
			// the parent folder - "generated" must be created first!
			BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("target/generated/GeneratedPurchaseOrder.xml"));
			bufferedWriter.write(writer.toString());
			bufferedWriter.close();
			System.out.println("File was written to disk successfully with values!");
		} catch (IOException exception) {
			System.err.println("File failed to be written to disk with values!");
			exception.printStackTrace();
		}

	}
}
