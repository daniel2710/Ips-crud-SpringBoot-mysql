package com.example.ademo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface InterfacePacientes extends CrudRepository<Paciente, Long>{

        // SQL NATIVE

        //UPDATE `ips_crud`.`pacientes` SET `nombres` = 'mysql' WHERE (`idpaciente` = '24');

        @Query(value = "SELECT * FROM ips_crud.pacientes WHERE pacientes.idpaciente = :idpaciente", nativeQuery = true)
        List<Paciente> pacienteid(@Param("idpaciente") Long idpaciente);


}
