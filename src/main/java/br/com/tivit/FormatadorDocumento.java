package br.com.tivit;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;

public class FormatadorDocumento {

	public static void main(String[] args) {
		
		String cpf = "172.387.938-06";		
		String cnpj = "86.555.785/0001-84";		
		
		CPFFormatter cpfFormatter = new CPFFormatter();
		String cpfSemFormatacao=cpfFormatter.unformat(cpf);
		System.out.println(cpfSemFormatacao);
		
		CNPJFormatter cnpjFormatter = new CNPJFormatter();
		String cnpjSemFormatacao= cnpjFormatter.unformat(cnpj);
		System.out.println(cnpjSemFormatacao);
		
		System.out.println(cpfFormatter.format("17238793806"));
		
		
	}
	
}
