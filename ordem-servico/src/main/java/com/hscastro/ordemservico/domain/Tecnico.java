package com.hscastro.ordemservico.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tecnico extends Pessoa {
	
	private static final long serialVersionUID = -7499195410060967724L;

	@OneToMany(mappedBy = "tecnico")
	private List<OrdemServico> listaTecnicos = new ArrayList<>();

}
