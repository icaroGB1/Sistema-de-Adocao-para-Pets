package Model;

import Exception.IdadeMaior20Exception;
import Exception.PesoException;
import java.util.Scanner;

public class Pet {
    private String nome;
    private TipoPet tipoPet;
    private SexoPet sexoPet;
    private PetEndereco petEndereco;
    private String idade;
    private String peso;
    private String raca;


    public static final String naoInformado   = "NÃO INFORMADO";


    public void setNome (String nome){
        try{
            if(nome.isEmpty() || nome.matches("^[a-zA-Z]+$") == false){
                this.nome = naoInformado;
            }
            else{
                this.nome =  nome;
            }

        }catch(IllegalArgumentException e ){
            e.printStackTrace();
            System.out.println("Erro ao atribuir o nome" + e.getMessage());
            this.nome = naoInformado;
        }catch(NullPointerException e){
            this.nome = naoInformado;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipoPet (int escolha){
        Scanner sc = new Scanner(System.in);
        if(escolha == 1){
            this.tipoPet = TipoPet.CACHORRO;
        }
        else if(escolha ==2){
           this.tipoPet = TipoPet.GATO;
        }else{
        while(escolha != 1 || escolha != 2){
            System.out.println("Escolha feita errado solicito que faça a escolha novamente  - 1 - Cachorro 2 - gato");
            escolha = sc.nextInt();
            if(escolha == 1){
                this.tipoPet = TipoPet.CACHORRO;
            }
            else if(escolha ==2){
                this.tipoPet = TipoPet.GATO;
            }
        }
    }
        
    }

    public TipoPet getTipoPet(){
        return this.tipoPet;
    }

    public void setSexoPet(int escolha){
        if(escolha == 1){
             this.sexoPet = SexoPet.MACHO;
        }
        else if(escolha ==2){
             this.sexoPet = SexoPet.FEMEA;
        }else {
            while (escolha != 1 || escolha != 2) {
                System.out.println("Escolha feita errado solicito que faça a escolha novamente  - 1 - MACHO 2 - FEMEA");
                if (escolha == 1) {
                    this.sexoPet = SexoPet.MACHO;
                } else if (escolha == 2) {
                    this.sexoPet = SexoPet.FEMEA;
                }
            }
        }
    }

    public SexoPet getSexoPet(){
        return this.sexoPet;
    }
    
    public void setIdade(String idade){
    try{
       if(idade.isEmpty() || idade.matches("^\\d+([.,]\\d+)?$") == false){
        this.idade = naoInformado;
        System.out.println("Idade informada errada");
       }
        idade = idade.replace(",", ".");
         double idadeDigitada = Double.parseDouble(idade);
       if(idadeDigitada <= 0.0 || idadeDigitada > 20.0){
            this.idade = naoInformado;
            throw new IdadeMaior20Exception("Idade Maior que 20 ou menor que 0");
        }
        if(idadeDigitada >=0.01 && idadeDigitada<=0.12){
            String idademeses = (idade +  " meses");
            this.idade = idademeses;
           
        }
        this.idade = idade;
    }
    catch(IllegalArgumentException e){
        this.idade = naoInformado;
        }
    }

    public String getIdade(){
        return this.idade;
    }

    public void setPeso(String peso){
        if(peso.isEmpty() || peso.matches("^\\d+([.,]\\d+)?$") == false){
        this.peso = naoInformado;
        System.out.println("peso informado errado");
       }
        peso = peso.replace(",", ".");
        double pesoDigitada = Double.parseDouble(peso);
        if (pesoDigitada<= 0.5 || pesoDigitada > 60.0){
        this.peso = naoInformado;
        throw new  PesoException ("Peso Menor que 0.5 ou maior que 60.0");
       }
       this.peso = peso;
    }

    public String  getPeso(){
        return this.peso;
    }

    public void setRaca (String raca){
        raca = raca.toUpperCase();
        if(raca.matches("^[a-zA-Z]+$")){
            this.raca = raca;
        }else{
            this.raca = naoInformado;
        }
    }
    public String getRaca (){
        return this.raca;
    }

    public PetEndereco getPetEndereco() {
        return petEndereco;
    }

    public void setPetEndereco(PetEndereco petEndereco) {
        this.petEndereco = petEndereco;
    }
}
