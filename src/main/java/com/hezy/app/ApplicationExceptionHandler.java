package com.hezy.app;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

/**
 * 异常处理
 * @author a
 *
 */
@Provider
public class ApplicationExceptionHandler implements ExceptionMapper<Exception> {

	private static Logger logger = Logger.getLogger(ApplicationExceptionHandler.class);	
	
	
	@Override
	public Response toResponse(Exception arg0) {
		logger.error(arg0.getMessage(), arg0);
		return Response.status(Status.BAD_REQUEST).entity(arg0.getMessage()).build(); 
	}

}
