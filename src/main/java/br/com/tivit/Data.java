package br.com.tivit;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {

	public static void main(String[] args) {
		
		LocalDate hj = LocalDate.now();
		System.out.println(hj);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println( hj.format(formatador) );
		
		LocalDateTime hora = LocalDateTime.now();
		System.out.println(hora);
		DateTimeFormatter hformatador = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println( hora.format(hformatador) );
		
		DateTimeFormatter formaCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt" , "br"));
		System.out.println( hora.format(formaCurto) );
		System.out.println(hora.minusHours(5));
		System.out.println(hora.plusHours(9));
		
		
	}
	
	
}
