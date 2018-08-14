package com.sreenu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/healthCheck")
public class JerseyService
{
    @GET
    public String getMsg()
    {
         return "Jersey rest service running..";
    }
}
