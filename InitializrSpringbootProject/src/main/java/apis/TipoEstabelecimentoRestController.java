/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis;

import entidades.Pessoa;
import entidades.TipoEstabelecimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.PessoaService;
import services.TipoEstabelecimentoService;

/**
 *
 * @author guilherme.moura
 */
@RestController
@RequestMapping("/estabelecimento")
public class TipoEstabelecimentoRestController extends BaseRestController<TipoEstabelecimento>{
    
    private final TipoEstabelecimentoService service;
    
    @Autowired
    public TipoEstabelecimentoRestController(TipoEstabelecimentoService service){
        super(service, TipoEstabelecimento.class, TipoEstabelecimento[].class);
            this.service = service;
    }
    
}

