package com.campbell.omikuji.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@GetMapping("/omikuji")
	public String displayForm(HttpSession session) {
		return "sessions/home.jsp";
	}
	
	// PROCESS THE FORM
	@PostMapping("/form/process")
	public String processForm(
	        @RequestParam("number") int number,
	        @RequestParam("city") String city,
	        @RequestParam("person") String person,
	        @RequestParam("hobby") String hobby,
	        @RequestParam("living_thing") String living_thing,
	        @RequestParam("message") String message,
	        HttpSession session) {
	    session.setAttribute("number", number);
	    session.setAttribute("city", city);
	    session.setAttribute("person", person);
	    session.setAttribute("hobby", hobby);
	    session.setAttribute("living_thing", living_thing);
	    session.setAttribute("message", message);
	    return "redirect:/show/result";
	}
	
	@GetMapping("/show/result")
	public String displayResult(HttpSession session) {
		return "sessions/display.jsp";
	}
	
}

