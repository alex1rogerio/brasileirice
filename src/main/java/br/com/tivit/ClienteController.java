package br.com.wck.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import br.com.wck.entity.Assunto;
import br.com.wck.entity.Motivo;
import br.com.wck.service.PessoaService;

@Controller
@RequestMapping("listaClientes")
public class ClienteController {
	
	DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	
	
	@Autowired
	PessoaService pessoaService; 
	

	@RequestMapping
	public ModelAndView menu(HttpSession httpSession) throws Exception {
		Gson gson = new Gson();
		Map<String, Object> retorno = new HashMap<String, Object>();

		Motivo motivo = new Motivo();
		motivo.setNmeMotivo("carro");
		motivo.setCodMotivo(0);
		
		
		List<Assunto> lstAssunto = new ArrayList<Assunto>();		
		Assunto assunto = new Assunto();
		assunto.setAssunto("Pneu");
		assunto.setMotivo(motivo);
		lstAssunto.add(assunto);
		
		Assunto assunto1 = new Assunto();
		assunto1.setAssunto("Porta");
		assunto1.setMotivo(motivo);
		lstAssunto.add(assunto1);
		
		Assunto assunto2 = new Assunto();
		assunto2.setAssunto("Janela");
		assunto2.setMotivo(motivo);
		lstAssunto.add(assunto2);


		Assunto assunto3 = new Assunto();
		assunto3.setAssunto("macaneta");
		assunto3.setMotivo(motivo);
		lstAssunto.add(assunto3);
		
		Assunto assunto4 = new Assunto();
		assunto4.setAssunto("vidros");
		assunto4.setMotivo(motivo);
		lstAssunto.add(assunto4);
		
		
		motivo.setListAssunto(lstAssunto);
		
		pessoaService.gravaPessoa(motivo);

		//retorno.put("clientes", pessoaService.listarPessoa());
		return new ModelAndView("listaCliente").addObject("result", gson.toJson(retorno));
	}	
	
	
	

}
