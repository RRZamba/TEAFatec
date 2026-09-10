import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ManipularArquivo 
{
	//Método salvarEquipamento
	public void salvarEquipamento(Equipamento equip) 
	{
		try
		{
			//Classe para criar/abrir arquivo
			FileWriter arquivo = new FileWriter("equipamentos.txt");
			
			//Classe para escrever no arquivo
			PrintWriter escrita = new PrintWriter(arquivo);
			
			//Escrevendo no arquivo
			escrita.println(equip);
			
			//Fechando o arquivo 
			escrita.close();
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
	
	//Método para leitura
	public String recuperarEquipamento()
	{
		//Var. para receber as linhas
		String resultado = "";
		
		try
		{
			//Abrindo o arquivo para leitura
			FileReader arquivo = new FileReader("equipamentos.txt");
			
			//Recuperando as linhas do arquivo
			BufferedReader leitura = new BufferedReader(arquivo);
			
			
			//Enquanto houver linha... percorre o laço
			String linha;
			while((linha = leitura.readLine()) != null)
			{
				//Salvando linha a linha 
				resultado = resultado + linha + "\n";
			}
			
			//Fechando o arquivo
			arquivo.close();
			leitura.close();		
		}
		catch (Exception e) 
		{
			resultado = "Arquivo com problema!!! :(";
		}
		
		//Retornando valor
		return resultado;
	}
	
	

}




