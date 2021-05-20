import React from "react";
import { Col, Form, Row, Button, ButtonGroup, ButtonToolbar, Table } from "react-bootstrap";
import BaseTable from "../BaseTable";

class CadastroTipo extends React.Component {
    render (){
        const colunas = ['ID', 'Nome'];
    
    return (
        <div className="container-fluid">
            <Row className="row my-5">
                <Col className="col-5 mx-auto">
                    <Form>
                        <Row className="justify-content-md-left">
                            <Col xs lg="2">
                                <Form.Group controlId="formId">
                                    <Form.Label>ID</Form.Label>
                                    <Form.Control readOnly type="number" placeholder="" />
                                </Form.Group>
                            </Col>
                            <Col xs lg="10">
                                <Form.Group controlId="formNome">
                                    <Form.Label>Nome do Tipo</Form.Label>
                                    <Form.Control type="text" placeholder="" />
                                </Form.Group>
                            </Col>
                        </Row>
                        <Row>
                            
                            <Col xs lg="8">
                                <Form.Group controlId="formDono">
                                    <Form.Label>Categoria</Form.Label>
                                    <Form.Control as="select" defaultValue="Choose...">
                                        <option>Escolha uma das opções...</option>
                                        <option>Restaurante</option>
                                        <option>Loja de Roupas</option>
                                        <option>Mercado</option>
                                        <option>Super Mercado</option>
                                        <option>Artigos de Esporte</option>
                                        <option>Farmácia</option>
                                    </Form.Control>
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
                    <BaseTable entidade = 'Tipos de Estabelecimento' pronome ='M' colunas= {colunas} />
                </Col>
            </Row>
        </div>
    )
}
}

export default CadastroTipo