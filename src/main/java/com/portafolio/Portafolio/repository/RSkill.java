
package com.portafolio.Portafolio.repository;

import com.portafolio.Portafolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends JpaRepository <Skill, Integer>{
    
}
