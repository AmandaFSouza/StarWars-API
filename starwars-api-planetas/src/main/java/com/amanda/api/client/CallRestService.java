package com.amanda.api.client;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

import com.amanda.api.documents.Planeta;

@Component
public class CallRestService implements CommandLineRunner{
	
	
	private static void CallRestService () {
		RestTemplate restTemplate = new RestTemplate();
		Planeta planeta = restTemplate.getForObject("https://swapi.dev/api/planets/", Planeta.class);
		System.out.println(planeta.getQtdFilmes());
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CallRestService();
		
	}

}
