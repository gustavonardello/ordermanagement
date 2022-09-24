/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Gustavo
 */
@Service
public class DescriptionGeneratorService 
{	
	public String[] descriptionGenerator() 
        {
		
		String alimentos[] = {"Pizza", "Hamburguer", "Sorvete"};
		
		return alimentos;
	}
}
