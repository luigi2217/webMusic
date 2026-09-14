package unoeste.fipp.musicawebback.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
