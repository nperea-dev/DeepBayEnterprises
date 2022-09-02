package com.DeepBay.demo.controller.holamundo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/saludo")
public class holamundo {
    @GetMapping
    public String decitHola() {
        return "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2 style=\"color:red;\">Hola a todos los miembros del equipo !</h2>\n" +
                "\n" +
                "<h3 style=\"color:blue;\">Workgroup Ciclo 3 Ds.</h3>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n ";
    }


}
