package br.com.senai.modelo;

public class Jogador {

    private String nome;
    private String email;
    private double pontuacao;
    private String horadia;
    
    public Jogador(String nome, String email, double pontuacao, String horadia) {
        this.nome = nome;
        this.email = email;
        this.pontuacao = pontuacao;
        this.horadia = horadia;
    }

    public String getHoradia() {
        return horadia;
    }

    public void setHoradia(String horadia) {
        this.horadia = horadia;
    }
    
    

    public Jogador(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontuacao = 0;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

}
