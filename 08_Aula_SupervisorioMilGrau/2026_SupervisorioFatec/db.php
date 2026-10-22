<?php
    //Arquivo responsável por 
    //fazer a conexão com o DataBase  
    
    //Definindo Variáveis para a conexão
    $servidor = '127.0.0.1';
    $usuario = 'root';
    $banco = 'supervisorio_fatec';
    $senha = '';

    //Fazendo a conexão com o DB
    mysqli_connect($servidor,$usuario,$senha,$banco);


?>