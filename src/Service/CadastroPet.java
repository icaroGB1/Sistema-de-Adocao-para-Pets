package Service;

import FileUtils.Arq;
import Model.Pet;
import Model.PetEndereco;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroPet {
    private final static File file =  new File("C:\\Users\\ICARO\\OneDrive\\Área de Trabalho\\Sistema-de-Adocao-para-Pets\\formulario.txt");
    public void CadastroPet (){
        Pet pet = new Pet();
        PetEndereco petE = new PetEndereco();
        int cont =0;
        try(BufferedReader br =  new BufferedReader(new FileReader(file))){
            String linha;
            Scanner sc = new Scanner(System.in);
            while((linha =br.readLine()) !=  null ){
                cont ++;
                System.out.println(linha);
                switch (cont){
                    case 1:
                        String nome =  sc.nextLine();
                        pet.setNome(nome);
                        break;
                    case 2:
                        int tipoPet = sc.nextInt();
                        pet.setTipoPet(tipoPet);
                        break;
                    case 3:
                        int sexoPet = sc.nextInt();
                        pet.setSexoPet(sexoPet);
                        break;
                    case 4:
                        petE.setNumeroCasa();
                        sc.nextLine();
                        System.out.println("Cidade");
                        String cidade = sc.nextLine();
                        petE.setCidade(cidade);
                        System.out.println("Rua");
                        String Rua = sc.nextLine();
                        petE.setRua(Rua);
                        break;
                    case 5:
                        String idade = sc.nextLine();
                        pet.setIdade(idade);
                        break;
                    case 6:
                        String entrada = sc.nextLine();
                        pet.setPeso(entrada);
                        break;
                    case 7:
                        String raca = sc.nextLine();
                        pet.setRaca(raca);
                        break;
                    default:
                        break;
                }
            }
            File nomeArq = createFile(pet.getNome());
           try(BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArq, true))) {
               bw.write("1- " + pet.getNome());
               bw.newLine();
               bw.write("2- " + String.valueOf(pet.getTipoPet()));
               bw.newLine();
               bw.write("3- " + String.valueOf(pet.getSexoPet()));
               bw.newLine();
               bw.write("4- " + petE.getNumeroCasa() + ", " + petE.getCidade() + ", " + petE.getRua());
               bw.newLine();
               bw.write("5- " +pet.getIdade());
               bw.newLine();
               bw.write("6- " + pet.getPeso());
               bw.newLine();
               bw.write("7- " + pet.getRaca());
           }
           }
           catch (IOException e){
            e.printStackTrace();
            System.err.println("Erro ao ler arquivo"  + e.getMessage());
        }catch (IllegalArgumentException e ){
            e.printStackTrace();
            System.err.println("Entra errada "  + e.getMessage());
        }
    }
    public File createFile (String nome) throws IOException {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmm");
        String dataFormatada = agora.format(formatter);
        File pasta = new File("C:\\Users\\ICARO\\OneDrive\\Área de Trabalho\\Sistema-de-Adocao-para-Pets\\petsCadastrados");
        if (!pasta.exists()) {
            pasta.mkdirs();
        }
        String nomeFilter = dataFormatada + nome;
        File nomeArq = new File(pasta + "\\" + nomeFilter + ".txt");
        nomeArq.createNewFile();
        return nomeArq;
    }
}
