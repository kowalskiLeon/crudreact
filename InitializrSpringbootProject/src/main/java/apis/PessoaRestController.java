/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis;

import entidades.Endereco;
import entidades.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.EnderecoService;
import services.PessoaService;

/**
 *
 * @author guilherme.moura
 */

@RestController
@RequestMapping("/pessoa")
public class PessoaRestController extends BaseRestController<Pessoa>{
    
    private final PessoaService service;
    
    @Autowired
    public PessoaRestController(PessoaService service){
        super(service, Pessoa.class, Pessoa[].class);
            this.service = service;
    }
    
}
