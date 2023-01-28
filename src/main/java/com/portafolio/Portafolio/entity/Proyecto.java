
package com.portafolio.Portafolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length=999)
    private String titulo;
    @Lob
    @Column(length=999)
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private Date fechai;
    @Temporal(TemporalType.DATE)
    private Date fechaf;
    @Lob
    @Column(length=999)
    private String img;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, Date fechai, Date fechaf, String img) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechai = fechai;
        this.fechaf = fechaf;
        this.img = img;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechai() {
        return fechai;
    }

    public void setFechai(Date fechai) {
        this.fechai = fechai;
    }

    public Date getFechaf() {
        return fechaf;
    }

    public void setFechaf(Date fechaf) {
        this.fechaf = fechaf;
    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}
