//Importar as dependências
import React from 'react';
import {BrowserRouter, Switch, Route} from 'react-router-dom';
import PaginaInicial from './views/paginaInicial/paginaInicial'
import CadastroPessoa from './views/cadastroPessoa/cadastroPessoa'


//Criar o componentes com as rotas
function Routes(){
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={PaginaInicial} />
                <Route path="/home" exact component={PaginaInicial} />
                <Route path="/cadastro_pessoa" component={CadastroPessoa} />
            </Switch>        
        </BrowserRouter>
    );
};

export default Routes;