package com.br.cadastrei.primeiro_teste;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testes")
public class Controller {

    private final List<Integer> numeros = new ArrayList<>();

    @GetMapping()
    public String hello(){
        return "Hello World";
    }


    @PostMapping
    public void adicionaNumero(){
        numeros.add(1);
    }

    @GetMapping("/lista")
    public List<Integer> retornaNumeros(){        
        return numeros;
    }

    @DeleteMapping()
    public void removeNumero(){
        
        if(numeros.isEmpty()) {
            
        } else {
            numeros.remove(numeros.indexOf(numeros.get(numeros.size() -1)));
        }
    }
}
