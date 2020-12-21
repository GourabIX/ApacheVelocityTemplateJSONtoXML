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
		VelocityEngine ve = new VelocityEngine();
		ve.init();

		// next, get the Template
		Template t = ve.getTemplate("src/main/resources/HelloApacheVelocity.vm");

		// create a context and add data
		VelocityContext context = new VelocityContext();
		context.put("name", "Gourab");

		// now render the template into a StringWriter
		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		// show the World
		System.out.println(writer.toString());

	}
}
