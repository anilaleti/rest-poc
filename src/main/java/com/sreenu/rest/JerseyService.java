package com.sreenu.rest;

import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/healthCheck")
public class JerseyService
{
    private  Logger logger = Logger.getLogger(JerseyService.class);
    @GET
    public String healthCheck()
    {
         logger.debug("entered inside healthCheck()");

         return "Jersey rest service running....";

    }

}
