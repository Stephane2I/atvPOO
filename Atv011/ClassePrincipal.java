package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class ClassePrincipal {
    public static void main(String[] args) {
       Lampada obj1 = new Lampada(); 
        obj1.marca = "PHILIPS";
        obj1.cor = "Branco";
        obj1.preço = 10.0 ;
        obj1.pot = 120;
        obj1.Ligar();
        obj1.Iluminar();
        obj1.Desligar();
        obj1.ImpDados1();
        
       Televisao obj2 = new Televisao();
        obj2.marca = "Panasonic";
        obj2.modelo = "SmartTv";
        obj2.preço = 2500;
        obj2.tam = 45;
        obj2.Ligar();
        obj2.Transmitir();
        obj2.TrocarCanal();
        obj2.ImpDados2();
        
        
        Elevador obj3 = new Elevador();
         obj3.limite = 500;
         obj3.andar = 18;
         obj3.tipo = "Executivo";
         obj3.numfab = 8730573;
         obj3.Subir();
         obj3.Descer();
         obj3.Parar();
         obj3.ImpDados3();
         
        Cadeira obj4 = new Cadeira();
         obj4.tipo = "Gamer";
         obj4.marca = "Razer";
         obj4.cor = "Preto e rosa";
         obj4.tam = "Grande";
         obj4.RegularAltura();
         obj4.Inclinar();
         obj4.Girar();
         obj4.ImpDados4();
         
        Microondas obj5 = new Microondas();
         obj5.marca = "Electrolux";
         obj5.preço = 1000;
         obj5.cor = "Branco";
         obj5.loja = "Moveletro";
         obj5.Abrir();
         obj5.Ligar();
         obj5.EsquentarComida();
         obj5.ImpDados5();
         
        Aluno obj6 = new Aluno();
         obj6.nome = "Maria Stephane";
         obj6.idade = 16;
         obj6.escolaCurso = "EEEP Amélia Figueiredo de Lavor";
         obj6.serie = 2;
         obj6.FazerResumo();
         obj6.FazerAtividades();
         obj6.FazerProvas();
         obj6.ImpDados6();
                 
        DataShow obj7 = new DataShow();
         obj7.marca = "NEC";
         obj7.preço = 1000;
         obj7.cor = "Preto";
         obj7.tam = "Médio";
         obj7.Ligar();
         obj7.Transmitir();
         obj7.Desligar();
         obj7.ImpDados7();
    }  
}
