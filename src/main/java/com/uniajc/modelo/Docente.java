package com.uniajc.modelo;

public class Docente {
    public String nombre;
    private int edad;
    private String materia; // Nueva propiedad para la materia que enseña el docente
    private double salario; // Nueva propiedad para el salario del docente
    private int Id; // Nueva propiedad para el ID del docente
    

    public Docente(String nombre, int edad, String materia, double salario, int Id) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
        this.salario = salario;
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public String mostrarResumen() {
        return nombre + " enseña " + materia;
    }

}
