package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class DataShow {
    public String marca;
    public double preço;
    public String cor;
    public String tam;
    
    public void Ligar(){
        System.out.println("Ligou, hehe!");
    }
    public void Transmitir(){
        System.out.println("Transmitindo slides de P.O.O");
    }
    public void Desligar(){
        System.out.println("Desligou!");  
    }
    
    public void ImpDados7(){
        System.out.println("-A marca desse DataShow é: "+marca);
        System.out.println("-Este DataShow custa: "+preço);
        System.out.println("-A cor deste DataShow é: "+cor);
        System.out.println("-Este DataShow é do tamanh0: "+tam);
    }
}
