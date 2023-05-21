package com.nicolas.mostrarfecha.controller;


import java.util.Date;
//import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model fecha) {
		
		Date fechaActual = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, 'dia' d 'de' MMMM, YYYY");
		
	    fecha.addAttribute("fecha", formatoFecha.format(fechaActual));
	    
	    return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model fecha) {
		
		Date fechaActual = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("hh:mm a");
		
	    fecha.addAttribute("fecha", formatoFecha.format(fechaActual));
	    
		return "time.jsp";
	}

}
