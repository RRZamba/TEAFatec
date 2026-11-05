 <?php
 	//Conectando com o server
    $con = mysqli_connect("localhost","root",
    			   "root","supervisoriofatec");

    //Verificando conexão
    if(!$con) 
    {
    	echo "Erro ao Conectar!!!";
    }

 ?>

