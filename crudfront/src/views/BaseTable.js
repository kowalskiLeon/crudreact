import React from "react";
import {Table } from "react-bootstrap";

class BaseTable extends React.Component{
    render(){
        console.log(this.props)
        let entidade = this.props.entidade;
        let colunas = []
        let entradas = []
        let pronome = 'o'
        if(this.props.pronome === "F"){
            pronome = 'a';
        } 
        

        if(entradas.length === 0){
            colunas.push(<th className="text-center">Cadastre mais {entidade}</th>)
            entradas.push(
            <tr>
                <td key={'empty'} className="text-center" colSpan="4">Não foram encontrad{pronome}s {entidade}.</td>
            </tr>)
        }else{
            for(let i=0; i<this.props.colunas.length; i++){
                colunas.push(<th key={this.props.colunas[i]}>{this.props.colunas[i]}</th>)
            };
            colunas.push(<th>Ações</th>)
        }

    return (
        <Table striped bordered hover>
            <thead>
                <tr>
                    {colunas}
                </tr>
            </thead>
            <tbody>
               {entradas}                
            </tbody>
        </Table>
    );
}
}

export default BaseTable

