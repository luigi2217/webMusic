package unoeste.fipp.musicawebback.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
