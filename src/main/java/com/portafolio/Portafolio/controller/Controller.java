
package com.portafolio.Portafolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "HOLA MUNDO"+ nombre;
    }
    
}
