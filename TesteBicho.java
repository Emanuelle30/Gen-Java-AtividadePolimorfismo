package AtividadePolimorfismo;

import java.util.Scanner;

public class TesteBicho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		BichoCaracteristica animal = null;
		
		int x=0;
		
		do
		{
			System.out.println("\nDigite a opção e escolha o tipo do seu bichinho?\n\n"
					+ "1-CACHORRO\n2-CAVALO\n3-PREGUIÇA");
			System.out.println("\n*****************************************************");
			x = leia.nextInt();
			
			if(x==1)
			{
				animal = cachorro;
				
				System.out.println("\nInforme o nome do seu cachorro: ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQuantos anos seu cachorro tem? ");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nVocê sabe quanto tempo vive um cachorro? ");
				int tempo = leia.nextInt();
				leia.nextLine();
				System.out.println("\nInforme o som que seu cachorro emite: ");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.tempoVida(tempo);
				cachorro.emiteSom(som);
			}
			else if(x==2)
			{
				animal = cavalo;
				
				System.out.println("\nInforme o nome do seu cavalo: ");
				String nomeBicho = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQuantos anos seu cavalo tem? ");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nVocê sabe quanto tempo vive um cavalo? ");
				int tempo = leia.nextInt();
				leia.nextLine();
				System.out.println("\nInforme o som que seu cavalo emite: ");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				cavalo.nome(nomeBicho);
				cavalo.idade(idade);
				cavalo.tempoVida(tempo);
				cavalo.emiteSom(som);
			}
			else if(x==3)
			{
				animal = preguica;
				
				System.out.println("\nInforme o nome da sua preguiça: ");
				String nomeBicho = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQuantos anos sua preguiça tem? ");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nVocê sabe quanto tempo vive uma preguiça? ");
				int tempo = leia.nextInt();
				leia.nextLine();
				System.out.println("\nInforme o som que sua preguiça emite: ");
				String som = leia.nextLine();
				System.out.println("\n*****************************************************");
				preguica.nome(nomeBicho);
				preguica.idade(idade);
				preguica.tempoVida(tempo);
				preguica.emiteSom(som);
			}
			else
			{
				System.out.println("\nOpção inválida!!!");
			}
		}
		while(x<=0 || x>=4);
	}
			
}


