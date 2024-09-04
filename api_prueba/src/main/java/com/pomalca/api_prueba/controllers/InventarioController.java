package com.pomalca.api_prueba.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.pomalca.api_prueba.models.Inventario;
import com.pomalca.api_prueba.services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/inventario/")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class InventarioController {
    private InventarioService inventarioService;

@Autowired
    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearEquipoController(@RequestBody Inventario inventario) {
        inventarioService.crearequipo(inventario);
    }

    @PostMapping(value = "crearv", headers = "Accept=application/json")
    public void crearEquiposController(@RequestBody List<Inventario> inventarios) {
        inventarioService.crearequipos(inventarios);
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Inventario> listarEquiposController() {
        return inventarioService.listarequipos();
    }

    @GetMapping(value = "listarporid/{id}", headers = "Accept=application/json")
    public Optional<Inventario> listarPorIdController(@PathVariable Long id) {
        return inventarioService.buscarporid(id);
    }

    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarEquipoController(@RequestBody Inventario inventario) {
        inventarioService.actualizarequipo(inventario);
    }

    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarEquipoController(@PathVariable Long id) {
        inventarioService.eliminarequipoporid(id);
    }

    @GetMapping(value = "listargerencia/{gerencia}")
    public List<Inventario> listargerenciaController(@PathVariable String gerencia) {
        return inventarioService.buscarporgerencia(gerencia);
    }

    @GetMapping(value = "listartipo/{tipo}")
    public List<Inventario> listartipoController(@PathVariable String tipo) {
        return inventarioService.buscarportipo(tipo);
    }
}
