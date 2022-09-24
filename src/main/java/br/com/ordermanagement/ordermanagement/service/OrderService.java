/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.service;

import br.com.ordermanagement.ordermanagement.domain.OrderDomain;
import br.com.ordermanagement.ordermanagement.repository.OrderRepository;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gustavo
 */
@Service
public abstract class OrderService implements OrderRepository
{	
	@Autowired
	DescriptionGeneratorService descriptionGeneratorService;
	
	@Override
    public List<OrderDomain> infoOrdered() throws Exception
    {
    	Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        List<OrderDomain> orderList = new ArrayList<>();
        OrderDomain orderDomain = new OrderDomain();
        orderDomain.setData(data);
        orderDomain.setDescription(geraAlimentos());
        orderDomain.setId(01);
        orderDomain.setAmount((int) (Math.random() * 6));
        
        if(orderDomain.getAmount() < 1) 
        {
        	orderDomain.setAmount(1);
        }
        
        orderList.add(orderDomain);
        return orderList;
    }
    
    public String geraAlimentos() throws Exception {
    	
    	try 
        {
    		String euQuero = "Eu quero";
    		String alimentos[] = descriptionGeneratorService.descriptionGenerator();
    		
    		for(int i = 0; i < alimentos.length;) {
    			Random random = new Random();
    			int index = random.nextInt(alimentos.length);
    			
    			String retorna = euQuero + " " + alimentos[index];
    			
    			return retorna;
    		}
    	} catch(Exception e) 
        {
    		new Exception("Alimentos não gerados");
    	}
    	
    	return "";
    }
}
