
package com.portafolio.Portafolio.controller;

import com.portafolio.Portafolio.entity.Skill;
import com.portafolio.Portafolio.service.SSkill;
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
@RequestMapping ("skill")
@CrossOrigin(origins="http://localhost:4200/")
public class CSkill {
    
    @Autowired
    SSkill skillServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Skill> verSkill(){
        return skillServ.varSkill();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Skill verSkill(@PathVariable int id){
        return skillServ.buscarSkill(id);
    }
    
    @PostMapping ("/crear")
    public String agregarSkill (@RequestBody Skill skill){
        skillServ.crearSkill(skill);
        return "La skill fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarSkill(@PathVariable int id){
        skillServ.borrarSkill(id);
    return "La skill fue borrada correctamente";
    }
    
    @PutMapping("/update")
    public void updatePersona(@RequestBody Skill skill){
        skillServ.editarSkill(skill);
    }
    
}
