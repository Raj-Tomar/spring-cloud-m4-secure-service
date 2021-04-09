package com.example;

import java.util.ArrayList;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableResourceServer
public class TollController {

	
	@GetMapping("/tolldata")
	public ArrayList<TollUsage> getTollData() {
		TollUsage i1 = new TollUsage("100", "Station150", "BG35GT1X", "2021-04-09T06:31:22");
		TollUsage i2 = new TollUsage("101", "Station132", "AHY36GT2Y", "2021-04-09T06:35:29");
		TollUsage i3 = new TollUsage("102", "Station164", "ZN37GT3Z", "2021-04-09T06:38:49");
		
		ArrayList<TollUsage> tolls = new ArrayList<>();
		tolls.add(i1);
		tolls.add(i2);
		tolls.add(i3);
		return tolls;
	}
}
