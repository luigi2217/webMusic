package unoeste.fipp.musicawebback.entities;

public class Musica {
    private String titulo;
    private String artista;
    private String genero;
    private String album;
    private String ano;

    public Musica(String titulo, String artista, String genero, String album, String ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.ano = ano;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getArtista() {return artista;}
    public void setArtista(String artista) {this.artista = artista;}

    public String getGenero(){return genero;}
    public void setGenero(String genero){this.genero = genero;}

    public String getAlbum(){return album;}
    public void setAlbum(String album){this.album = album;}

    public String getAno(){return ano;}
    public void setAno(String ano){this.ano = ano;}
}
