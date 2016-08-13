package br.com.fdp.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fdp.model.Cliente;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TesteClienteRepository {
	
	public void testeSalvar(){

		@Autowired
		ClienteRepository repository;
		
		@Test
		Cliente cliente = new Cliente();
		cliente.setNome("JÃO");
		cliente.setEmail("jao@email.com");
		cliente.setCpf("999999999");
		repository.save(cliente);
	}

}
