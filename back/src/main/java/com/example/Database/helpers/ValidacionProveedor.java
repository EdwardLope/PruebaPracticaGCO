package com.example.Database.helpers;

import org.springframework.stereotype.Component;

@Component
public class ValidacionProveedor {

    private EvaluarPatron evaluarPatron=new EvaluarPatron();

    public boolean validarPersona (String persona)throws Exception{
        String regex = "^[a-zA-Z\\s]{1,8}$";
        if (!this.evaluarPatron.evaluarPatron(persona,regex)){
            throw new Exception("Reviza persona en este campo solo se accepta natural o juridica");
        }
        return true;
    }

    public boolean validarNitORut (String nitORut)throws Exception{
        String regex = "/^[-+]?[0-9]+(\\.[1-20]+)?$/";
        if (!this.evaluarPatron.evaluarPatron(nitORut,regex)){
            throw new Exception("Reviza el nit o rout este campo solo accepta numeros");
        }
        return true;
    }

    public boolean validarRazonSocial (String razonSocial)throws Exception{
        String regex = "^[a-zA-Z\\s]{1,150}$";
        if (!this.evaluarPatron.evaluarPatron(razonSocial,regex)){
            throw new Exception("Reviza la razon social");
        }
        return true;
    }

    public boolean validarRepresentanteLegal (String representanteLegal)throws Exception{
        String regex = "^[a-zA-Z\\s]{1,20}$";
        if (!this.evaluarPatron.evaluarPatron(representanteLegal,regex)){
            throw new Exception("Reviza el representante legal");
        }
        return true;
    }

    public boolean validarTelefono (String telefono)throws Exception{
        String regex = "/^[-+]?[0-9]+(\\.[1-15]+)?$/";
        if (!this.evaluarPatron.evaluarPatron(telefono,regex)){
            throw new Exception("Reviza el telefono");
        }
        return true;
    }

    public boolean validarCorreo (String correo)throws Exception{
        String regex = "^[a-zA-Z\\s.,'-@]{1,30}$";
        if (!this.evaluarPatron.evaluarPatron(correo,regex)){
            throw new Exception("Reviza el correo");
        }
        return true;
    }
    public boolean validarPais (String pais)throws Exception{
        String regex = "^[a-zA-Z\\s.,'-@]{1,18}$";
        if (!this.evaluarPatron.evaluarPatron(pais,regex)){
            throw new Exception("Reviza el pais");
        }
        return true;
    }

    public boolean validarDepartamento (String departamento)throws Exception{
        String regex = "^[a-zA-Z\\s.,'-@]{1,16}$";
        if (!this.evaluarPatron.evaluarPatron(departamento,regex)){
            throw new Exception("Reviza el departamento");
        }
        return true;
    }

    public boolean validarCiudad (String ciudad)throws Exception{
        String regex = "^[a-zA-Z\\s.,'-@]{1,16}$";
        if (!this.evaluarPatron.evaluarPatron(ciudad,regex)){
            throw new Exception("Reviza la ciudad");
        }
        return true;
    }

    public boolean validarDireccion (String direccion)throws Exception{
        String regex = "/^[\\w\\s.,#-]+$/";
        if (!this.evaluarPatron.evaluarPatron(direccion,regex)){
            throw new Exception("Reviza la direccion");
        }
        return true;
    }

    public boolean validarRutaPDF (String rutaPDF)throws Exception{
        String regex = "^gs://[a-zA-Z0-9-._~/]+$";
        if (!this.evaluarPatron.evaluarPatron(rutaPDF,regex)){
            throw new Exception("Reviza la rutaPDF");
        }
        return true;
    }


}
