/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import configs.BaseRepository;
import entidades.Endereco;
import entidades.Estabelecimento;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author guilherme.moura
 */
@Repository
@Transactional
public interface EstabelecimentoRepositorio  extends BaseRepository<Estabelecimento> {
    
}
