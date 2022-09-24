/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.controller;

import br.com.ordermanagement.ordermanagement.domain.OrderDomain;
import br.com.ordermanagement.ordermanagement.repository.OrderRepository;
import br.com.ordermanagement.ordermanagement.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@RestController
public class OrderController 
{	   
    @Autowired
    OrderRepository orderRepository;
    
    @GetMapping(value = "/orders")
     public List<OrderDomain> infoOrdered() throws Exception
    {
        return orderRepository.infoOrdered();
    }
    
}
