
package com.portafolio.Portafolio.service;

import com.portafolio.Portafolio.entity.Persona;
import com.portafolio.Portafolio.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona persoR;
    
    
    public Persona loginPersona(String email, String clave){
        List<Persona> personas = persoR.findByEmailAndClave(email,clave);
        if(!personas.isEmpty()) {
            return personas.get(0);
        }
        return null;
    }

    public List<Persona> varPersona() {
        List<Persona> listaPersona=persoR.findAll();
        return listaPersona;
    }
    public void crearPersona(Persona perso){
        persoR.save(perso);
    }
    
     public void editarPersona(Persona perso){
        persoR.save(perso);
    }
    
    public Persona buscarPersona(int id) {
        Persona perso= persoR.findById(id).orElse(null);
        return perso;
    }
    
    public void borrarPersona(int id){
        persoR.deleteById(id);
    }
    
    
}
