package br.com.ordermanagement.ordermanagement.repository;

import br.com.ordermanagement.ordermanagement.domain.OrderDomain;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDomain, Long>{

	List<OrderDomain> infoOrdered() throws Exception;
}
