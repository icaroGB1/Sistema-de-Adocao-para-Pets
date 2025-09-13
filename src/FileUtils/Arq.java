package FileUtils;

import java.io.*;

public class Arq {
    private final static File file =  new File("C:\\Users\\ICARO\\OneDrive\\Área de Trabalho\\Sistema-de-Adocao-para-Pets\\formulario.txt");

    public  Arq (){
        if(file.exists()){
            return;
        }else {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()))){
                bw.write("1 - Qual o nome e sobrenome do pet?\n2 - Qual o tipo do pet (Cachorro/Gato)?\n" +
                        "3 - Qual o sexo do animal?\n4 - Qual endereço e bairro que ele foi encontrado?\n" +
                        "5 - Qual a idade aproximada do pet?\n6 - Qual o peso aproximado do pet?\n" +
                        "7 - Qual a raça do pet?");
            }catch (IOException e ){
                e.printStackTrace();
                System.err.println("Erro no Construtor"  + e.getMessage());
            }
        }
    }
    public  void lerArquivo (){
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String linha;
            while ((linha= br.readLine()) != null){
                System.out.println(linha);
            }

        }catch (IOException e ){
            e.printStackTrace();
            System.err.println("Erro ao ler arquivo"  + e.getMessage());
        }
    }
}
