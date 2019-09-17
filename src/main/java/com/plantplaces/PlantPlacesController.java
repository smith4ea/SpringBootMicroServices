package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller



public class PlantPlacesController {
	
	@RequestMapping("/start")
	public String Start() {
		return "start";
	}
	
	/**
	 * Handle the / end points
	 * @return
	 */
	
	@RequestMapping("")
	public String Index() {
		return "start";
	}
}
