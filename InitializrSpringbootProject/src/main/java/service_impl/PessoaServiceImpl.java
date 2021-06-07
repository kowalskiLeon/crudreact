/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_impl;

import configs.BaseServiceImpl;
import entidades.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import repositorios.EstabelecimentoRepositorio;
import repositorios.PessoaRepositorio;
import services.PessoaService;

/**
 *
 * @author guilherme.moura
 */
public class PessoaServiceImpl extends BaseServiceImpl<Pessoa> implements PessoaService{
    
    private final PessoaRepositorio repository;
    @Autowired
    public PessoaServiceImpl(PessoaRepositorio repository) {
        super(repository);
        this.repository = repository;
    }
    
}