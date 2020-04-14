package poo.atividade2.atividade2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import poo.atividade2.atividade2.Entity.Funcionario;
import poo.atividade2.atividade2.Service.FuncService;

@Controller
public class FuncController {

    @Autowired
    private FuncService fs;

    @GetMapping("/funcionarios")
    public ModelAndView getFunc()
    {
        ModelAndView mv = new ModelAndView("funcTemplate");
        mv.addObject("funcs", fs.getAllFunc());
        return mv;
    }

    @PostMapping("/save")
    public String addFunc(@ModelAttribute Funcionario func)
    {
        fs.saveFunc(func);
        return "redirect:/funcionarios";
    }

}