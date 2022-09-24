/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo
 */
@Getter
@Setter
@Entity
public class MonetaryDomain 
{
    public BigDecimal value;
    public BigDecimal cashback;
    public BigDecimal balance;
}
