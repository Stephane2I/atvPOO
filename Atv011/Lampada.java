package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class Lampada {
   public String marca;
   public String cor;
   public double preço;
   public int pot;
   
   public void Ligar(){
       System.out.println("----------LÂMPADA----------");
       System.out.println("Nheu!!!");
   }
   public void Desligar(){
       System.out.println("Socorro Deus!!!");
   }
   public void Iluminar(){
       System.out.println("A gente vai viver!!!");
   }
   
   public void ImpDados1(){
       System.out.println("-Sua marca é: "+marca);
       System.out.println("-Sua cor é: "+cor);
       System.out.println("-Seu preço é: "+preço);
       System.out.println("-Sua potência é: "+pot);  
   }
}


