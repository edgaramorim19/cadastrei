package com.br.cadastrei.primeiro_teste;

import org.antlr.v4.runtime.misc.Pair;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class Controller {

    private final Map<Pair<String, String>, Usuario> usuarios = new HashMap<>();

    @PostMapping
    public Usuario cadastraUsuario(@RequestBody Usuario usuario) {
        Pair<String, String> emailSenha = new Pair<>(usuario.email(), usuario.senha());
        usuarios.put(emailSenha, usuario);
        return usuario;
    }

    @GetMapping
    public Map<Pair<String, String>, Usuario> listaUsuarios() {
        return usuarios;
    }
}