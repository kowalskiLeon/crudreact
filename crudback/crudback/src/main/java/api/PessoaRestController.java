/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import entidades.Pessoa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author guilherme.moura
 */

@RestController
@RequestMapping("/pessoa")
public class PessoaRestController extends BaseRestController<Pessoa>{
    
}
