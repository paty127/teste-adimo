package com.Adimo.demoController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Adimo.repository.CasaRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	
	private CasaRepository ir;
	
	
	@GetMapping
	public ModelAndView home(@RequestParam(required = false) String localidade) {
		ModelAndView mv = new ModelAndView("home");
		if (localidade == null) {
			mv.addObject("casa", ir.findAll());
			return mv;
		}
		else {
		mv.addObject("casa", ir.buscaCasaPorLocalidade(localidade));
		return mv;
		}
		ir;	
} 
	
	
	@GetMapping
	public ModelAndView home(@RequestParam(required = false) String localidade) {
		ModelAndView mv = new ModelAndView("home");
		if (localidade == null) {
			mv.addObject("casa", ir.findAll());
			return mv;
		}
		else {
		mv.addObject("casa", ir.buscaCasaPorBairro(localidade));
		return mv;
		}
	}
}


