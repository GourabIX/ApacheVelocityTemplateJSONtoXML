package com.gourabix.jsonToXml;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 * @author Gourab Sarkar
 *
 */

public class App {
	public static void main(String[] args) {

		// first, get and initialize an engine
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();

		// next, get the Template
		Template template = velocityEngine.getTemplate("src/main/resources/HelloApacheVelocity.vm");

		// create a context and add data
		VelocityContext context = new VelocityContext();
		context.put("name", "Gourab");

		// now render the template into a StringWriter
		StringWriter writer = new StringWriter();
		template.merge(context, writer);

		// show the World
		System.out.println(writer.toString());

	}
}
