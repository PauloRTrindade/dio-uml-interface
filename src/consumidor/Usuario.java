package consumidor;

import celular.SmartPhone;

public class Usuario {

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();

		// Ações realizadas pelo Aparelho Telefonico
		sp.ligar();
		sp.atender();
		sp.iniciarCorreioDeVoz();
		System.out.println();

		// Ações realizadas pelo Reprodutor Musical
		sp.selecionarMusica();
		sp.tocar();
		sp.passar();
		System.out.println();

		// Ações realizadas pelo Navegador de Internet
		sp.adicionarNovaAba();
		sp.exibirPagina();
		sp.atualizarPagina();
	}

}
