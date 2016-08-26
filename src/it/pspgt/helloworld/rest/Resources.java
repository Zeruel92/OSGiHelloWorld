package it.pspgt.helloworld.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("helloworld/1.0")
public class Resources {

	@GET
	@Path("hello/{id}")
	@Produces("text/plain;charset=UTF-8")
	public String hello(@PathParam("id")String id){
		return id+" HelloWorld Rest tramite OSGi e Jetty";
	}
}
