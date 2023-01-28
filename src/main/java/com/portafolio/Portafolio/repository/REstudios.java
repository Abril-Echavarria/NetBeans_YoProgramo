
package com.portafolio.Portafolio.repository;

import com.portafolio.Portafolio.entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudios extends JpaRepository <Estudios, Integer> {
    
}
