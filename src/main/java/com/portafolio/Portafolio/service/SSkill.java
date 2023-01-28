
package com.portafolio.Portafolio.service;

import com.portafolio.Portafolio.entity.Skill;
import com.portafolio.Portafolio.repository.RSkill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSkill {
    
     @Autowired
    public RSkill skillR;
    
    public List<Skill> varSkill() {
        List<Skill> listaSkill=skillR.findAll();
        return listaSkill;
    }
    public void crearSkill(Skill skill){
        skillR.save(skill);
    }
    
     public void editarSkill(Skill skill){
        skillR.save(skill);
    }
    
    public Skill buscarSkill(int id) {
        Skill perso= skillR.findById(id).orElse(null);
        return perso;
    }
    
    public void borrarSkill(int id){
        skillR.deleteById(id);
    }
}
