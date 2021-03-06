import React from "react";
import { Col, Form, Row, Button, ButtonGroup, ButtonToolbar, Table } from "react-bootstrap";
import BaseTable from "../BaseTable";

class CadastroEstabelecimento extends React.Component {

    async getAll() {

        let url = 'https://127.0.0.1:7035/crudreact/v1/pessoa/listarTodos';
        let username = 'postgres';
        let password = '642138983';
        let headers = new Headers();

        headers.set('Authorization', 'Basic ' + btoa(username + ":" + password));

        const response = await fetch(url, headers)
            .then(response => response.json())
            .then(data => console.log(data));
        console.log(response)
    }

    render() {
        const colunas = ['ID', 'Nome'];
        var pessoasLength = 0;
        var tiposLenght = 0;
        var mostragem = '';

        this.getAll();

        if (pessoasLength === 0 || tiposLenght === 0) {
            mostragem = <h1>Cadastre pessoas e tipos de estabelecimentos primeiro.</h1>
        }
        else {
            mostragem = <Form>
                <Row className="justify-content-md-left">
                    <Col xs lg="2">
                        <Form.Group controlId="formId">
                            <Form.Label>ID</Form.Label>
                            <Form.Control readOnly type="number" placeholder="" />
                        </Form.Group>
                    </Col>
                    <Col xs lg="10">
                        <Form.Group controlId="formNome">
                            <Form.Label>Nome do Estabelecimento</Form.Label>
                            <Form.Control type="text" placeholder="" />
                        </Form.Group>
                    </Col>
                </Row>
                <Row>
                    <Col xs lg="4">
                        <Form.Group controlId="formCNPJ">
                            <Form.Label>CNPJ</Form.Label>
                            <Form.Control type="number" placeholder="" />
                        </Form.Group>
                    </Col>
                    <Col xs lg="8">
                        <Form.Group controlId="formDono">
                            <Form.Label>Dono</Form.Label>
                            <Form.Control as="select" defaultValue="Choose...">
                                <option>Escolha uma das op????es...</option>
                            </Form.Control>
                        </Form.Group>
                    </Col>
                </Row>
                <Row className="justify-content-md-center mt-4">
                    <Col xs lg="5">
                        <Form.Group controlId="formEndereco">
                            <Form.Label>Endere??o</Form.Label>
                            <Form.Control type="text" placeholder="Apenas nome da rua ou avenida" />
                        </Form.Group>
                    </Col>
                    <Col xs lg="3">
                        <Form.Group controlId="formNumero">
                            <Form.Label>N??mero</Form.Label>
                            <Form.Control type="text" placeholder="" />
                        </Form.Group>
                    </Col>
                    <Col xs lg="4">
                        <Form.Group controlId="formBairro">
                            <Form.Label>Bairro</Form.Label>
                            <Form.Control type="text" placeholder="" />
                        </Form.Group>
                    </Col>
                </Row>
                <Row className="justify-content-md-left">
                    <Col xs lg="4">
                        <Form.Group controlId="formComplemento">
                            <Form.Label>Complemento</Form.Label>
                            <Form.Control type="text" placeholder="Apto, Bloco" />
                        </Form.Group>
                    </Col>
                    <Col xs lg="3">
                        <Form.Group controlId="formReferencia">
                            <Form.Label>Refer??ncia</Form.Label>
                            <Form.Control type="text" placeholder="" />
                        </Form.Group>
                    </Col>
                </Row>
                <Row className="justify-content-md-left mt-5">
                    <Col>
                        <Form.Group controlId="formDescricao">
                            <Form.Label>Descri????o</Form.Label>
                            <Form.Control as="textarea" rows={6} />
                        </Form.Group>
                    </Col>
                </Row>
                <Row className="my-5">
                    <Col className="justify-content-md-right">
                        <ButtonToolbar aria-label="Toolbar with button groups">
                            <ButtonGroup className="mr-2" aria-label="Basic example">
                                <Button variant="info" size="lg" type="submit">
                                    Salvar
                    </Button>
                            </ButtonGroup>
                            <ButtonGroup className="mr-2" aria-label="Basic example">
                                <Button mx="10" variant="warning" size="lg" >
                                    Apagar Campos
                    </Button>
                            </ButtonGroup>
                        </ButtonToolbar>
                    </Col>
                </Row>
            </Form>
        }

        return (
            <div className="container-fluid">
                <Row className="row my-5">
                    <Col className="col-5 mx-auto">
                        {mostragem}
                    </Col>
                    <Col className="col-5 mx-auto">
                        <BaseTable entidade='Estabelecimentos' pronome='M' colunas={colunas} />
                    </Col>
                </Row>
            </div>
        );
    }
}

export default CadastroEstabelecimento