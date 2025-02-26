package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//a traves de el se accede al sistema. media entre la vista y el modelo

@Controller //cada vez que incializa la app, crea un servlet de alto nivel que inicia las aplicaciones
@RequestMapping("/mundo") //ruta a la que va a contestar
public class HolaMundoController {

    //controlador que maneja peticiones. cuando le llega una peticion GET responsde con Hola Mundo en HTML
    //http://localhost:8090/mundo/hola
    @GetMapping("/hola")
    // @ResponseBody no necesario si se lo vas a atribuir a un html
    public String holaMundo(){
        return "hola_mundo";
    }

    //http://localhost:8090/mundo/chao
    @GetMapping("/chao")
    // @ResponseBody
    public String chaoMundo(){
        return "chao_mundo";
    }
    
    
}
