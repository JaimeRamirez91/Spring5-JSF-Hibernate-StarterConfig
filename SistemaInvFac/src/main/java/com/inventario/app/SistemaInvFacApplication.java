package com.inventario.app;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SistemaInvFacApplication extends ServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SistemaInvFacApplication.class, args);
	}
	/**
	 * Configuración de JSF con Spring Boot 5
	 * Paso 1
	 * para paso 2: ir a Web XML
	 * **/
	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();                                           //Extención
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.xhtml");
        return servletRegistrationBean;
    }
}
