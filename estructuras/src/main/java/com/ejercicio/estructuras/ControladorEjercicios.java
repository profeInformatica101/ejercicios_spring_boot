package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ControladorEjercicios {
    
    @PostMapping("/parImpar")
    public String ejercicio1(@RequestParam int numero) {
        boolean esPar = numero % 2 == 0;
        return esPar ? "<h2>Es par</h2>" : "<h2>Es impar</h2>";
    }

    @PostMapping("/tablaMultiplicar")
    public String ejercicio2(@RequestParam int numero) {
        StringBuilder res = new StringBuilder();
        res.append("<ul>");

        for (int i = 1; i <= 10; i++) {
            res.append("<li>" + numero + " x " + i + " = " + (i * numero) + "</l1>");
        }

        res.append("</ul>");

        return res.toString();
    }
    
}
