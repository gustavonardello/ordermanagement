package br.com.ordermanagement.ordermanagement.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class MonetaryDomain 
{
    public BigDecimal value;
    public BigDecimal cashback;
    public BigDecimal balance;
}
