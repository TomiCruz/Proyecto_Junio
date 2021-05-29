package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.modelo.Producto;
import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.service.IProductoService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class AplicacionController {
	@Autowired
	IUsuarioService iUsuarioService;
	@Autowired
	IProductoService iProductoService;
	@SuppressWarnings("unused")
	@GetMapping({"/","/login","/home","/login?error=true"})
	public String Iniciar(Model model) {
		
		
	
				iProductoService.guardarProd(new Producto((long)1,"Hambureguesa", "1",Float.parseFloat("100.0"),Float.parseFloat("200.5")));
				
				
				Usuario bas=new Usuario((long)1,"userAdmin","1234","41136212","userAdmin","userAdmin","Admin");
			

		return "index";
	}
}
