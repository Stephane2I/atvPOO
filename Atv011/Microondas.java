package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class Microondas {
    public String marca;
    public double preço;
    public String cor;
    public String loja;
    
    public void Abrir(){
        System.out.println("----------MICROONDAS----------");
        System.out.println("Abriu!");
    }
    public void Ligar(){
        System.out.println("Ligou!");
    }
    public void EsquentarComida(){
        System.out.println("Hmmm... comidinha");
    }
    
    public void ImpDados5(){
        System.out.println("-A marca dess microondas é: "+marca);
        System.out.println("-Este microondas custa: "+preço+" reais");
        System.out.println("-Sua cor é: "+cor);
        System.out.println("-Este microondas foi comprado na loja: "+loja);
    }    
}
