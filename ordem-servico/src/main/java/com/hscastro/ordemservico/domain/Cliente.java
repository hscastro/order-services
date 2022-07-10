package com.hscastro.ordemservico.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
public class Cliente extends Pessoa{
	
	private static final long serialVersionUID = -7478867051505986148L;
	
	@OneToMany(mappedBy = "cliente")
	private List<OrdemServico> listaClientes = new ArrayList<>();
}
