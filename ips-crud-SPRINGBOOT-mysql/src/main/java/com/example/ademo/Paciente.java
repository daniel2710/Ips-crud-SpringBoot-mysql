package com.example.ademo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pacientes", catalog = "ips_crud", schema = "")
public class Paciente {

	@Id
	@Column(name="idpaciente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpaciente;
	@Column
	private String nombres;
	@Column
	private String apellidos;
	@Column
	private String tipo_doc;
	@Column
	private Integer documento;
	@Column
	private String fecha_nac;
	@Column
	private String lugar_nac;


	// Mapeo de relaciones
	@OneToMany(mappedBy = "idpaciente")
	List<Cita> citasList;


	// GETTERS AND SETTERS

	public Long getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getLugar_nac() {
		return lugar_nac;
	}

	public void setLugar_nac(String lugar_nac) {
		this.lugar_nac = lugar_nac;
	}
}
