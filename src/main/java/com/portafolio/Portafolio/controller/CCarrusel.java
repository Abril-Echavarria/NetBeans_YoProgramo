
package com.portafolio.Portafolio.controller;

import com.portafolio.Portafolio.entity.Carrusel;
import com.portafolio.Portafolio.service.SCarrusel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("carrusel")
@CrossOrigin(origins="http://localhost:4200/")
public class CCarrusel {
    
    @Autowired
    SCarrusel carruselServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Carrusel> verCarrusel(){
        return carruselServ.varCarrusel();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Carrusel verCarrusel(@PathVariable int id){
        return carruselServ.buscarCarrusel(id);
    }
    
    @PostMapping ("/crear")
    public String agregarCarrusel (@RequestBody Carrusel carrusel){
        carruselServ.crearCarrusel(carrusel);
        return "La imagen del carrusel fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarCarrusel(@PathVariable int id){
        carruselServ.borrarCarrusel(id);
    return "La imagen del carrusel fue borrada correctamente";
    }
    
    @PutMapping("/update")
    public void updateCarrusel(@RequestBody Carrusel carrusel){
        carruselServ.editarCarrusel(carrusel);
    }
    
}
