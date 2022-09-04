package com.DeepBay.demo.controller.holamundo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/grupo")

public class about {
    @GetMapping
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
    }

