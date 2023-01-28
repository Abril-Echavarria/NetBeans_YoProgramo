
package com.portafolio.Portafolio.repository;

import com.portafolio.Portafolio.entity.Carrusel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCarrusel extends JpaRepository <Carrusel, Integer>{
    
}
