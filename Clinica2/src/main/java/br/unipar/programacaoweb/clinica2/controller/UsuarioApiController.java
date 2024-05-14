package br.unipar.programacaoweb.clinica2.controller;

import br.unipar.programacaoweb.clinica2.model.Usuario;
import br.unipar.programacaoweb.clinica2.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class UsuarioApiController {

    private final UsuarioService usuarioService;

    public UsuarioApiController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(path = "/api/usuarios")
    public ResponseEntity<List<Usuario>> getAll() {
        return ResponseEntity.ok(usuarioService.getAll());
    }

    @PostMapping(path = "/api/usuarios")
    public ResponseEntity<Usuario> save(Usuario usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

}
