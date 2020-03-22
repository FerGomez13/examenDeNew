package com.uabc.edu.examen.model;

import javax.persistence.*;

@Entity
@Table(name="TBL_ANIMALES")
public class AnimalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="raza")
    private String raza;

    @Column(name="color")
    private String color;

    @Column(name="pelaje")
    private String pelaje;

    @Column(name="fecha_nacimiento")
    private String fecha_nacimiento;

    @Column(name="vacunas")
    private String vacunas;

    @Column(name="adopcion")
    private String adopcion;

    @Column(name="nombre_adopcion")
    private String nombre_adopcion;

    @Column(name="tipo")
    private String tipo;

    public Long getId(){ return id;}
    public void setId(Long id){ this.id = id;}

    public String getNombre(){ return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getPelaje() { return pelaje; }
    public void setPelaje(String pelaje) { this.pelaje = pelaje; }

    public String getFechaNacimiento() {return fecha_nacimiento; }
    public void setFechaNacimiento(String fecha_nacimiento){ this.fecha_nacimiento = fecha_nacimiento; }

    public String getVacunas() { return vacunas; }
    public void setVacunas(String vacunas) { this.vacunas = vacunas; }

    public String getAdopcion() { return adopcion; }
    public void setAdopcion(String adopcion) { this.adopcion = adopcion; }

    public String getNombreAdopcion() { return nombre_adopcion; }
    public void setNombreAdopcion(String nombre_adopcion) { this.nombre_adopcion = nombre_adopcion; }

    public String getTipo(){ return tipo;}
    public void setTipo(String tipo){ this.tipo = tipo;}

    @Override
    public String toString(){
        return "AnimalesEntity [id=" + id + ", Nombre=+ " + nombre + ", raza=" + raza + ", color " + color + ", pelaje=" + pelaje + ", Fecha de nacimiento=" + fecha_nacimiento + ", vacunas=" + vacunas + ", adopcion=" + adopcion + ", Nombre del que lo adopto" + nombre_adopcion + ", tipo=," + tipo + "]";
    }
}
