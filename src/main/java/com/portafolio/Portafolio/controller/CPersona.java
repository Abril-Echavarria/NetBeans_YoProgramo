
package com.portafolio.Portafolio.controller;

import com.portafolio.Portafolio.entity.Persona;
import com.portafolio.Portafolio.service.SPersona;
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
@RequestMapping ("persona")
@CrossOrigin(origins="http://localhost:4200/")
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @PostMapping("/autenticacion/login")
    public Persona loginPersona(@RequestBody Persona pers){
        return persoServ.loginPersona(pers.getEmail(), pers.getClave());
    }
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.varPersona();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping ("/crear")
    public String agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
    return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/update")
    public void updatePersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
    }
}
