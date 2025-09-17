package Model;

import java.util.Scanner;

public class PetEndereco {
    private int numeroCasa;
    private String cidade;
    private String rua;


    public  PetEndereco (){

    }
    public PetEndereco(String cidade, String rua) {
        this.numeroCasa = validnumeroCasa();
        if (validCidade(cidade) == true) {
            this.cidade = cidade;
            this.rua = rua;
        }
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public boolean validCidade(String cidade) {
          if (cidade.matches("^[a-zA-Z]*$")) {
              return true;
          } else {
              System.out.println("Cidade invalida");
              return false;
          }
    }

    public int validnumeroCasa() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numero da casa");
            if (sc.hasNextInt()) {
                int numeroCasa = sc.nextInt();
                return numeroCasa;
            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }
        }
    }
}

