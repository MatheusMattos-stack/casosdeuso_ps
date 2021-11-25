package pratica.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Estado implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@ManyToMany(mappedBy = "Estados")
	private List<Cidade> cidade = new ArrayList<>(); 
	
	
	public Estado() { //com esse construtor é possível instanciar objetos sem jogar nada para os atributos
		
	}


	public Estado(Integer id, String nome, List<Cidade> cidades) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
	}
	
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


	public List<Cidade> getCidades() {
		return cidade;
	}


	public void setCidades(List<Cidade> cidades) {
		this.cidade = cidade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cidade, id, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}
	
	
}