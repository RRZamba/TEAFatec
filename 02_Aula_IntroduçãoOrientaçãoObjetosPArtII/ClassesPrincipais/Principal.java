import javax.swing.JOptionPane;


public class Principal 
{

	public static void main(String[] args) 
	{
		// 1) Instanciando a classe Caixa
		Caixa cx = new Caixa();
		
		//2) Valor para saque
		double valorSaque = Double.parseDouble(
					JOptionPane.showInputDialog(
						"Digite o valor do saque"));
		
		//3) Mostrando valor atual
		JOptionPane.showMessageDialog(null, 
				"Saldo atual é: R$" + cx.Saque(valorSaque));
		
		//Menu pro usuário
		String opcao = JOptionPane.showInputDialog("Olá, divo!!! "
						  + "Escolha uma das opções abaixo:"
						  + "[A] - Saque"
						  + "[B] - Depósito"
						  + "[C] - Mostrar Saldo"
						  + "[D] - Sair");
		
		//Validando a opcao
		switch(opcao) 
		{
		  case "A": 
		  {
			//Saque
			break;
		  }
		  case "B": 
		  {
			//Depósito
			break;
		  }	
		  case "C": 
		  {
			//Mostrar Saldo
			break;
		  }
		  case "D": 
		  {
			//Sair
			break;
		  }
		  
		  default:
			
			  break;
		}
		
		
		
		
		
		
		
	}
}

