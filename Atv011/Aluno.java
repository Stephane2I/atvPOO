package Atv011;
// Aluna: MARIA STEPHANE RODRIGUES DE QUEIROZ
// Turma: 2º ano de Informática

public class Aluno {
    public String nome;
    public int idade;
    public String escolaCurso;
    public int serie;
    
    public void FazerResumo(){
        System.out.println("Resumos dos conteúdos estudados, check!");
    }
    public void FazerAtividades(){
        System.out.println("Hmm... Uns TDs de Vicentinho");
    }
    public void FazerProvas(){
        System.out.println("Provas práticas: SOCORRO, DEUS!");
    }
    
    public void ImpDados6(){
        System.out.println("-A aluna se chama: "+nome);
        System.out.println("-A aluna tem: "+idade);
        System.out.println("-Sua escola e curso são, resspectivamente: "+escolaCurso);
        System.out.println("-A aluna está cursando o: "+serie+" ano de Informática");
    }          
}
