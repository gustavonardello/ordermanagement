package br.com.ordermanagement.ordermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ordermanagement.ordermanagement.domain.OrderDomain;
import br.com.ordermanagement.ordermanagement.repository.OrderRepository;

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
