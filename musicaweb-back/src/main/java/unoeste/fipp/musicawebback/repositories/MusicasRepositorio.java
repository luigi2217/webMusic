package unoeste.fipp.musicawebback.repositories;
import org.springframework.stereotype.Repository;
import unoeste.fipp.musicawebback.entities.Musica;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import unoeste.fipp.musicawebback.entities.Genero;



@Repository

public class MusicasRepositorio {
    private List<Musica> musicaList = new ArrayList<>();
    private List<Genero> generoList = new ArrayList<>();

    public MusicasRepositorio() {
        carregarMusicas();
        carregarGeneros();
    }

    private void carregarMusicas() {
        musicaList.add(new Musica("Garota de Ipanema", "Tom Jobim", "MPB", "Getz/Gilberto", "1962"));
        musicaList.add(new Musica("Bohemian Rhapsody", "Queen", "Rock", "A Night at the Opera", "1975"));
        musicaList.add(new Musica("Hotel California", "Eagles", "Rock", "Hotel California", "1976"));
        musicaList.add(new Musica("Billie Jean", "Michael Jackson", "Pop", "Thriller", "1983"));
        musicaList.add(new Musica("Stairway to Heaven", "Led Zeppelin", "Rock", "Led Zeppelin IV", "1971"));
        musicaList.add(new Musica("One Love", "Bob Marley", "Reggae", "Exodus", "1977"));
        musicaList.add(new Musica("Lose Yourself", "Eminem", "Hip Hop", "8 Mile Soundtrack", "2002"));
        musicaList.add(new Musica("Shape of You", "Ed Sheeran", "Pop", "Divide", "2017"));
        musicaList.add(new Musica("Take Five", "Dave Brubeck", "Jazz", "Time Out", "1959"));
        musicaList.add(new Musica("Für Elise", "Beethoven", "Clássica", "Avulsa", "1810"));
    }

    private void carregarGeneros() {
        generoList.add(new Genero(1, "Pop"));
        generoList.add(new Genero(2, "Rock"));
        generoList.add(new Genero(3, "MPB"));
        generoList.add(new Genero(4, "Sertanejo"));
        generoList.add(new Genero(5, "Funk"));
        generoList.add(new Genero(6, "Reggae"));
        generoList.add(new Genero(7, "Hip Hop"));
        generoList.add(new Genero(8, "Jazz"));
        generoList.add(new Genero(9, "Clássica"));
        generoList.add(new Genero(10, "Eletrônica"));
    }

    public List<Musica> getMusicaList() {
        return musicaList;
    }

    public List<Genero> getGeneroList() {
        return generoList;
    }

    public boolean generoValido (String genero) {
        for (Genero g : generoList) {
            if(genero.equalsIgnoreCase(g.getGenero()))
                return true;
        }
        return false;
    }

    public boolean addMusica(Musica m) {
        return musicaList.add(m);
    }

    public boolean removeMusica(Musica m) {
        return musicaList.remove(m);
    }

    public List<Musica> getMusicaKeyword(String keyword) {
        List <Musica> resultado = new ArrayList<>();
        for (Musica m : musicaList) {
            if(m.getTitulo().toLowerCase().contains(keyword.toLowerCase()))
                resultado.add(m);
        }
        return resultado;
    }

    public Musica getMusicaAleatoria(){
        Random random = new Random();
        return musicaList.get(random.nextInt(musicaList.size()));
    }

    public Musica getMusicaTitulo(String titulo){
        for (Musica m : musicaList){
            if(titulo.equalsIgnoreCase(m.getTitulo())){
                return m;
            }
        }
        return null;
    }

    public List<Musica> getMusicaGenero (String genero){
        List<Musica> resultado = new ArrayList<>();
        for (Musica m : musicaList){
            if(genero.equalsIgnoreCase(m.getGenero())){
                resultado.add(m);
            }
        }
        return resultado;
    }

    public List<Musica> getAno (int dtInicio, int dtFim){
        List<Musica> resultado = new ArrayList<>();
        for(Musica m : musicaList){
            int ano = Integer.parseInt(m.getAno());
            if(ano >= dtInicio && ano <= dtFim)
                resultado.add(m);
        }
        return resultado;
    }


}
