package com.wildcodeschool.quete1spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller /*la anotación controller es el gestor del MVC. Es el camarero que recibe la orden y tiene que preparar el cóctel y pedir la cuenta.
Lo mejor es evitar la mayor cantidad de lógica en esta parte y ponerla en el model*/
public class DoctorController {

    @GetMapping("/doctor/1") /*para la anotación todas las peticiones van a ser rerouteradas hacia este método y así se ejecutarán. Entre paréntesis va un string con la ruta*/
    @ResponseBody /*esta anotación indica que el cliente recibirá directamente el cuerpo y no la vista*/
    public String index() {
        return "William Hartnell";
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