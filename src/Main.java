import FileUtils.Arq;
import Service.Menu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(String.valueOf(10));
        Arq arq = new Arq();
        arq.lerArquivo();
        System.out.println();
        Menu menu = new Menu();
        menu.opcoesMenu();
    }
}