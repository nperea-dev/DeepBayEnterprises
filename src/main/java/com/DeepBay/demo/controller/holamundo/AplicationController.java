package com.DeepBay.demo.controller.holamundo;


import com.DeepBay.demo.Entities.Empleado;
import com.DeepBay.demo.Services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AplicationController {

    EmpleadoService service;


    @GetMapping("/")
    public String decitHola() {
        return "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1 style=\"color:red;\">Workgroup Ciclo 3 Ds.</h1>\n" +
                "<img src=\"https://5.imimg.com/data5/WQ/PI/GLADMIN-53522917/software-programing-courses-500x500.jpg\">\n" +
                "\n" +
                "<h3 style=\"color:blue;\">Mision tic 2022 grupo 33 - 34.</h3>\n" +
                "\n" +

                "<a href=\"/grupo\"><h2>conócenos</h2></a>\n" +

                "</body>\n" +
                "</html>\n ";
    }


    @GetMapping("/grupo")
    public String about() {
        return "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2 style=\"color:red;\">Workgroup Ciclo 3 Ds.</h2>\n" +
                "\n" +
                "<p style=\"font-size:50px\">&#128516; &#128516; &#128516; &#128516; &#128516;</p>\n" +
                "<h3 style=\"color:blue;\">Andres, Allison, Cindy, Ney, Zaymon </h3>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n ";
    }

  /*

    @GetMapping("/enterprises")
    public String Getenterprises() {
        return "allison es muy callada ";
    }
    @PostMapping
    public String postenterprises() {

    return "esto es un post";
    }


  @GetMapping(/enterprises/[id])
    @PatchMapping(/enterprises/[id])
    @DeleteMapping(/enterprises/[id])*/










}
