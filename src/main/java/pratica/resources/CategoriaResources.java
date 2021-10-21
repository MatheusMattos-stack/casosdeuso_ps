package pratica.resources;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class CategoriaResources implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	public CategoriaResources() { //com esse construtor é possível instanciar objetos sem jogar nada para os atributos
		
	}

	public CategoriaResources(Integer id, String nome) { //para gerar este construtor: Botão direito, source, Generate Constructor using Fields
		super();
		this.id = id;
		this.nome = nome;
	}
	//para gerar este construtor: Botão direito, source, Generate Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaResources other = (CategoriaResources) obj;
		return Objects.equals(id, other.id);
	}	

}

