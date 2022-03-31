package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class Televisao {
    public String marca;
    public String modelo;
    public double preço;
    public double tam;
    
    public void Ligar(){
        System.out.println("----------TELEVISÃO---------");
        System.out.println("Ligou!");
    }
    public void Transmitir(){
        System.out.println("Transmite canais e programas.");
    }
    public void TrocarCanal(){
        System.out.println("Tchau, Sílvio! Olá, Boninho!");
    }

    public void ImpDados2(){
        System.out.println("-Sua marca é: "+marca);
        System.out.println("-Seu modelo é: "+modelo);
        System.out.println("-Seu preço é: "+preço);
        System.out.println("-Seu tamanho é: "+tam+"polegadas.");
    }
}
