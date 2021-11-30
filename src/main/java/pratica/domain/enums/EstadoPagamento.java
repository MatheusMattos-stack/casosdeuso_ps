
package pratica.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1,"Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3,"Cancelado");
	
	private int cod;
	private String descricao;
	private EstadoPagamento(int cod, String descricao) { //Construtor do Tipo Enumerado é PRIVATE
	this.cod = cod;
	this.descricao = descricao;
	}
	public int getCod() { //Somente GET, uma vez que instancia um tipo enumerado não modifica mais o nome dele
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public static EstadoPagamento toEnum(Integer cod) { //
		if (cod == null) {
			 return null;
			 }
			 for (EstadoPagamento x : EstadoPagamento.values()) {
				 if (cod.equals(x.getCod())) { //faz uma varredura nos objetos
					 return x;
				 }
			 }
			 throw new IllegalArgumentException("Id inválido " + cod); 
			 }
			
private Integer tipo;
public EstadoPagamento getTipo() {
	return EstadoPagamento.toEnum(tipo);
}
public void setTipo(EstadoPagamento tipo) {
	this.tipo = tipo.getCod();
}
	
}

