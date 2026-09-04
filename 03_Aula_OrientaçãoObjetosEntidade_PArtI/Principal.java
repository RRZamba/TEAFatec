import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) 
	{
		//Pedindo dados para o usuário
		String codigo = JOptionPane.showInputDialog(
						"Digite o cod. do equipamento:");
		
		String descricao = JOptionPane.showInputDialog(
				 		  "Digite a descrição do equipamento");
		
		int quantidade = Integer.parseInt(
						JOptionPane.showInputDialog(
						"Digite a quantidade:"));
		
		//Classe ManipularArquivo
		ManipularArquivo arquivo = new ManipularArquivo();
		arquivo.salvarEquipamento(codigo, descricao, quantidade);
		
	}

}
