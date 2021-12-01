package com.Adimo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LocatarioController {
	("/locatario")
	

		@Autowired
		private LocatarioRepository lr;
		
		
		@GetMapping("/registro")
		public String registro(Model model) {
			model.addAttribute("loc", new Locatario());
			return ("registro");
		}
		
		@PostMapping("/registro")
		public String cadastroCliente(@Valid @ModelAttribute("loc") Locatario locatario, BindingResult bindingResult) {
			
			if (bindingResult.hasErrors()) {
				return "registro";
			}
			
			lr.save(locatario);
			return ("redirect:/locatario/registro");
		}
	}


}
