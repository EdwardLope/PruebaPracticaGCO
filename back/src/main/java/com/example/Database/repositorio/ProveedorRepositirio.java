package com.example.Database.repositorio;

import com.example.Database.modelos.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProveedorRepositirio extends JpaRepository<Proveedor,Integer> {
}
