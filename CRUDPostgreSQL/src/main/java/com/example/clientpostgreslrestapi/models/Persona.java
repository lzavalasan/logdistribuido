package com.example.clientpostgreslrestapi.models;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data // Genera getters y setters automáticamente
@Entity // Indica que es una entidad de la base de datos
@Table(name = "personas") // Indica el nombre de la tabla en la base de datos
public class Persona {
    
    @Id // Indica que es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera la clave primaria automáticamente
    @Column(name = "id") // Indica el nombre de la columna en la base de datos
    private Integer id;
    
    private String nombreApellido;
}
