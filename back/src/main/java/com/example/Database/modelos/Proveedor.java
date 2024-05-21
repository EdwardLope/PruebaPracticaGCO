package com.example.Database.modelos;

import jakarta.persistence.*;
@Entity
@Table(name = "Proveedores" )
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proveedor;

    @Column(name = "Persona",nullable = false,length = 8)
    private String persona;
    @Column(name = "NitORut",nullable = false,length = 20)
    private String NitORut;
    @Column(name = "RazonSocial",nullable = false,length = 150)
    private String RazonSocial;
    @Column(name = "RepresentanteLegal",nullable = false,length = 20)
    private String RepresentanteLegal;
    @Column(name = "Telefono",nullable = false,length = 15)
    private String Telefono;
    @Column(name = "Correo",nullable = false,length = 30)
    private String Correo;
    @Column(name = "Pais",nullable = false,length = 18)
    private String Pais;
    @Column(name = "Departamento",nullable = false,length = 16)
    private String Departamento;
    @Column(name = "Ciudad",nullable = false,length = 16)
    private String Ciudad;
    @Column(name = "Direccion",nullable = false,length = 20)
    private String Direccion;
    @Column(name = "RutaPDF",nullable = false,length = 255)
    private String RutaPDF;


    public Proveedor(Integer id_proveedor, String persona, String nitORut, String razonSocial, String representanteLegal, String telefono, String correo, String ciudad, String pais, String departamento, String direccion, String rutaPDF) {
        this.id_proveedor = id_proveedor;
        this.persona = persona;
        NitORut = nitORut;
        RazonSocial = razonSocial;
        RepresentanteLegal = representanteLegal;
        Telefono = telefono;
        Correo = correo;
        Ciudad = ciudad;
        Pais = pais;
        Departamento = departamento;
        Direccion = direccion;
        RutaPDF = rutaPDF;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getNitORut() {
        return NitORut;
    }

    public void setNitORut(String nitORut) {
        NitORut = nitORut;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return RepresentanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        RepresentanteLegal = representanteLegal;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getRutaPDF() {
        return RutaPDF;
    }

    public void setRutaPDF(String rutaPDF) {
        RutaPDF = rutaPDF;
    }
}
