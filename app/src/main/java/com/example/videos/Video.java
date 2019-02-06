package com.example.videos;

public class Video {

    private int id;
    private String titulo;
    private String sipnosis;
    private String  trailler_url;
    private String  imnage;
    private String  rated;
    private String genero;


    // gette and Sette
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getTrailler_url() {
        return trailler_url;
    }

    public void setTrailler_url(String trailler_url) {
        this.trailler_url = trailler_url;
    }

    public String getImnage() {
        return imnage;
    }

    public void setImnage(String imnage) {
        this.imnage = imnage;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Metodos

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", sipnosis='" + sipnosis + '\'' +
                ", trailler_url='" + trailler_url + '\'' +
                ", imnage='" + imnage + '\'' +
                ", rated='" + rated + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
