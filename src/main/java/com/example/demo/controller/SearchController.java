package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/")
	public String home() {
		return "home" ;
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q=" +query ;
		RedirectView redirectview = new RedirectView () ;
		redirectview.setUrl(url) ;
		return redirectview ;
	}

}
