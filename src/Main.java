import Exception.IdadeMaior20Exception;
import Model.Pet;
import Service.CadastroPet;

import java.io.IOException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IdadeMaior20Exception, IOException {
        Scanner sc = new Scanner(System.in);
        CadastroPet cadPet = new CadastroPet();
        cadPet.CadastroPet();
    }
}