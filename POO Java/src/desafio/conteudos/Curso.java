package desafio.conteudos;

public class Curso extends Conteudo{
    private double cargaHoraria;




    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO * this.cargaHoraria;
    }


    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso( double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }
    

}
