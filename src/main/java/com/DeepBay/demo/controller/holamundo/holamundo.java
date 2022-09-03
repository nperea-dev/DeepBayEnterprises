package com.DeepBay.demo.controller.holamundo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")

public class holamundo {
    @GetMapping
    public String decitHola() {
        return "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1 style=\"color:red;\">Hola a todos los miembros del equipo !</h1>\n" +
                "<img src=\"https://5.imimg.com/data5/WQ/PI/GLADMIN-53522917/software-programing-courses-500x500.jpg\">\n" +
                "\n" +
                "<h3 style=\"color:blue;\">Workgroup Ciclo 3 Ds.</h3>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n ";
    }


}
