package AtividadePolimorfismo;

public class Cavalo extends BichoCaracteristica {

	public Cavalo()
	{
		super("Tipo animal: Cavalo");
	}
	
	@Override
	public void nome(String nomeBicho)
	{
		System.out.println("\nNome do cavalo: "+nomeBicho);
	}
	
	@Override
	public void idade(int idade)
	{
		System.out.println("\nIdade: "+idade+" anos");
	}
	
	@Override
	public void tempoVida(int tempo)
	{
		System.out.println("\nO tempo de vida médio de um cavalo é: "+tempo+" anos");
	}
	
	@Override
	public void emiteSom(String som)
	{
		System.out.println("\nQual o som que o cavalo emite: "+som);
	}
	
	@Override
	public void locomove(String acao)
	{
		System.out.println("\nUma das formas do cavalo se locomover é correndo!");
	}
}



