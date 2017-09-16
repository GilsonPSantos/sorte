package com.jogos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController{

	@RequestMapping(name="/", method=RequestMethod.GET)
	public ModelAndView inicio(ModelMap model) {
		return new ModelAndView("index", "msg", "bem vindo");
	}
}
