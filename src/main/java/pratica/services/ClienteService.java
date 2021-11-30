package pratica.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pratica.domain.Cliente;
import pratica.repositories.ClienteRepository;

@Service // serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class ClienteService {
	@Autowired //instancia o objeto repo, fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e/ou vários argumentos.
	private ClienteRepository repo; //serviço que busca cliente
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);
	}
}