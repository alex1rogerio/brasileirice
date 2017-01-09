/**
 * 
 */
package br.com.tivit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

/**
 * @author Alexandre
 *
 */
public class Cep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ViaCEPClient cepClient = new ViaCEPClient();
		
		try {
			ViaCEPEndereco end=	cepClient.getEndereco("09371100");
			System.out.println(end.getLogradouro());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
