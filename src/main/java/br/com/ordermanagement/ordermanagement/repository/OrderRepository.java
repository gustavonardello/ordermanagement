package br.com.ordermanagement.ordermanagement.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ordermanagement.ordermanagement.domain.OrderDomain;

@Repository
public interface OrderRepository {

	List<OrderDomain> infoOrdered() throws Exception;

}