package desafio;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Aprenda java do básico ao estágio!!");
        cursoJava.setCargaHoraria(40);
        System.out.println(cursoJava);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria da linguagem de progamação Java!!");

        System.out.println(mentoriaJava);
       



      
    }
    
}
