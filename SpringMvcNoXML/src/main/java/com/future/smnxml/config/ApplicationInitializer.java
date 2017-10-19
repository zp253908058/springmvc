package com.future.smnxml.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration.Dynamic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see ApplicationInitializer
 * @since 2017/9/20
 */
public class ApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(ApplicationWebMvcConfigurer.class);
        context.setServletContext(servletContext);

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
