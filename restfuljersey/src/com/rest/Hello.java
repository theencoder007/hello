package com.rest;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;

@Path("/hello")  
public class Hello {  
   
  @GET  
  @Path("/text")
  @Produces(MediaType.TEXT_PLAIN)  
  public String sayPlainTextHello() {  
    return "Hello Jersey Plain";  
  }  
  
  @GET
  @Path("/html/{name}")
  @Produces(MediaType.TEXT_HTML)
  public String hellohtmlRes(@PathParam("name") String name)
  {
	  return "<html><body><h1>This is  Html Response" +" " +name+"</h1></body></html>";
  }  
  
  
  @POST
  @Path("/createEmp")
  public Response empDetails(@FormParam("id") int id, @FormParam("name")
	String name, @FormParam("cmp") String cmp)
	{
		return Response.status(200).entity("Employee Details <br> ID "
				+ ""+id+"<br> Name "+name+" <br> Company "+cmp).build();
	}

}
  