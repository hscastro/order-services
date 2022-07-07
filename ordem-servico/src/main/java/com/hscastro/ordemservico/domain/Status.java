package com.hscastro.ordemservico.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum Status {
	
	ABERTA(0, "ABERTA"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADA(2, "ENCERRADA");
	
	private Integer cod;
	private String descricao;
	
	public static Status toEnumStatus(Integer cod) {
		if(cod == null){
			return null;
		}
		
		for (Status x : Status.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status Invalido "+cod);
	}

}
