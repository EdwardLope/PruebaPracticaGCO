package com.example.Database.servicios;

import com.example.Database.helpers.ValidacionProveedor;
import com.example.Database.modelos.Proveedor;
import com.example.Database.repositorio.ProveedorRepositirio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServicio {

    @Autowired
    ValidacionProveedor validacionProveedor;

    @Autowired
    ProveedorRepositirio proveedorRepositorio;

    public Proveedor guardarProveedor(Proveedor datosProveedor) throws Exception {
        try {
            if (validacionProveedor.validarPersona(datosProveedor.getPersona()) == false) {
                throw new Exception("PERSONA INVALIDA, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarNitORut(datosProveedor.getNitORut()) == false) {
                throw new Exception("NIT O RUT  INVALIDO, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarRazonSocial(datosProveedor.getRazonSocial()) == false) {
                throw new Exception("RAZON SOCIAL INVALIDA, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarRepresentanteLegal(datosProveedor.getRepresentanteLegal()) == false) {
                throw new Exception("REPRESENTANTE LEGAL INVALIDO, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarTelefono(datosProveedor.getTelefono()) == false) {
                throw new Exception("TELEFONO INVALIDO, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarCorreo(datosProveedor.getCorreo()) == false) {
                throw new Exception("CORREO INVALIDO, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarPais(datosProveedor.getPais()) == false) {
                throw new Exception("PAIS INVALIDO, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarDepartamento(datosProveedor.getDepartamento()) == false) {
                throw new Exception("DEPARTAMENTO INVALIDO, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarCiudad(datosProveedor.getCiudad()) == false) {
                throw new Exception("CIUDAD INVALIDA, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarDireccion(datosProveedor.getDireccion()) == false) {
                throw new Exception("DIRRECCION INVALIDA, INTENTA NUEVA MENTE");
            }
            if (validacionProveedor.validarRutaPDF(datosProveedor.getRutaPDF()) == false) {
                throw new Exception("RUPA PDF INVALIDA, INTENTA NUEVA MENTE");
            }
            return proveedorRepositorio.save(datosProveedor);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Proveedor buscarProveedorPorId(Integer idProveedor) throws Exception {
        try {
            if (proveedorRepositorio.findById(idProveedor).isPresent()) {
                return proveedorRepositorio.findById(idProveedor).get();
            } else {
                throw new Exception("PROVEEDOR NO ENCONTRADO");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Proveedor>buscarTodosProveedores()throws Exception{
        try {
            return proveedorRepositorio.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Proveedor modificarProveedor(){
        return null;
    }

    public boolean eliminarProveedor(){
        return true;
    }

}
