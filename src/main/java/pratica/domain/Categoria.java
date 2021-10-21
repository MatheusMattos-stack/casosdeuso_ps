package pratica.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import pratica.domain.Categoria;
import pratica.resources.CategoriaResources;


@RestController
@RequestMapping(value="/categorias")

public class Categoria {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<CategoriaResources> listar() {
		
		CategoriaResources cat1 = new CategoriaResources(1, "Informática");
		CategoriaResources cat2 = new CategoriaResources(2, "Escritório");
		
		List<CategoriaResources> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}

}