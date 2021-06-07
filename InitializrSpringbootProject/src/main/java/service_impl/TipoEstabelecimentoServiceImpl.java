/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_impl;

import configs.BaseServiceImpl;
import entidades.Pessoa;
import entidades.TipoEstabelecimento;
import org.springframework.beans.factory.annotation.Autowired;
import repositorios.PessoaRepositorio;
import repositorios.TipoEstabelecimentoRepositorio;
import services.PessoaService;
import services.TipoEstabelecimentoService;

/**
 *
 * @author guilherme.moura
 */
public class TipoEstabelecimentoServiceImpl extends BaseServiceImpl<TipoEstabelecimento> implements TipoEstabelecimentoService{
    
    private final TipoEstabelecimentoRepositorio repository;
    @Autowired
    public TipoEstabelecimentoServiceImpl(TipoEstabelecimentoRepositorio repository) {
        super(repository);
        this.repository = repository;
    }
    
}