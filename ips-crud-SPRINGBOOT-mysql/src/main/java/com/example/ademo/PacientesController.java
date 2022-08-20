package com.example.ademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

	@Autowired
	private InterfacePacientes interfacePacientes;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public List<Paciente> pacientes() {
		return (List<Paciente>) interfacePacientes.findAll();
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/paciente/{idpaciente}")
	public List<Paciente> pacienteid(@PathVariable("idpaciente") Long idpaciente) {
		return (List<Paciente>) interfacePacientes.pacienteid(idpaciente);
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/createpaciente")
	public String insertar(@RequestBody Paciente paciente) {
		interfacePacientes.save(paciente);
		return "paciente creado correctamente";
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PutMapping("/updatepaciente")
	public String actualizar(@RequestBody Paciente paciente) {
		interfacePacientes.save(paciente);
		return "paciente actualizado correctamente";
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@DeleteMapping("/deletepaciente/{idpaciente}")
	public String eliminar(@PathVariable("idpaciente") Long idpaciente) {
		interfacePacientes.deleteById(idpaciente);
		return "paciente eliminado correctamente";
	}

}
