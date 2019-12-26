/**
 * 
 */
package com.sift.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Amit Singh
 *
 */

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry resourceRegistry) {
		resourceRegistry.addResourceHandler("/**").
        addResourceLocations("classpath:/static/").
        resourceChain(false);
//        .addResolver(new PathResourceResolver() {
//        	protected Resource getResource(String resourcePath, Resource location ) throws Exception
//        	{
//        		
//        		Resource requestedResource=location
//        	}
//        });
//	
		
	}
	
}
