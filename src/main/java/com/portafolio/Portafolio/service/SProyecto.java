
package com.portafolio.Portafolio.service;

import com.portafolio.Portafolio.entity.Proyecto;
import com.portafolio.Portafolio.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    
    @Autowired
    public RProyecto proyeR;
    
    public List<Proyecto> varProyecto() {
        List<Proyecto> listaPersona=proyeR.findAll();
        return listaPersona;
    }
    
    public void crearProyecto(Proyecto proye){
        proyeR.save(proye);
    }
    
    public void editarProyecto(Proyecto proye){
        proyeR.save(proye);
    }
    
    public Proyecto buscarProyecto(int id) {
        Proyecto proye= proyeR.findById(id).orElse(null);
        return proye;
    }
    
    public void borrarProyecto(int id){
        proyeR.deleteById(id);
    }
    
}
