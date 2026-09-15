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

}
