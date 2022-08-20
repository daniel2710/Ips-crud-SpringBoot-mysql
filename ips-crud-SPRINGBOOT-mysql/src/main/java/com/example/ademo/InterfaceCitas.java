package com.example.ademo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InterfaceCitas extends CrudRepository<Cita, Long> {

    // SQL NATIVE

    // all citas
    @Query(value = "SELECT * FROM ips_crud.citas", nativeQuery = true)
    List<Cita> allCitas();

    // Inner Join
    @Query(value = "SELECT * FROM pacientes INNER JOIN citas ON pacientes.idpaciente = citas.idpaciente", nativeQuery = true)
    List<Cita> allCitasAndAllPacientes();


    // Citas With Paciente
    @Query(value = "SELECT * FROM ips_crud.citas WHERE citas.idpaciente = :idpaciente", nativeQuery = true)
    List<Cita> citasWithPaciente(@Param("idpaciente") Long idpaciente);

}
