/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_impl;

import configs.BaseServiceImpl;
import entidades.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import repositorios.EnderecoRepositorio;
import services.EnderecoService;

/**
 *
 * @author guilherme.moura
 */
public class EnderecoServiceImpl extends BaseServiceImpl<Endereco> implements EnderecoService{
    
    private final EnderecoRepositorio repository;
    @Autowired
    public EnderecoServiceImpl(EnderecoRepositorio repository) {
        super(repository);
        this.repository = repository;
    }
    
}
