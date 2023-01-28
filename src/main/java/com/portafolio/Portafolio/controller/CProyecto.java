
package com.portafolio.Portafolio.controller;

import com.portafolio.Portafolio.entity.Proyecto;
import com.portafolio.Portafolio.service.SProyecto;
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
@RequestMapping ("proyecto")
@CrossOrigin(origins="http://localhost:4200/")
public class CProyecto {
    
    @Autowired
    SProyecto proyeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyeServ.varProyecto();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyeServ.buscarProyecto(id);
    }
    
    @PostMapping ("/crear")
    public String agregarProyecto (@RequestBody Proyecto proye){
        proyeServ.crearProyecto(proye);
        return "El proyecto fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id){
        proyeServ.borrarProyecto(id);
    return "El proyecto fue borrada correctamente";
    }
    
    @PutMapping("/update")
    public void updateProyecto(@RequestBody Proyecto proye){
        proyeServ.editarProyecto(proye);
    }
    
}
