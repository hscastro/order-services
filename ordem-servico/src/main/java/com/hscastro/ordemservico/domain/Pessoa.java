package com.hscastro.ordemservico.domain;

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
public abstract class Pessoa {
	
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;

}
