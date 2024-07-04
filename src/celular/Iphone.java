package celular;

import aplicações.AparelhoTelefonico;
import aplicações.ReprodutorMusica;
import aplicações.SistemaOperacional;
import aplicações.NavegadorInternet;

public class Iphone extends SistemaOperacional {
	public static void main(String[] args) {
		Iphone ip = new Iphone();
		
		
		SistemaOperacional so = ip;
		
		
		ip.adcionarNovaAba();
		ip.exibirPagina("www.youtube.com.br");
		
		
		
		ip.ligar("5587-4575");
		ip.atender();
		ip.iniciarCorreioVoz();
	
		
		
		ip.selecionarMusica("Disasterpiece");
		ip.tocar();
		ip.pausar();
		
		
	}

	

}
