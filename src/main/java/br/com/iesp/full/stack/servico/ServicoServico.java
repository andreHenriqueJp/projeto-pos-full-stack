package br.com.iesp.full.stack.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.iesp.full.stack.entidades.Servico;
import br.com.iesp.full.stack.repositorio.IServicoRepositorio;

@Service
public class ServicoServico implements IGenericoCRUD<Servico, Long> {
	
	@Autowired
	private IServicoRepositorio servicoRepositorio;

	@Override
	@Transactional
	public void salvar(Servico entidade) {
		this.servicoRepositorio.save(entidade);
	}

	@Override
	@Transactional
	public void alterar(Servico entidade) {
		this.servicoRepositorio.save(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		this.servicoRepositorio.deleteById(id);
	}

	@Override
	public Servico buscar(Long id) {
		return this.servicoRepositorio.getOne(id);
	}

	@Override
	public List<Servico> listar(Servico filtro) {
		return null;
	}

	@Override
	public List<Servico> listar() {
		return this.servicoRepositorio.findAll();
	}

}