
package com.uniajc.modelo;

public class Docente 
{
    private String nombre;
    private int edad; 
    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getEspecialidad() 
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }
}

