/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato gato01 = new Gato();
        gato01.setComida("Peixes");
        gato01.setHabitat("Cidades");
        gato01.setRaca("Persa");
        System.out.println("Gato:\n-Comida: "+gato01.getComida()+"\n-Habitat: "+gato01.getHabitat()+"\n-Raça: "+gato01.getRaca());
        gato01.makeNoise();
        
        
        Leao leao01 = new Leao();
        leao01.setComida("Antilopes");
        leao01.setHabitat("Savana");
        leao01.setOrigem("Africa");
        System.out.println("\n\nLeao:\n-Comida: "+leao01.getComida()+"\n-Habitat: "+leao01.getHabitat()+"\n-Origem: "+leao01.getOrigem());
        leao01.makeNoise();
        
        
        Tigre tigre01 = new Tigre();
        tigre01.setComida("Cervos");
        tigre01.setHabitat("Florestas");
        tigre01.setCor("Laranja");
        System.out.println("\n\nTigre:\n-Comida: "+tigre01.getComida()+"\n-Habitat: "+tigre01.getHabitat()+"\n-Cor: "+tigre01.getCor());
        tigre01.makeNoise();
        
        
        Lobo lobo01 = new Lobo();
        lobo01.setComida("Alces");
        lobo01.setHabitat("Montanhas");
        lobo01.setPeso(45.00);
        System.out.println("\n\nLobo:\n-Comida: "+lobo01.getComida()+"\n-Habitat: "+lobo01.getHabitat()+"\n-Peso: "+lobo01.getPeso());
        lobo01.makeNoise();
        
                
        Cao cao01 = new Cao();
        cao01.setComida("Ração");
        cao01.setHabitat("Cidades");
        cao01.setTamanho(1.5);
        System.out.println("\n\nCão:\n-Comida: "+cao01.getComida()+"\n-Habitat: "+cao01.getHabitat()+"\n-Tamanho: "+cao01.getTamanho());
        cao01.makeNoise();
    }
    
}
