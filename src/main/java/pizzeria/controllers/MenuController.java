package pizzeria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pizzeria.repository.PizzaRepository;

@Controller
@RequestMapping("/")
public class MenuController {

	@Autowired
	private PizzaRepository repository;

	
	@GetMapping("/")
	public String menuController(Model model) {
		model.addAttribute("pizze", repository.findAll());
		return "index";
	}
	
}
