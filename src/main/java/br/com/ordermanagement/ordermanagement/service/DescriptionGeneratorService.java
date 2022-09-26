package br.com.ordermanagement.ordermanagement.service;

import org.springframework.stereotype.Service;

@Service
public class DescriptionGeneratorService 
{	
	public String[] descriptionGenerator() 
        {
		
		String alimentos[] = {"Pizza", "Hamburguer", "Sorvete"};
		
		return alimentos;
	}
}
