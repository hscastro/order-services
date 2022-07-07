package com.hscastro.ordemservico.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@NoArgsConstructor
@AllArgsConstructor
public class OrdemServico implements Serializable {
	
	private static final long serialVersionUID = 2949156737955019461L;
	
	private Long id;
	private LocalDateTime dataAbertura;
	private LocalDateTime dataFechamento;
	private Prioridade prioridade;
	private String observacoes;
	private Status status;
	private Tecnico tecnico;
	private Cliente cliente;

}
