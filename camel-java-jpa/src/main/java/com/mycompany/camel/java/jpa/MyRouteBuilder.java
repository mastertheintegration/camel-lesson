package com.mycompany.camel.java.jpa;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {
    	org.apache.camel.converter.jaxb.JaxbDataFormat jxb = new JaxbDataFormat("com.mycompany.camel.java.model");
        from("file:src/data?noop=true")
        .unmarshal(jxb)
        .to("jpa:com.mycompany.camel.java.model.Person");
        
    }

}
