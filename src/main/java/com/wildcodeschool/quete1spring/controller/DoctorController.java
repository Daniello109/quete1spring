package com.wildcodeschool.quete1spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller /*la anotación controller es el gestor del MVC. Es el camarero que recibe la orden y tiene que preparar el cóctel y pedir la cuenta.
Lo mejor es evitar la mayor cantidad de lógica en esta parte y ponerla en el model*/
public class DoctorController {

    @GetMapping("/doctor/1") /*para la anotación todas las peticiones van a ser rerouteradas hacia este método y así se ejecutarán. Entre paréntesis va un string con la ruta*/
    @ResponseBody /*esta anotación indica que el cliente recibirá un contenido y no la página web*/
    public String index() { /* parece que esta función carga el html que hay en static, pero no estoy muy seguro*/
        return "William Hartnell"; /*si lanzamos el servidor, se mostrará la página web index que hay en static.
         Para mostrar este responeBody, hay que añadir la ruta de getmapping, o como en este caso, crear los enlace en index*/
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String index2() {
        return "David Tennant";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String index3() {
        return "Jodie Whittaker";
    }
}