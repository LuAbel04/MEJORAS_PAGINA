package com.pomalca.api_prueba.services;

import com.pomalca.api_prueba.models.Inventario;
import com.pomalca.api_prueba.repositories.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    private InventarioRepository InvRepo;
    @Autowired

    public InventarioService(InventarioRepository InvRepo) {
        this.InvRepo = InvRepo;
    }

    //Método para crear un equipo
    public void crearequipo (Inventario inventario) {
        InvRepo.save(inventario);
    }

    //Método para crear varios equipos
    public void crearequipos (List<Inventario> inventarios) {
        for (Inventario inventario : inventarios) {
            crearequipo(inventario);
        }
    }

    //Método para listar todos los equipos en nuestra BD
    public List<Inventario> listarequipos() {
        return InvRepo.findAll();
    }

    //Método para buscar un equipo por id especifico
    public Optional<Inventario> buscarporid(Long id) {
        return InvRepo.findById(id);
    }

    //Método para actulizar un equipo
    public void actualizarequipo(Inventario inventario) {
        InvRepo.save(inventario);
    }

    //Método para eliminar un equipo
    public void eliminarequipoporid(Long id) {
        InvRepo.deleteById(id);
    }




    //Método para buscar según atributos propios de la clase
    public List<Inventario> buscarporgerencia(String gerencia) {
        return InvRepo.findByGerencia(gerencia);
    }

    public List<Inventario> buscarportipo(String tipo) {
        return InvRepo.findByTipo(tipo);
    }
}
