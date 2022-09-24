/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@RestController
public class OrderController {
	
    @GetMapping(value = "/retorno")
    public String valor()
    {
        return "Preste sempre atenção nos Pull request que pedem pra voce aprovar. Sempre analise";
    }
    
}
