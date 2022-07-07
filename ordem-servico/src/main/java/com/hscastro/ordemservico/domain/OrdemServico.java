package com.hscastro.ordemservico.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class OrdemServico implements Serializable {
	
	private static final long serialVersionUID = 2949156737955019461L;
	
	private Long id;
	private LocalDateTime dataAbertura;
	private LocalDateTime dataFechamento;
	private Integer prioridade;
	private String observacoes;
	private Integer status;
	private Tecnico tecnico;
	private Cliente cliente;
	
	public OrdemServico(Long id, LocalDateTime dataAbertura, LocalDateTime dataFechamento, Prioridade prioridade,
			String observacoes, Status status, Tecnico tecnico, Cliente cliente) {
		
		this.id = id;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.prioridade = (prioridade == null) ? 0 : prioridade.getCod();
		this.observacoes = observacoes;
		this.status = (status == null) ? 0 : status.getCod();
		this.tecnico = tecnico;
		this.cliente = cliente;
	}	
}
