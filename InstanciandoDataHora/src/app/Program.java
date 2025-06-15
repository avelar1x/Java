package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Define um padrão de formatação
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now(); // Data atual do User
		LocalDateTime d02 = LocalDateTime.now(); // Data e hora atual do User
		Instant d03 = Instant.now(); // Data e hora no fuso horario de Londres
		
		LocalDate d04 = LocalDate.parse("2025-05-08"); // Usando Date.parse consigo definir a data
		LocalDateTime d05 = LocalDateTime.parse("2025-05-08T20:02:59"); // Usando DateTime.parse consigo definir data e hora 
		Instant d06 = Instant.parse("2025-05-08T20:02:59Z"); // Utilizando Instant consigo definir a data e hora no fuso horario de Londres
		Instant d07 = Instant.parse("2025-05-08T20:02:59-03:00"); // Especificando o Time Zone consigo definir a hora de certo local ( No console mostra o horario de Londres ) 
		
		LocalDate d08 = LocalDate.parse("08/05/2025", fmt1); // Passar data e chamar a formatação
		LocalDate d09 = LocalDate.parse("08/05/2025 20:22", fmt2); // Passar data e hora e chamar a formatação
		
		LocalDate d10 = LocalDate.of(2025, 5, 8); // Instanciar dia mes e ano isoladamente
		LocalDateTime d11 =LocalDateTime.of(2025, 5, 8, 20, 31);//Instanciar dia mes ano e hora isoladamente
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03); 
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);




		
	}

}
