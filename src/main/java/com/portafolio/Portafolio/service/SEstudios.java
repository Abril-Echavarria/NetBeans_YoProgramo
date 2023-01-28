
package com.portafolio.Portafolio.service;

import com.portafolio.Portafolio.entity.Estudios;
import com.portafolio.Portafolio.repository.REstudios;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudios {
    
    @Autowired
    public REstudios estudioR;
    
    public List<Estudios> varEstudios() {
        List<Estudios> listaEstudios=estudioR.findAll();
        return listaEstudios;
    }
    
    public void crearEstudio(Estudios estudio){
        estudioR.save(estudio);
    }
    
        public void editarEstudio(Estudios estudio){
        estudioR.save(estudio);
    }
    
    public Estudios buscarEstudio(int id){
        Estudios estudio=estudioR.findById(id).orElse(null);
        return estudio;
    }
    
    public void borarEstudio(int id){
        estudioR.deleteById(id);
    }
    
}
