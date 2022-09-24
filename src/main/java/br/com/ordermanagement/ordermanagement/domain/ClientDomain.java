package br.com.ordermanagement.ordermanagement.domain;

import javax.persistence.Entity;

@Entity
public class ClientDomain
{
    public String clientName;
    public String cpf;
    public int phone;
    public String email;    
}
