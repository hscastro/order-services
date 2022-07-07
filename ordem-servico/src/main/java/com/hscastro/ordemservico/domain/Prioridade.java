package com.hscastro.ordemservico.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum Prioridade {
	
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");
	
	private Integer cod;
	private String descricao;
	
	public static Prioridade toEnumPrioridade(Integer cod) {
		if(cod == null){
			return null;
		}
		
		for (Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioridade Invalida "+cod);
	}

}
