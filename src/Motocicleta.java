
public class Motocicleta {

	private String modelo;
	private int qtde;
	private Double valor;
	
	public void atribuirModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String obterModelo() {
		return modelo;
	}
	
	public void atribuirQtde(Integer qtde) {
		this.qtde = qtde;
	}
	
	public Integer obterQtde() {
		return qtde;
	}
	
	public void atribuirValor(Double valor) {
		this.valor = valor;
	}
	
	public Double obterValor() {
		return valor;
	}
	
	public Double calcularEstoque() {
		return qtde * valor;
	}
	
}
