package cl.monitor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.monitor.services.WarehouseService;

@Controller
public class IndexController {
	@Autowired
	WarehouseService ws;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("warehouse",ws.findAll());
		return "index.jsp";
	}
}
