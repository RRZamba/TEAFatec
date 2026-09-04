	//Entidade - Responsável por 
	//manipular e manter dos campos da classe
	//Equipamento    :)

public class Equipamento 
{
	//Atributos
	String codigo;
	String descricao;
	int quantidade;
	
	//Método Construtor
	public Equipamento(String codigo, String descricao, int quantidade) 
	{
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	//Método toString
	@Override
	public String toString() 
	{
		return "Equipamento [codigo=" + codigo + ", descricao=" + descricao + ", quantidade=" + quantidade + "]";
	}
	
	
	
	
	
	
	
	
	

}
