package br.com.ordermanagement.ordermanagement.domain;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class ClientDomain
{
    public String clientName;
    public String cpf;
    public int phone;
    public String email;    
}
