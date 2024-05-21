package com.example.Database.controladores;

import com.example.Database.modelos.Proveedor;
import com.example.Database.servicios.ProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
@RestController
@RequestMapping("PersonasBD/v1/proveedor")
public class ProveedorControlador {

    @Autowired
    ProveedorServicio proveedorServicio;

    @PostMapping
    public ResponseEntity<?> guardarProveedor(@RequestBody Proveedor datosProveedor)throws Exception {

        try {

            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(proveedorServicio.guardarProveedor(datosProveedor));

        } catch (Exception error) {
            Map<String, Object> errores = new LinkedHashMap<>();
            errores.put("hora:", LocalDateTime.now());
            errores.put("mensaje", error.getMessage());
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errores);

        }
    }

    @GetMapping
    public  ResponseEntity <?> consultarProveedor(){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(proveedorServicio.buscarTodosProveedores());

        }catch(Exception error){

            Map<String, Object> errores = new LinkedHashMap<>();
            errores.put("hora:", LocalDateTime.now());
            errores.put("mensaje", error.getMessage());
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errores);


        }

    }

    @GetMapping("{id}")
    public  ResponseEntity<?> buscarProveedorPorId(@PathVariable Integer id){
        try {

            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(proveedorServicio.buscarProveedorPorId(id));

        }catch (Exception error){
            Map<String, Object> errores = new LinkedHashMap<>();
            errores.put("hora:", LocalDateTime.now());
            errores.put("mensaje", error.getMessage());
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errores);

        }
    }




}
