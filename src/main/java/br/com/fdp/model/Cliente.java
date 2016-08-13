package br.com.fdp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity    // estamos falando ao JPA que nossa classe é uma entidade e vai 
			// virar uma tabela no banco de dados e suas propriedades vao virar as colunas
public class Cliente {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private	String email;
	private String cpf;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

}
