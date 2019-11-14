package com.netbanking.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class NetBaning {

	public static void main(String[] args) {

		ClientBuilder builder=null;
		Client client=null;
		builder=ClientBuilder.newBuilder();
		client=builder.build();
		WebTarget target=client.target("http://localhost:1010/clientresource/api/netbank");
		target.path("/{accNumber}");
		target.resolveTemplate("accNumber", "1255");
		Response response=target.request().get();
		
		if(response.getStatus()==200)
		{
			String out=response.readEntity(String.class);
			System.out.println(out);
		}
		else {
			System.out.println(response.getStatus());
		}
	}

}
