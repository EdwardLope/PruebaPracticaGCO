export async function consumirDatos(){
    let url="http://localhost:8080/PersonasBD/v1/proveedor"

    let peticiones={
        method:"GET"
    }

   let respuesta=await fetch(url,peticiones)

   let datos=await respuesta.json()

   console.log(datos)

} 

