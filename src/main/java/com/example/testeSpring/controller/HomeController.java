package com.example.testeSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") // @RequestMapping permite definir uma rota. Caso não seja informado o método HTTP da rota, ela será definida para todos os métodos.
public class HomeController {

    @GetMapping("/index/{dados}")
    // @PathVariable indica que o valor da variável virá de uma informação da rota;
    public String saudacao(@PathVariable String dados, ModelMap model) {
        model.addAttribute("nome", dados);


        return "index";
    }

}