package unoeste.fipp.musicawebback.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unoeste.fipp.musicawebback.entities.Erro;
import unoeste.fipp.musicawebback.entities.Musica;
import unoeste.fipp.musicawebback.repositories.MusicasRepositorio;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("apis")

public class MusicasRestController {

    @Autowired
    private MusicasRepositorio musicasRepositorio;

    @GetMapping("test")
    public ResponseEntity<Object> test(){
        return ResponseEntity.ok("");
    }

    @GetMapping(value = "random-musica")
    public ResponseEntity<Object> musicRandom(){

        return ResponseEntity.ok(musicasRepositorio.getMusicaAleatoria());
    }

    @GetMapping(value = "list-musicas")
    public ResponseEntity<Object> allMusicas(){
        return ResponseEntity.ok(musicasRepositorio.getMusicaList());
    }

    @GetMapping(value = "get-musica")
    public ResponseEntity<Object> getMusica(@RequestParam(value = "titulo")String titulo){
        Musica musica = musicasRepositorio.getMusicaTitulo(titulo);
        if (musica != null)
            return ResponseEntity.ok(musica);
        return ResponseEntity.badRequest().body(new Erro("Música não encontrada!"));
    }

    @GetMapping(value = "get-musica/{titulo}")
    public ResponseEntity<Object> getMusicaPath(@PathVariable String titulo){
        return getMusica(titulo);
    }

    @GetMapping (value = "list-genre/{genero}")
    public ResponseEntity<Object> getMusicaGenre(@PathVariable String genero){
        List<Musica> musicas = musicasRepositorio.getMusicaGenero(genero);
        if (musicas.isEmpty())
            return ResponseEntity.badRequest().body(new Erro("Nenhuma musica encontrada nesse genero!"));
        return ResponseEntity.ok(musicas);
    }

    @GetMapping(value = "list-year/{dtInicio}/{dtFim}")
    public ResponseEntity<Object> getMusicaYear(@PathVariable int dtInicio, @PathVariable int dtFim){
        List<Musica> musicas = musicasRepositorio.getAno(dtInicio, dtFim);
        if(musicas.isEmpty())
            return ResponseEntity.badRequest().body(new Erro ("Nnehuma musica neste periodo!"));
        return ResponseEntity.ok(musicas);
    }

    @GetMapping (value = "get-generos")
    public ResponseEntity<Object> getGeneros(){
        return ResponseEntity.ok(musicasRepositorio.getGeneroList());
    }

    @GetMapping (value = "list-keyword/{keyword}")
    public ResponseEntity <Object> getMusicaKeyword(@PathVariable String keyword){
        List<Musica> musicas = musicasRepositorio.getMusicaKeyword(keyword);
        return ResponseEntity.ok(musicas);
    }

    @PostMapping(value = "add-musica")
    public ResponseEntity<Object> addMusica(@RequestBody Musica novaMusica){
        if (novaMusica == null)
            return ResponseEntity.badRequest().body(new Erro("Problemas ao adicionar a música"));
        if (novaMusica.getTitulo() == null || novaMusica.getTitulo().trim().isEmpty())
            return ResponseEntity.badRequest().body(new Erro("O título é obrigatório"));
        if (novaMusica.getArtista() == null || novaMusica.getArtista().trim().isEmpty())
            return ResponseEntity.badRequest().body(new Erro("O artista é obrigatório"));
        if (novaMusica.getGenero() == null || novaMusica.getGenero().trim().isEmpty())
            return ResponseEntity.badRequest().body(new Erro("O gênero é obrigatório"));
        if (!musicasRepositorio.generoValido(novaMusica.getGenero()))
            return ResponseEntity.badRequest().body(new Erro("Gênero inválido"));
        if (novaMusica.getAno() == null || novaMusica.getAno().trim().isEmpty())
            return ResponseEntity.badRequest().body(new Erro("O ano é obrigatório"));
        try{
            Integer.parseInt(novaMusica.getAno());
        }catch (NumberFormatException e){
            return ResponseEntity.badRequest().body(new Erro("O ano deve ser numérico!"));
        }
        musicasRepositorio.addMusica(novaMusica);
        return ResponseEntity.ok(novaMusica);
    }

}
