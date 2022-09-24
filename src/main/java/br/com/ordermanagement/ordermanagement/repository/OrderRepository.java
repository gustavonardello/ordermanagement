/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.repository;

import br.com.ordermanagement.ordermanagement.domain.OrderDomain;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gustavo
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderDomain, Long>{

	List<OrderDomain> infoOrdered() throws Exception;

}
