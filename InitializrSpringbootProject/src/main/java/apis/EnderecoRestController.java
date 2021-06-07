/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis;

import entidades.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.EnderecoService;

/**
 *
 * @author guilherme.moura
 */
@RestController
@RequestMapping("/endereco")
public class EnderecoRestController extends BaseRestController<Endereco> {
    
    private final EnderecoService service;
    
    @Autowired
    public EnderecoRestController(EnderecoService service){
        super(service, Endereco.class, Endereco[].class);
            this.service = service;
    }
    
}
