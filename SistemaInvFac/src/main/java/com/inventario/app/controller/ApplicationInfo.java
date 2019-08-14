package com.inventario.app.controller;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value="applicationInfo")
@Scope("session")
public class ApplicationInfo {
	
	private String slogan = "Este es un mensaje desde la session controller";
	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
}

