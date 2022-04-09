package AtividadePolimorfismo;

public abstract class BichoCaracteristica {

	private String tipoAnimal;
	
	public BichoCaracteristica(String tipoAnimal) 
	{
		this.tipoAnimal = tipoAnimal;
	}
	abstract public void nome (String nomeBicho);
	abstract public void idade (int idade);
	abstract public void tempoVida (int tempo);
	abstract public void emiteSom (String som);
	abstract public void locomove (String acao);
	
	public String getTipoAnimal() 
	{
	return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) 
	{
		this.tipoAnimal = tipoAnimal;
	}
}


