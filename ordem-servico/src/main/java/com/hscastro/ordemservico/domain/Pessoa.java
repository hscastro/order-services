package com.hscastro.ordemservico.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 8329493081197829546L;
	
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
}
