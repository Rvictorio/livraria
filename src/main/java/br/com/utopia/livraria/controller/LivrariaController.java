package br.com.utopia.livraria.controller;


import br.com.utopia.livraria.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LivrariaController {

    List<Livro> livros = new ArrayList<>();

    @GetMapping("/livraria")
    public String livraria(){
        return "livraria";
    }

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Model model) {
        model.addAttribute("livro", new Livro());
        return "formulario";
    }

    @GetMapping("/lista")
    public String lista(Model model) {
        model.addAttribute("livros", livros);
        return "lista";
    }
//
    @PostMapping("/formulario")
    public String formulario(Livro livro){
        System.out.println("Dados do livro(" +livro.getTitulo() + livro.getAutor() + ")");
        livros.add(new Livro(livro.getTitulo(), livro.getAutor()));
        return "/formulario";
    }
    //
    @PostMapping("/salvarLivro")
    public String salvarLivro(Livro livro) {
        livros.add(livro);
        return "redirect:/lista";
    }


}
