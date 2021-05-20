import 'bootstrap/dist/css/bootstrap.min.css';
import {NavDropdown, Form, FormControl, Navbar, Button, Nav} from 'react-bootstrap'

function NavbarCRUD() {
  return (
      <Navbar bg="light" expand="lg">
        <Navbar.Brand href="home">CRUD Básico em React</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="mr-auto">
            <Nav.Link href="home">Pág. Inicial</Nav.Link>
            <Nav.Link href="cadastro_pessoa">Cadastro de Pessoas</Nav.Link>
            <Nav.Link href="cadastro_estabelecimento">Cadastro de Estabelecimentos</Nav.Link>
            <Nav.Link href="cadastro_tipo">Cadastro de Tipos de Estabelecimento</Nav.Link>
            {/* <NavDropdown title="Dropdown" id="basic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">Another action</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item>
            </NavDropdown> */}
          </Nav>
          <Form inline>
            <FormControl type="text" placeholder="Search" className="mr-sm-2" />
            <Button variant="outline-success">Search</Button>
          </Form>
        </Navbar.Collapse>
      </Navbar>
  );
}

export default NavbarCRUD;