package AtividadePolimorfismo;

public class Preguica extends BichoCaracteristica{
	
	public Preguica()
	{
		super("Tipo animal: Pregui�a");
	}
	
	@Override
	public void nome(String nomeBicho)
	{
		System.out.println("\nNome da pregui�a: "+nomeBicho);
	}
	
	@Override
	public void idade(int idade)
	{
		System.out.println("\nIdade: "+idade+" anos");
	}
	
	@Override
	public void tempoVida(int tempo)
	{
		System.out.println("\nO tempo de vida m�dio de uma pregui�a �: "+tempo+" anos");
	}
	
	@Override
	public void emiteSom(String som)
	{
		System.out.println("\nQual o som que a pregui�a emite: "+som);
	}
	
	@Override
	public void locomove(String acao)
	{
		System.out.println("\nUma das formas da pregui�a se locomover � subindo em �rvores!");
	}
}






