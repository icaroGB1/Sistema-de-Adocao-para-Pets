package Service;

import Model.Pet;
import Model.PetEndereco;
import Model.TipoDoPet;

public class PetService {
    private Pet pet;
    private PetEndereco endereco;

    public void cadastroPet (String nome, String tipoDoPet, String sexoPet, int idade, double peso, String raca){
        try {
            pet = new Pet();
            pet.setNome(nome);
            pet.setTipoDoPet(tipoDoPet);
            pet.validSexoPet(sexoPet);
            endereco = new PetEndereco();
            pet.setIdade(idade);
            pet.setPeso(peso);
            pet.setRaca(raca);
        }catch (IllegalArgumentException e ){
            e.printStackTrace();
            System.out.println("Entrada invalida " + e.getMessage());
        }
    }
}
