package com.inventario.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inventario.app.dao.CategoriaDao;

@Controller
public class CategoriaController {
	
	@Autowired 
	//@Qualifier("clienteDaoJPA")
	private CategoriaDao categoriaDao;
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listar Categorias");
		model.addAttribute("categorias", categoriaDao.findAll());
		return "lista";	
	}

}
