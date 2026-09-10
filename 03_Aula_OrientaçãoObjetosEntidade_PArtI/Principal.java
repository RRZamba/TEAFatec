import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) 
	{		
		// 1) Pedindo dados para o usuário
		String codigo = JOptionPane.showInputDialog(
						"Digite o cod. do equipamento:");
		
		String descricao = JOptionPane.showInputDialog(
				 		  "Digite a descrição do equipamento");
		
		int quantidade = Integer.parseInt(
						JOptionPane.showInputDialog(
						"Digite a quantidade:"));
		
		
		//2) Montando a Entidade Equipamento
		Equipamento equip = 
				new Equipamento(codigo,descricao,quantidade);
				
		//3) Classe ManipularArquivo
		ManipularArquivo arquivo = new ManipularArquivo();
		arquivo.salvarEquipamento(equip);
		
		//4) Lendo o arquivo
		String equipamentos = arquivo.recuperarEquipamento();
		
		//5) Mostrando para o usuário
		JOptionPane.showMessageDialog(null, 
				      "EQUIPAMENTOS CADASTRADOS: \n \n" + equipamentos);
				
	}

}
