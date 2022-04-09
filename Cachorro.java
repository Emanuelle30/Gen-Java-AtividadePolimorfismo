package AtividadePolimorfismo;

public class Cachorro extends BichoCaracteristica{
	
	public Cachorro()
	{
		super("Tipo animal: Cachorro");
	}
	
	@Override
	public void nome(String nomeBicho)
	{
		System.out.println("\nNome do cachorro: "+nomeBicho);
	}
	
	@Override
	public void idade(int idade)
	{
		System.out.println("\nIdade: "+idade+" anos");
	}
	
	@Override
	public void tempoVida(int tempo)
	{
		System.out.println("\nO tempo de vida médio de um cachorro é: "+tempo+" anos");
	}
	
	@Override
	public void emiteSom(String som)
	{
		System.out.println("\nQual o som que o cachorro emite: "+som);
	}
	
	@Override
	public void locomove(String acao)
	{
		System.out.println("\nUma das formas do cachorro se locomover é correndo!");
	}
	
}



