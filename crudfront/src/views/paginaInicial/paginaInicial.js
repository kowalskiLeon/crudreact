
import React from "react";
import { Button, Card, Container, Jumbotron } from "react-bootstrap";

class PaginaInicial extends React.Component {
    render() {

        let listaPessoas = [];
        let listaEstabs = [];
        let listaTipos = [];

        return (
            <div className="container-fluid">
                <div className="row">
                    <div className="col-12 p-0 m-0">
                        <Jumbotron fluid>
                            <Container>
                                <h1>Sistema de Cadastro Básico criado</h1>
                                <p>
                                    Back-End integrado utilizando...
                                </p>
                                <p>
                                    Criado por Leon Kowalski, 2021
                            </p>
                            </Container>
                        </Jumbotron>
                    </div>
                </div>
                <div className="row my-5 mx-auto">
                    <div className="col-3 mx-auto">
                        <Card>
                            <Card.Header>
                                Pessoas Cadastradas
                        </Card.Header>
                            <Card.Body>
                                <Card.Title>Foram cadastradas {listaPessoas.length} Pessoas</Card.Title>
                                <Card.Text>
                                    Some quick example text to build on the card title and make up the bulk of
                                    the card's content.
                            </Card.Text>
                            </Card.Body>
                        </Card>
                    </div>
                    <div className="col-3 mx-auto">
                        <Card>
                            <Card.Header>
                                Estabelecimentos Cadastrados
                        </Card.Header>
                            <Card.Body>
                                <Card.Title>Foram cadastrados {listaEstabs.length} Estabelecimentos</Card.Title>
                                <Card.Text>
                                    Some quick example text to build on the card title and make up the bulk of
                                    the card's content.
                            </Card.Text>
                            </Card.Body>
                        </Card>
                    </div>
                    <div className="col-3 mx-auto">
                        <Card>
                            <Card.Header>
                                Tipos de Estabelecimentos Cadastrados
                            </Card.Header>
                            <Card.Body>
                                <Card.Title>Foram cadastrados {listaTipos.length} Tipos de Estabelecimentos</Card.Title>
                                <Card.Text>
                                    Some quick example text to build on the card title and make up the bulk of
                                    the card's content.
                            </Card.Text>
                            </Card.Body>
                        </Card>
                    </div>
                </div>

            </div>
        );
    }
}
export default PaginaInicial