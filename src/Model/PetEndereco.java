package Model;

import java.util.Scanner;

public class PetEndereco {
    private int numeroCasa;
    private String cidade;
    private String rua;

    public static final String naoInformado   = "NÃO INFORMADO";

    public  PetEndereco (){

    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa() {
        this.numeroCasa = validnumeroCasa();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = validCidade(cidade);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String validCidade(String cidade) {
          if (cidade.matches("^[a-zA-Z]*$")) {
              return cidade;
          } else {
              System.out.println("Cidade invalida");
              return naoInformado;
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

