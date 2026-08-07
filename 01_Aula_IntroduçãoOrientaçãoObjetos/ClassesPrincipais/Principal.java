import javax.swing.JOptionPane;

public class Principal 
{

	public static void main(String[] args) 
	{
		//Saldo
		double saldo = 12000.00;		
		
		//Menu para o usuário
		String opcao = JOptionPane.showInputDialog(
				   "Olá querido, Selecione uma das opções abaixo:"
			       + "\n 1) Saque"
			       + "\n 2) Depósito");
		
		//Verificando entrada do user
		if(opcao.equals("1")) 
		{
			//Valor para saque
			double valorSaque = Double.parseDouble(
							JOptionPane.showInputDialog(
							"Digite o valor do saque"));
			
			//Subtrair do saldo
			double resultado = saldo  - valorSaque;
			
			//Mostrando valor atual
			JOptionPane.showMessageDialog(null, 
					"Saldo atual é: R$" + resultado);
			
		}
		
		if(opcao.equals("2"))
		{
			//Valor para saque
			double valorDeposito = Double.parseDouble(
							JOptionPane.showInputDialog(
							"Digite o valor do depósito"));
			
			//Subtrair do saldo
			double resultado = saldo  + valorDeposito;
			
			//Mostrando valor atual
			JOptionPane.showMessageDialog(null, 
					"Saldo atual é: R$" + resultado);
		}
		
	}
}


