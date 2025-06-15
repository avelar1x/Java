package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2025-05-08"); // Usando Date.parse consigo definir a data
		LocalDateTime d05 = LocalDateTime.parse("2025-05-08T20:02:59"); // Usando DateTime.parse consigo definir data e hora 
		Instant d06 = Instant.parse("2025-05-08T20:02:59Z"); // Utilizando Instant consigo definir a data e hora no fuso horario de Londres
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

		System.out.println("do4 = " + d04.format(fmt1));// Respeita o formato escolhido
		System.out.println("do4 = " + fmt1.format(d04));
		
		System.out.println("do5 = " + d05.format(fmt2));
		
		System.out.println("do6 = " + fmt3.format(d06)); // Formatação de Instant

		System.out.println("do5 = " + d05.format(fmt4));
	}

}
