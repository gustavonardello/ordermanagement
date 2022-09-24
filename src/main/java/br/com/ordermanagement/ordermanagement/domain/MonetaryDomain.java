package br.com.ordermanagement.ordermanagement.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;

@Entity
public class MonetaryDomain 
{
    public BigDecimal value;
    public BigDecimal cashback;
    public BigDecimal balance;
}
