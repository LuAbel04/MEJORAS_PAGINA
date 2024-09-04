package com.pomalca.api_prueba.repositories;
import com.pomalca.api_prueba.models.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {

    List<Inventario> findByNombre(String nombre);

    List<Inventario> findByTipo(String tipo);

    List<Inventario> findByGerencia(String gerencia);
}

