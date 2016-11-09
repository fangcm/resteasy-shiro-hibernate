package com.hezy.modules.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/demo")
public class DemoRestService {

	@GET
	@Path("test1")
	@Produces("application/json; charset=UTF-8")
	public Response test1() {
		JSONObject result = new JSONObject();
		result.put("msg", "此接口不需要权限，访问正常");
		return Response.ok().entity(result.toString()).build();
	}

	@GET
	@Path("test2")
	@Produces("application/json; charset=UTF-8")
	public Response test2() {
		JSONObject result = new JSONObject();
		result.put("msg", "权限控制，访问正常");
		return Response.ok().entity(result.toString()).build();

	}

}
