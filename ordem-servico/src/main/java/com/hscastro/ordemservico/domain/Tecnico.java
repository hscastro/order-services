package com.hscastro.ordemservico.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tecnico extends Pessoa {
	
	private static final long serialVersionUID = -7499195410060967724L;

	private List<OrdemServico> lista = new ArrayList<>();

}
