package co.edu.uniandes.csw.ivanysusbambam.dtos;

import co.edu.uniandes.csw.ivanysusbambam.entities.MarcaEntity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joseph Ortíz Moreno
 */
public class MarcaDTO {

    /**
     * Representa el nombre de la marca
     */
    private String name;
    
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MarcaDTO() {

    }

    /**
     * Constructor a partir de la entidad
     *
     * @param nueva Entidad de la marca
     */

    public MarcaDTO(MarcaEntity nueva){
        if(nueva != null){
            this.name = nueva.getName();
            this.id = nueva.getId();
        }

    }

    /**
     * Método que convierte el DTO en una entidad
     *
     * @return Entidad creada
     */
    public MarcaEntity toEntity() {
        MarcaEntity nueva = new MarcaEntity();
        nueva.setName(this.getName());
        nueva.setId(this.getId());
        return nueva;
    }

    /**
     * Retorna el nombre de la marca
     *
     * @return Nombre de la marca
     */
    public String getName() {
        return name;
    }

    /**
     * Cambia el nombre de la marca
     *
     * @param nuevo Nuevo nombre de la marca
     */
    public void SetName(String nuevo) {
        this.name = nuevo;
    }

}
