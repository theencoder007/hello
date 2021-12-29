package com.rest;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class TestClient {
	
	public static void main(String[] args) {
		
		ClientConfig config = new ClientConfig();
		
		Client clt = ClientBuilder.newClient(config);
		
		WebTarget trg = clt.target(getBaseURI());
		
		System.out.println(trg.path("rest").path("hello").path("text").request().accept(MediaType.TEXT_PLAIN).get(String.class));
		System.out.println(trg.path("rest").path("hello").path("html").request().accept(MediaType.TEXT_HTML).get(String.class));
	}
	
	private static URI getBaseURI()
	{
		return UriBuilder.fromUri("http://localhost:7172/restapiexp").build();
	}

}
