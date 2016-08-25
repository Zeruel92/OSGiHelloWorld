package it.pspgt.helloworld.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld/1.0")
public class Resources {

	@GET
	@Path("hello")
	@Produces("text/plain;charset=UTF-8")
	public String hello(){
		return "HelloWorld Rest tramite OSGi e Jetty";
	}
}
