package com.atvdceu.demo_conversostempceu;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    // aqui converto de celsius para fahrenheit
    @GetMapping("/celsiustofahrenheit/{grau}")
    public String ctf(@PathVariable("grau") double grau) {
        double fahrenheit = (grau * 9/5) + 32;
        return grau + " ºC = " + fahrenheit + " ºF";
    }

    // get que faz o contrário, no caso, aqui é de fahrenheit para celsius
    @GetMapping("/fahrenheittocelsius/{grau}")
    public String ftc(@PathVariable("grau") double grau) {
        double celsius = (grau - 32) * 5/9;
        return grau + " ºF = " + celsius + " ºC";
    }
}

