/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ordermanagement.ordermanagement.domain;

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
public class ClientDomain
{
    public String nome;
    public String cpf;
    public int telefone;
    public String email;    
}
