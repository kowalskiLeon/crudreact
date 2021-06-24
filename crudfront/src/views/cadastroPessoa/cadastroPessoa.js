import React from "react";
import { Col, Form, Row, Button, ButtonGroup, ButtonToolbar, Table } from "react-bootstrap";
import BaseTable from "../BaseTable";

class CadastroPessoa extends React.Component {


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



    render (){
        const colunas = ['ID', 'Nome, CPF'];
        this.getAll();
        
    
    return (
        <div className="container-fluid">
            <Row className="row my-5">
                <Col className="col-5 mx-auto">
                    <Form>
                        <Row className="justify-content-md-center">
                            <Col xs lg="2">
                                <Form.Group controlId="formId">
                                    <Form.Label>ID</Form.Label>
                                    <Form.Control readOnly type="number" placeholder="" />
                                </Form.Group>
                            </Col>
                            <Col xs lg="8">
                                <Form.Group controlId="formNome">
                                    <Form.Label>Nome Completo</Form.Label>
                                    <Form.Control type="text" placeholder="" />
                                </Form.Group>
                            </Col>
                            <Col xs lg="2">
                                <Form.Group controlId="formIdade">
                                    <Form.Label>Idade</Form.Label>
                                    <Form.Control type="number" placeholder="" />
                                </Form.Group>
                            </Col>
                        </Row>
                        <Row>
                            <Col xs lg="4">
                                <Form.Group controlId="formCPF">
                                    <Form.Label>CPF</Form.Label>
                                    <Form.Control type="number" placeholder="" />
                                </Form.Group>
                            </Col>
                            <Col>
                                <Form.Group controlId="formGenero">
                                    <Form.Label>Gênero</Form.Label>
                                    <Form.Control as="select" defaultValue="Choose...">
                                        <option>Escolha uma das opções...</option>
                                        <option>Masculino</option>
                                        <option>Feminino</option>
                                        <option>Não Binário</option>
                                        <option>Prefiro não informar.</option>
                                    </Form.Control>
                                </Form.Group>
                            </Col>
                            <Col>
                                <Form.Group controlId="formEstadoCivil">
                                    <Form.Label>Estado Cívil</Form.Label>
                                    <Form.Control as="select" defaultValue="Choose...">
                                        <option>Escolha uma das opções...</option>
                                        <option>Solteiro</option>
                                        <option>Casado</option>
                                        <option>Divorciado</option>
                                        <option>Viuvo</option>
                                    </Form.Control>
                                </Form.Group>
                            </Col>
                        </Row>
                        <Row className="justify-content-md-center mt-4">
                            <Col xs lg="5">
                                <Form.Group controlId="formEndereco">
                                    <Form.Label>Endereço</Form.Label>
                                    <Form.Control type="text" placeholder="Apenas nome da rua ou avenida" />
                                </Form.Group>
                            </Col>
                            <Col xs lg="3">
                                <Form.Group controlId="formNumero">
                                    <Form.Label>Número</Form.Label>
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
                                    <Form.Label>Referência</Form.Label>
                                    <Form.Control type="text" placeholder="" />
                                </Form.Group>
                            </Col>
                        </Row>
                        <Row className="justify-content-md-left mt-5">
                            <Col>
                                <Form.Group controlId="formDescricao">
                                    <Form.Label>Descrição</Form.Label>
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
                </Col>
                <Col className="col-5 mx-auto">
                <BaseTable entidade = 'Pessoas' pronome ='F' colunas= {colunas} />
                </Col>
            </Row>
        </div>
    );
}
}
export default CadastroPessoa