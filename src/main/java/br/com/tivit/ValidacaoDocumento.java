package br.com.tivit;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {
		
		String cpf = "17238793806";		
		try{
			validaDocumento(new CPFValidator(), cpf);
			System.out.println("CPF V�lido!");
		}catch(InvalidStateException e){
			System.out.println("CPF Inv�lido!"+e.getMessage());
						
		}
		
		String cnpj = "85636742000160";		
		try{
			validaDocumento(new CNPJValidator(), cnpj);
			System.out.println("CNPJ V�lido!");
		}catch(InvalidStateException e){
			System.out.println("CNPJ Inv�lido!"+e.getMessage());
						
		}
		
	}
	
	private static void validaDocumento(Validator<String> validator , String doc){
		
		validator.assertValid(doc);
	}
	
	
}
