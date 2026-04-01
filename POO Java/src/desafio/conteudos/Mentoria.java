package desafio.conteudos;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    
    
    public Mentoria() {
        this.data = LocalDate.now();
    }


    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20d;
    }


    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
    }




    

    

    
}
