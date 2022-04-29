package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cotiinformatica.models.PasswordModel;

@Controller
public class PasswordController {
	
	//M�todo para mapear a p�gina recuper��o de senha
	@RequestMapping(value="/password") // URL da p�gina (ROTA)
	public ModelAndView password() {
		
		//define qual � a p�gina jsp que ser� aberta 
		//WEb-INF/view/login.jsp
		ModelAndView modelAndView = new ModelAndView("password");
		
		modelAndView.addObject("model", new PasswordModel());

		return modelAndView;

	}
	
}


