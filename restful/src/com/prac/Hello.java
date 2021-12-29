package com.prac;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;

@Path("/this")
public class Hello {

	@GET
	@Path("/is")
	@Produces(MediaType.TEXT_PLAIN) 
	public String sayHello(){
		return "Say hello";
	}
	
	@POST
	@Path("/signup")
	public Response details(@FormParam("name") String name,@FormParam("password") String password)
	{
		return Response.status(200).entity("Signup Details <br> Name" + ""+name+ "<br>Password"+ "" +password).build();
	}
	}
	

