
package com.portafolio.Portafolio.service;

import com.portafolio.Portafolio.entity.Experiencia;
import com.portafolio.Portafolio.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
    @Autowired
    public RExperiencia expeR;
    
    
    public List<Experiencia> varExperiencia() {
        List<Experiencia> listaExperiencia=expeR.findAll();
        return listaExperiencia;
    }
    
    public void crearExperiencia(Experiencia expe){
        expeR.save(expe);
    }
    
    public void editarExperiencia(Experiencia expe){
        expeR.save(expe);
    }
    
    public Experiencia buscarExperiencia(int id) {
        Experiencia expe= expeR.findById(id).orElse(null);
        return expe;
    }
    
    public void borrarExperiencia(int id){
        expeR.deleteById(id);
    }
    
}
