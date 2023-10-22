package celular;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
	}

	@Override
	public void ligar() {
		System.out.println("Ligacao realizada");
	}

	@Override
	public void atender() {
		System.out.println("Ligacao atendida");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz inicializado");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void passar() {
		System.out.println("Passando a musica");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}

}
