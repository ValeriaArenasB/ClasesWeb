package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entidad.User;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired //inyeccion de donde esta el user instanciado
    private User user;
        //cambiar este nombre de var por el nombre del user que se quiere inyectar



    @GetMapping("/info2")
    public String mostrarInformacion(Model model){
        model.addAttribute("usuario", user);
        return "datos_usuario";
    }




    @GetMapping("/info")
    @ResponseBody
    public String mostrarInformacionUsuario(){
        String html = "";
        html += "<h1>Información del usuario</h1>";
        html += "<p>Nombre: " + user.getName() + "</p>";
        html += "<p>Nombre de usuario: " + user.getUserName() + "</p>";
        html += "<p>Correo: " + user.getCorreo() + "</p>";
        html += "<p>Edad: " + user.getEdad() + "</p>";
        return html;
        
    }
    
}
