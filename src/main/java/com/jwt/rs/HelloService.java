package com.jwt.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")

public class HelloService {

	@GET
	@Path("/{name}")
	public Response getMessage(@PathParam("name") String n1) {
		
		String output = "Welcome : "+n1;
		return Response.status(200).entity(output).build();
	}
	
}
