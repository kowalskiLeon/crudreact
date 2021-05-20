//Importar as dependências
import React from 'react';
import {BrowserRouter, Switch, Route} from 'react-router-dom';
import PaginaInicial from './views/paginaInicial/paginaInicial'
import CadastroPessoa from './views/cadastroPessoa/cadastroPessoa'
import CadastroTipo from './views/cadastroTipoEstabelecimento/CadastroTipo';
import CadastroEstabelecimento from './views/cadastroEstabelecimento/CadastroEstabelecimento';


//Criar o componentes com as rotas
function Routes(){
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={PaginaInicial} />
                <Route path="/home" exact component={PaginaInicial} />
                <Route path="/cadastro_pessoa" component={CadastroPessoa} />
                <Route path="/cadastro_tipo" component={CadastroTipo} />
                <Route path="/cadastro_estabelecimento" component={CadastroEstabelecimento} />
            </Switch>        
        </BrowserRouter>
    );
};

export default Routes;