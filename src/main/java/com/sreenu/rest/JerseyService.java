package com.sreenu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;



@Api("Operations on jersey 2.x")
@Path("/healthCheck")
@SwaggerDefinition(tags={@Tag(name="jersey poc services",description ="rest end poing for poc service")})
public class JerseyService {
	@GET
	 @ApiOperation(value = "helthCheck"
		        )
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid username supplied"),
			@ApiResponse(code = 404, message = "User not found") })
	public String getMsg() {
		return "Jersey rest service running.";
	}
	public static void main(String[] args) {
		JerseyService jerseyService= new JerseyService();
		jerseyService.getMsg();
	}
}
