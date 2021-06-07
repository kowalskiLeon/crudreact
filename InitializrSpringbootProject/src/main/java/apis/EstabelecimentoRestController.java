/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis;

import entidades.Estabelecimento;
import entidades.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.EstabelecimentoService;
import services.PessoaService;

/**
 *
 * @author guilherme.moura
 */

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoRestController extends BaseRestController<Estabelecimento>{
    
    private final EstabelecimentoService service;
    
    @Autowired
    public EstabelecimentoRestController(EstabelecimentoService service){
        super(service, Estabelecimento.class, Estabelecimento[].class);
            this.service = service;
    }
    
}