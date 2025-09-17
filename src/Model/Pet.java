package Model;

import java.util.Scanner;

public class Pet {
    private String nome;
    private TipoPet tipoPet;
    private SexoPet sexoPet;
    private int idade;
    private double peso;
    private String raca;


    public static final String naoInformado   = "NÃO INFORMADO";


    public void setNome (String nome){
        try{
            if(nome.isEmpty() || nome.matches("^\\p{L}+$") == false){
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

    public TipoPet setTipoPet (int escolha){
        Scanner sc = new Scanner(System.in);
        if(escolha == 1){
            return this.tipoPet = TipoPet.CACHORRO;
        }
        else if(escolha ==2){
            return this.tipoPet = tipoPet.GATO;
        }
        while(escolha != 1 || escolha != 2){
            System.out.println("Escolha feita errado solicito que faça a escolha novamente  - 1 - Cachorro 2 - gato");
            escolha = sc.nextInt();
            if(escolha == 1){
                return this.tipoPet = TipoPet.CACHORRO;
            }
            else if(escolha ==2){
                return this.tipoPet = tipoPet.GATO;
            }
        }
        return null;
    }

    public TipoPet getTipoPet(){
        return this.tipoPet;
    }

    public SexoPet setSexoPet(int escolha){
        Scanner sc = new Scanner(System.in);
        if(escolha == 1){
            return this.sexoPet = SexoPet.MACHO;
        }
        else if(escolha ==2){
            return this.sexoPet = SexoPet.FEMEA;
        }
        while(escolha != 1 || escolha != 2){
            System.out.println("Escolha feita errado solicito que faça a escolha novamente  - 1 - MACHO 2 - FEMEA");
            escolha = sc.nextInt();
            if(escolha == 1){
                return this.sexoPet = SexoPet.MACHO;
            }
            else if(escolha ==2){
                return this.sexoPet = SexoPet.FEMEA;
            }
        }
        return null;
    }

    public SexoPet getSexoPet(){
        return sexoPet;
    }



}
