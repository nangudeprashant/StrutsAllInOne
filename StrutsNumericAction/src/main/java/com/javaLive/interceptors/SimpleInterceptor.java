package com.javaLive.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SimpleInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(SimpleInterceptor.class); // SLF4J
	 @Override
	 public String intercept(ActionInvocation invocation)throws Exception{

	       /* let us do some pre-processing */
	       String output = "Pre-Processing"; 
	       System.out.println(output);
	       logger.info(output);
	       /* let us call action or next interceptor */
	       String result = invocation.invoke();

	       /* let us do some post-processing */
	       output = "Post-Processing"; 
	       System.out.println(output);
	       logger.info(output);
	       return result;
	    }
}
