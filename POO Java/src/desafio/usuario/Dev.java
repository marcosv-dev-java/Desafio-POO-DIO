package desafio.usuario;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import desafio.conteudos.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    public void progedir(){
        Optional<Conteudo> conteudo =this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }
        else{
            System.out.println("\033[1;31mVocê não está matriculado em nenhum conteúdo!\033[m");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }
    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    
    
}
