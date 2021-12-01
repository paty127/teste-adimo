package com.Adimo.demo.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Adimo.demo.entity.Casa;
import com.Adimo.demo.repository.CasaRepository;

@Controller
public class CasaController {
	
	@Autowired
	private CasaRepository ir;
	
	Set<Casa> favoritos = new HashSet<Casa>();
	
	
	@GetMapping("/casa/detalhes/{id}")
	public String detalhes(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("casa", ir.buscaCasaPorId(id));
		return ("detalhes");
	}
	
	@GetMapping("/casa/add")
	public ResponseEntity<Casa> addFavorito(@RequestParam(required = false) Integer id) {

		if (id != null) {
			favoritos.add(ir.buscaCasaPorId(id));
		}
		return ResponseEntity.ok().body(null);
	}
	
	@GetMapping("/casa/favorito")
	public String favorito(Model model) {
		model.addAttribute("casa", favoritos);
		return ("favoritos");
	}
	
	@GetMapping("/casa/favoritos/delete")
	public String deletaFavoritos(@RequestParam("id") Integer id, Model model) {
		favoritos.remove(ir.buscaCasaPorId(id));
		return ("redirect:/casa/favorito");
	}
}



