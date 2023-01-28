
package com.portafolio.Portafolio.service;

import com.portafolio.Portafolio.entity.Carrusel;
import com.portafolio.Portafolio.repository.RCarrusel;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCarrusel {
    
    @Autowired
    public RCarrusel carruselR;
    
    public List<Carrusel> varCarrusel() {
        List<Carrusel> listaCarrusel=carruselR.findAll();
        return listaCarrusel;
    }
        
    public void crearCarrusel(Carrusel carrusel){
        carruselR.save(carrusel);
    }
    
        
    public void editarCarrusel(Carrusel carrusel){
        carruselR.save(carrusel);
    }
    
    public Carrusel buscarCarrusel(int id) {
        Carrusel carrusel= carruselR.findById(id).orElse(null);
        return carrusel;
    }
    
    public void borrarCarrusel(int id){
        carruselR.deleteById(id);
    }
    
}
