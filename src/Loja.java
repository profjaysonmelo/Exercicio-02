
public class Loja {

	private String razaoSocial;
	private String endereco;
	
	public void atribuirRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String obterRazaoSocial() {
		return razaoSocial;
	}
	
	public void atribuirEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String obterEndereco() {
		return endereco;
	}
	
	public String exibirDados() {
		return "Razão Social: " + razaoSocial + " / Endereço: " + endereco;
	}
}
