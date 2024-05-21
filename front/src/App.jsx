import React, { useState } from 'react';
import Swal from 'sweetalert2';
import { consumirDatos } from './assets/services/servicio';
import "./App.css"

function App() {
 
  const [formCompleto, setFormCompleto] = useState(false);

 
  const handleInputChange = () => {
    const inputs = document.querySelectorAll('input:required');
    const todosLlenos = Array.from(inputs).every(input => input.value.trim() !== '');
    setFormCompleto(todosLlenos);
  };

  
  const mostrarAlerta = () => {
    Swal.fire({
      title: "Perfecto",
      text: "Sus datos serán enviados",
      icon: "success"
    });
  };

  
  const handleSubmit = (event) => {
    event.preventDefault(); 
    if (formCompleto) {
      mostrarAlerta(); 
    } else {
      Swal.fire({
        title: "Error",
        text: "Por favor complete todos los campos del formulario",
        icon: "error"
      });
    }
  };

  
  consumirDatos().then(function(respuesta){
  
  });

  return (
    <main>
      <h2>Formulario de Proveedor</h2>
      <form onSubmit={handleSubmit}>
        { <div>
          <select id="tipoPersona" name="tipoPersona" required>
            <option value="Natural">Natural</option>
            <option value="Jurídica">Jurídica</option>
          </select>
        </div>}
         <input placeholder='Nit o Rut' type='number' id="nitOrRut" name="nitOrRut" required onChange={handleInputChange} />
        <div>
         <input placeholder='Razon social' type="text" id="razonSocial" name="razonSocial" required onChange={handleInputChange} />
       </div>

      <div>
       <input placeholder='Representante legal' type="text" id="representanteLegal" name="representanteLegal" onChange={handleInputChange} />
      </div>

      <div>
       <input placeholder='Telefono' type="number" id="telefono" name="telefono" required onChange={handleInputChange} />
      </div>

      <div>
       <input placeholder='Correo' type="email" id="correo" name="correo" required onChange={handleInputChange} />
      </div>

      <div> 
       <input placeholder='Pais' type="text" id="pais" name="pais" required onChange={handleInputChange} />
      </div>

      <div>
       <input placeholder='Departamento' type="text" id="departamento" name="departamento" required onChange={handleInputChange} />
      </div>

      <div>
       <input placeholder='Ciudad' type="text" id="ciudad" name="ciudad" required onChange={handleInputChange} />
      </div>

      <div>
       <input placeholder='Dirreccion' type="text" id="direccion" name="direccion" required onChange={handleInputChange} />
      </div>

      <div>
       <input placeholder='Ruta del pdf' type="file" id="rutaRutPDF" name="rutaRutPDF" accept="application/pdf" required onChange={handleInputChange} />
      </div>


      <div>
       <input type="submit" value="Enviar" />
      </div>
        
      </form>
    </main>
  );
}

export default App;
