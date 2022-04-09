package AtividadePolimorfismo;

public class Preguica extends BichoCaracteristica{
	
	public Preguica()
	{
		super("Tipo animal: Preguiça");
	}
	
	@Override
	public void nome(String nomeBicho)
	{
		System.out.println("\nNome da preguiça: "+nomeBicho);
	}
	
	@Override
	public void idade(int idade)
	{
		System.out.println("\nIdade: "+idade+" anos");
	}
	
	@Override
	public void tempoVida(int tempo)
	{
		System.out.println("\nO tempo de vida médio de uma preguiça é: "+tempo+" anos");
	}
	
	@Override
	public void emiteSom(String som)
	{
		System.out.println("\nQual o som que a preguiça emite: "+som);
	}
	
	@Override
	public void locomove(String acao)
	{
		System.out.println("\nUma das formas da preguiça se locomover é subindo em árvores!");
	}
}






