package br.ufjf.dcc193.exm01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    PessoaRepository repPessoas;

    @RequestMapping("index.html")
    ModelAndView home(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("pessoa", p); 
        return mv;
    }
    
    @RequestMapping("form.html")
    String form(){
        return "form";
    }

    @RequestMapping("pessoas.html")
    ModelAndView pessoas(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pessoa-list");
        List<Pessoa> pessoas = repPessoas.findAll();
        mv.addObject("galera", pessoas);
        return mv;
    }

    @RequestMapping("novo.html")
    ModelAndView novo(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("novo");
        repPessoas.save(p);
        mv.addObject("pessoa",p);
        return mv;
    }

    @RequestMapping("deleta.html")
    ModelAndView deleta(Long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("deleta");
        repPessoas.deleteById(id);;
        return mv;
    }
}