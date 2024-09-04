package com.pomalca.api_prueba.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInventario;

    private String nombre;

    private String gerencia;

    private String area;

    private String tipo;

    private String ip;

    private String mac_inalambrica;

    private String mac_cable;

    private String nombre_equipo;
}
