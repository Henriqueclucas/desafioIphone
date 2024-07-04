package aplicações;

import aplicações.AparelhoTelefonico;
import aplicações.ReprodutorMusica;
import aplicações.NavegadorInternet;


public class SistemaOperacional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica{
	
	@Override
	public void ligar(String numero) {
		System.out.println("Telefone: ");
		System.out.println("Ligando para: " + numero);
	}

	

	public void exibirPagina(String url) {
		
		System.out.println("Site: " + url);
		System.out.println();
	}

	@Override
	public void adcionarNovaAba() {
		System.out.println("Navegador: ");
		System.out.println("Nova aba: ");
	}

	
	public void tocar() {
		System.out.println("Tocando Musica");		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String nome) {
		System.out.println("Reprodutor de musica: ");
		System.out.println("Musica selecioanda: " + nome);
	}



	@Override
	public void atender() {
		System.out.println("Recebendo ligação!");
		
	}



	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		System.out.println();
		
		
	}

}
