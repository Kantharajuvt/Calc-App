package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calciController {
	@Autowired
	calciService cs;
	
	public calciController(calciService cs) {
		super();
		this.cs = cs;
	}

	@PostMapping("/calculate")
	public String calculate(@RequestParam("num1") int n1,@RequestParam("num2") int n2, @RequestParam("operation") String op, Model m) {
	    String result=null;
		switch(op.toUpperCase()) {
		case "ADD" -> result=cs.ADD(n1, n2);
		
		case "SUB" -> result=cs.SUB(n1, n2);
		
		case "mul" -> result=cs.MUL(n1, n2);
		
		case "MOD" -> result=cs.MOD(n1, n2);
		
		case "DIV" -> {
			try {
			result=cs.DIV(n1, n2);
		} catch(Exception e) {
			m.addAttribute("n1",n1);
			m.addAttribute("n2",n2);
			m.addAttribute("res","Invalid operation so No result...");
			m.addAttribute("op",op);
			return "result";
		}
		}
		}
		m.addAttribute("n1",n1);
		m.addAttribute("n2",n2);
		m.addAttribute("res",result);
		m.addAttribute("op",op);
		return "result";
	}
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
