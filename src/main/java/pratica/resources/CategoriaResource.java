package pratica.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pratica.domain.Categoria;
import pratica.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
	
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
