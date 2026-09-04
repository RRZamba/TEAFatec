import java.io.FileWriter;

import javax.swing.JOptionPane;

public class ManipularArquivo 
{
	//Método salvarEquipamento
	public void salvarEquipamento(String codigo,
						String descricao, int qdt) 
	{
		try
		{
			//Classe para criar/abrir arquivo
			FileWriter arquivo = 
					new FileWriter("equipamentos.txt");
			
			//Escrevendo no arquivo 
			arquivo.write(codigo);
			arquivo.write(descricao);
			arquivo.write(qdt);
			
			//Fechando o arquivo 
			arquivo.close();			
		}
		catch(Exception erro) 
		{
			JOptionPane.showMessageDialog(null,
						"Erro ao Salvar!!! :( "
					 +  "Acionar o suporte!!!"
					 +   erro.getMessage());
		}
		
	}

}
