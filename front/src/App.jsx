import './App.css'
import React from 'react';
import Swal from 'sweetalert2'


function App() {

  document.getElementById("formulario").addEventListener("submit", function(event) {
    event.preventDefault();

    Swal.fire({
      title: "Perfecto",
      text: "sus datos fueron enviados",
      icon: "success"
    });

  });

  return (
    <main>
      <h2>Formulario de Proveedor</h2>
      
      <form id='formulario' action="PersonasBD/v1/proveedor" method="POST" encType="multipart/form-data">
        <div>
          <label htmlFor="tipoPersona">Tipo de Persona:</label>
          <select id="tipoPersona" name="tipoPersona" required>
            <option value="Natural">Natural</option>
            <option value="Jurídica">Jurídica</option>
          </select>
        </div>

        <div>
          <input placeholder='Nit o Rut' type='number' id="nitOrRut" name="nitOrRut" required />
        </div>

        <div>
          <input placeholder='Razon social' type="text" id="razonSocial" name="razonSocial" required />
        </div>

        <div>
          <input placeholder='Representante legal' type="text" id="representanteLegal" name="representanteLegal" />
        </div>

        <div>
          <input placeholder='Telefono' type="number" id="telefono" name="telefono" required />
        </div>

        <div>
          <input placeholder='Correo' type="email" id="correo" name="correo" required />
        </div>

        <div>
          <input placeholder='Pais' type="text" id="pais" name="pais" required />
        </div>

        <div>
          <input placeholder='Departamento' type="text" id="departamento" name="departamento" required />
        </div>

        <div>
          <input placeholder='Ciudad' type="text" id="ciudad" name="ciudad" required />
        </div>

        <div>
          <input placeholder='Dirreccion' type="text" id="direccion" name="direccion" required />
        </div>

        <div>
          <input placeholder='Ruta del pdf' type="file" id="rutaRutPDF" name="rutaRutPDF" accept="application/pdf" required />
        </div>

        <div>
          <input type="submit" value="Enviar" onClick={Alerta} />
        </div>
      </form>
    </main>
  );
}

export default App;
