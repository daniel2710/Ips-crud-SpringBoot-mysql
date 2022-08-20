package com.example.ademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citas")
public class CitasControlller {

    @Autowired
    private InterfaceCitas interfaceCitas;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/allcitaspacientes")
    public List<Cita> CitasYPacientes() {
        return (List<Cita>) interfaceCitas.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/citawithpaciente/{idpaciente}")
    public List<Cita> pacienteYCitas(@PathVariable Long idpaciente) {
        return (List<Cita>) interfaceCitas.citasWithPaciente(idpaciente);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/allcitas")
    public List<Cita> citas() {
        return (List<Cita>) interfaceCitas.allCitas();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/createcita")
    public String insertar(@RequestBody Cita citas) {
        interfaceCitas.save(citas);
        return "Cita creada correctamente";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/update/cita")
    public String actualizar(@RequestBody Cita citas) {
        interfaceCitas.save(citas);
        return "Cita actualizada correctamente";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/delete/cita/{idcita}")
    public String eliminar(@PathVariable("idcita") Long idcita) {
        interfaceCitas.deleteById(idcita);
        return "Cita eliminada correctamente";
    }

}
