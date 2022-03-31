package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class Cadeira {
    public String tipo;
    public String marca;
    public String cor;
    public String tam;
    
    public void RegularAltura(){
        System.out.println("----------CADEIRA----------");
        System.out.println("Sobe e desce!");
    }
    public void Inclinar(){
        System.out.println("Deitando para trás...");
    }
    public void Girar(){
        System.out.println("WIIIIIII!!!");
    }
    
    public void ImpDados4(){
        System.out.println("-Esta cadeira é do tipo: "+tipo);
        System.out.println("-Esta cadeira é da marca: "+marca);
        System.out.println("-Suas cores são: "+cor);
        System.out.println("-Esta cadeira é do tamanho: "+tam);
    }
}
