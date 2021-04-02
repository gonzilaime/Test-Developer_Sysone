# Test-Developer_Sysone
A continuación se detalla los diferentes endpoints que posee la aplicación:

@GET
https://testdevelopersysone.herokuapp.com/api/automovil
Devuelve el listado de automóviles.

@GET
https://testdevelopersysone.herokuapp.com/api/automovil/{id}
Devuelve el automóvil con el ID especificado.

@POST
https://testdevelopersysone.herokuapp.com/api/automovil
Crea un automóvil. 
- Se valida el modelo, solo se acepta 'coupe', 'familiar', 'sedan', cualquier otro string enviado será rechazado.
- Se valida que los campos 'techoCorredizo', 'aireAcondicionado', 'frenosAbs', 'airbag', 'llantasAlineacion' acepte solo como valor "SI" o "NO", cualquier otro valor será rechazado.
<body>
{
    "modelo":"coupe",
    "techoCorredizo":"SI",
    "aireAcondicionado": "SI",
    "frenosAbs":"NO",
    "airbag":"NO",
    "llantasAlineacion":"NO"
}
</body>

@PUT
https://testdevelopersysone.herokuapp.com/api/automovil/{id}
Actualiza el automóvil con el id especificado.
- Se valida el modelo, solo se acepta 'coupe', 'familiar', 'sedan', cualquier otro string enviado será rechazado.
- Se valida que los campos 'techoCorredizo', 'aireAcondicionado', 'frenosAbs', 'airbag', 'llantasAlineacion' acepte solo como valor "SI" o "NO", cualquier otro valor será rechazado.
<body>
{
    "modelo":"coupe",
    "techoCorredizo":"SI",
    "aireAcondicionado": "SI",
    "frenosAbs":"NO",
    "airbag":"NO",
    "llantasAlineacion":"NO"
}
</body>

@DELETE
https://testdevelopersysone.herokuapp.com/api/automovil/{id}
Elimina el automóvil con el identificado ingresado por parámetro.
