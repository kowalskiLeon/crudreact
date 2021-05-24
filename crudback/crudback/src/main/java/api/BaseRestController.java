/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import entidades.BaseEntity;
import org.springframework.web.bind.annotation.RestController;
import services.BaseService;

/**
 *
 * @author guilherme.moura
 */

@RestController
public class BaseRestController <T extends BaseEntity>{
   
    
    protected BaseService<T> baseService;
}
