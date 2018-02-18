/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.ivanysusbambam.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Felipe Velásquez Montoya
 * <pre>
 *  Versiones:
 *      18/02/2018
 *          -Creada clase, atributos, getters y setters.
 * </pre>
 */
@Entity
public class ProspectoCompraEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String texto;
    
    @ManyToOne
    private ClienteEntity cliente;
    
    @ManyToOne
    private VendedorEntity vendedor;
    
    @ManyToOne
    private AutomovilEntity automovil;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTexto() {
        return texto;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public VendedorEntity getVendedor() {
        return vendedor;
    }

    public AutomovilEntity getAutomovil() {
        return automovil;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(VendedorEntity vendedor) {
        this.vendedor = vendedor;
    }

    public void setAutomovil(AutomovilEntity automovil) {
        this.automovil = automovil;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProspectoCompraEntity)) {
            return false;
        }
        ProspectoCompraEntity other = (ProspectoCompraEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.csw.ivanysusbambam.entities.ProspectoCompraEntity[ id=" + id + " ]";
    }
    
}
