import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			
		Motocicleta m1;
				
		Loja l1 = new Loja();
		l1.atribuirRazaoSocial("SENAI");
		l1.atribuirEndereco("SC 401");
		
		m1 = new Motocicleta();
		m1.atribuirModelo("CG 150 2019");
		m1.atribuirQtde(12);
		m1.atribuirValor(6599.99);
		
		System.out.println(l1.exibirDados());
		
		System.out.println("Estoque: R$ " + m1.calcularEstoque());
		
		Motocicleta m2 = new Motocicleta();
		m2.atribuirModelo("BROS 150 2019");
		m2.atribuirQtde(8);
		m2.atribuirValor(9599.99);
		
		System.out.println("Estoque: R$ " + m2.calcularEstoque());
		
		if (m1.obterQtde() > 10) {
			//REGRA
		} else if (m1.obterQtde() > 100) {
			
		}
		
		System.out.println("RANDOMICO:" + Math.random() * 60);
		
		Motocicleta[] motos = new Motocicleta[3];
		
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i < motos.length; i++) {
			motos[i] = new Motocicleta();
			motos[i].atribuirModelo(leia.next());
			motos[i].atribuirQtde(leia.nextInt());
			motos[i].atribuirValor(leia.nextDouble());
			System.out.println(motos[i].calcularEstoque());
		}
		
		
	}
	
}
