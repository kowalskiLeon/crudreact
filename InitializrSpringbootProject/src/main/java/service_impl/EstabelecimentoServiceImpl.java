/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_impl;

import configs.BaseServiceImpl;
import entidades.Endereco;
import entidades.Estabelecimento;
import org.springframework.beans.factory.annotation.Autowired;
import repositorios.EnderecoRepositorio;
import repositorios.EstabelecimentoRepositorio;
import services.EnderecoService;
import services.EstabelecimentoService;

/**
 *
 * @author guilherme.moura
 */
public class EstabelecimentoServiceImpl extends BaseServiceImpl<Estabelecimento> implements EstabelecimentoService{
    
    private final EstabelecimentoRepositorio repository;
    @Autowired
    public EstabelecimentoServiceImpl(EstabelecimentoRepositorio repository) {
        super(repository);
        this.repository = repository;
    }
    
}
