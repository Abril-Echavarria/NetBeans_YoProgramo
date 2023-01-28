
package com.portafolio.Portafolio.controller;

import com.portafolio.Portafolio.entity.Estudios;
import com.portafolio.Portafolio.service.SEstudios;
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
@RequestMapping("estudios")
@CrossOrigin(origins="http://localhost:4200/")
public class CEstudios {
    
    @Autowired
    SEstudios estudioServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Estudios> verEstudios(){
        return estudioServ.varEstudios();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudios verEstudio(@PathVariable int id){
        return estudioServ.buscarEstudio(id);
    }
    
    @PostMapping("/crear")
    public String agregarEstudio (@RequestBody Estudios estudio){
        estudioServ.crearEstudio(estudio);
        return "El estudio fue creado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarEstudio(@PathVariable int id){
        estudioServ.borarEstudio(id);
        return "El estudio fue borrado correctamente";
    }
    
    @PutMapping("/update")
    public void updateEstudio (@RequestBody Estudios estudio){
        estudioServ.editarEstudio(estudio);
    }
    
}
