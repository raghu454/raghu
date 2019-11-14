package com.ri.srm;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/sbi")
public class Account {

	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{accNumber:\\d{5}}")
	public String getBalance(@PathParam("accNumber") String accNumber, @MatrixParam("lb")String lb)
	{
		return "300000"+"lastMonth "+lb;
	}*/
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
    @Path("/branch")
	public String getBranch(@QueryParam("accNumber") String accNumber)
	{
		return "Growth Center Branch";
	}*/
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getBranches(@QueryParam("branches")@DefaultValue("SBI") List<String>branches)
	{
		return "All Branches "+branches;
	}
}
