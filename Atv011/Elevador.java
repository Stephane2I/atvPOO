package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class Elevador {
    public int limite;
    public int andar;
    public String tipo;
    public double numfab;
    
    public void Subir(){
        System.out.println("----------ELEVADOR----------");
        System.out.println("O céu é o limite...");
    }
    public void Descer(){
        System.out.println("O buraco é mais embaixo...");
    }
    public void Parar(){
        System.out.println("Pediu pra parar, parou!");
    }
    
    public void ImpDados3(){
        System.out.println("-Seu limite de peso é, em Kg: "+limite);
        System.out.println("-Este elevador sobe/desce até: "+andar+" andares");
        System.out.println("-Este elevador é do tipo: "+tipo);
        System.out.println("-Seu número de fabricação é: "+numfab);  
    } 
}
