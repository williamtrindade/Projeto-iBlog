package model;

import java.util.ArrayList;

public class Usuario {
    
    //atributos
    private String nome;
    private String usuario;
    private String senha;
    private final ArrayList<Video> videosCompartilhados = new ArrayList();
    private final ArrayList<Artigo> artigosCompartilhados = new ArrayList();

    //construtores
    public Usuario(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    //metodos
    public void compartilhar(Video video) {
        System.out.println("Video: " + video.getTitulo() + " Compartilhado no seu Perfil! ");
    }
    
    public void compartilhar(Artigo artigo) {
        System.out.println("Aritgo: " + artigo.getTitulo() + " Compartilhado no seu Perfil! ");
    }
    
    public void addCompartilhados(Video video) {
        this.videosCompartilhados.add(video);
    }
    
    public void addCompartilhados(Artigo artigo) {
        this.artigosCompartilhados.add(artigo);
    }
    
    //gets - sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Artigo> getArtigosCompartilhados() {
        return artigosCompartilhados;
    }

    public ArrayList<Video> getVideosCompartilhados() {
        return videosCompartilhados;
    }

    
}
