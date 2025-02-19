
REPOSITORIO: obtener los datos de la BDD, hacer queries (en metodos) y traerlos a la aplicacion


**CONTROLADOR**: a traves de el se accede al sistema. media entre la vista y el modelo
 - reemplazan a los Servlets, al ser un objeto que recibe y response solicitudes con metodos especificados
 - Autowired inyecta dependencias / relaciones de asociacion para usar


**ENTIDADES**: representa solo las entidades en el negocio (atributos, POJO)
  -POJO (Plain Old Java Object) = clase que solo tiene atributos y metodos constructor, getter y setter, no metodos avanzados =/ modelo (POJO es solo la estructura)

  
**SERVICIO**: realiza la logica de neogocio y se conecta con el repositorio para que haga las queries necesarias
  - usualmente se debe crea una inerfaz con lo que se va a hacer con el servicio y luego crear clase que implemente la interfaz ServiceImpl
- usa la info del repositorio


  - **BOOTSTRAP**: framework/ conjunto de librerias de css para que la pag sea responsive y lograr diseños bonitos facilmente
  -   " link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"> "
  -   for con thymeleaf:
  -           <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Carrera</th>
                    <th>Semestre</th>
                    <th>Correo</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="persona: ${estudiantes}">
                    <td th:text="${persona.nombre}"></td>
                    <td th:text="${persona.carrera}"></td>
                    <td th:text="${persona.semestre}"></td>
                    <td th:text="${persona.correo}"></td>
                </tr>
            </thead>
        </table>
    

    
  - **THYMELEAF**: motor para generar plantillas e integrarlas en spring de forma sencilla
 
    
  - BEAN: objeto que vive de manera global en la aplicaicon y se puede usar en cualquier momento -> solo se declaran donde se tenga el @Configuration (en DemoApplication) y se saca con @Autowired


    

- para escribir el html en forma de java de string = @ResponseBody en el controller
-  (si no, se quita y return el html sin .html )
