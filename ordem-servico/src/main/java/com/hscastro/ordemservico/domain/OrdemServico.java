package com.hscastro.ordemservico.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
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
	
	public OrdemServico() {
		this.setDataAbertura(LocalDateTime.now());
		this.setPrioridade(Prioridade.BAIXA);
		this.setStatus(Status.ABERTA);
	}
	
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setDataFechamento(LocalDateTime dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade.getCod();
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void setStatus(Status status) {
		this.status = status.getCod();
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
}
