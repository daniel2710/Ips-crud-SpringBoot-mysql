package com.example.ademo;

import javax.persistence.*;

@Entity
@Table(name = "citas", catalog = "ips_crud", schema = "")
public class Cita {

    @Id
    @Column(name="idcita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcita;
    @Column
    private String fecha;
    @Column
    private String doctor;
    @Column
    private String lugar;
    @Column
    private String direccion;
    @Column
    private String tipo;
    @Column
    private String estado;
    @Column
    private String prioritaria;
    @Column
    private String observacion;

    @Column
    private String hora;


    // LLAVE FORANEA
    // Mapeo de relaciones
    @ManyToOne
    @JoinColumn(name = "idpaciente")
    Paciente idpaciente;





    // GETTERS AND SETTERS

    public Long getIdcita() {
        return idcita;
    }

    public void setIdcita(Long idcita) {
        this.idcita = idcita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioritaria() {
        return prioritaria;
    }

    public void setPrioritaria(String prioritaria) {
        this.prioritaria = prioritaria;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Paciente idpaciente) {
        this.idpaciente = idpaciente;
    }
}
