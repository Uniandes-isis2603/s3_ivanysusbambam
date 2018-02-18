/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.ivanysusbambam.entities;

import java.io.Serializable;
import javax.persistence.Entity;
/**
 *
 * @author if.garcia y hd.castellanos
 */
@Entity
public class QuejaReclamoEntity extends BaseEntity implements Serializable{
    
    /**
     * indica si es queja o reclamo 
     */
    private String tipo;
    
    /**
     * Indica la descripci[on de la queja o el reclamo 
     */
    private String texto;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
    
}
