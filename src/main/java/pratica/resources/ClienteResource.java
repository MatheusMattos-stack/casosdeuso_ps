package pratica.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pratica.domain.Cliente;
import pratica.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")

public class ClienteResource {
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET) //end point é /ID
	public ResponseEntity<?> find(@PathVariable Integer id) { //@PathVariable permite que o ID da URL venha para a variável 
		//ResponseEntity encapsula as informações das respostas HTTP para um serviço REST
		Cliente obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}