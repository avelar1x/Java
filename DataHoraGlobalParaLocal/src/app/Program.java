package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate res1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // Obter Data Local
		System.out.println("Res1 = " + res1);
		
		LocalDate res2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // Obter Data do local instanciado
		System.out.println("Res2 = " + res2);
		
		LocalDateTime res3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // Obter DataHora Local
		System.out.println("Res3 = " + res3);
		
		LocalDateTime res4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); // Obter DataHora do local instanciado
		System.out.println("Res4 = " + res4);
		
		System.out.println("-------------------------------------------");

		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("-------------------------------------------");
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		System.out.println("d05 segundos = " + d05.getSecond());
	}

}
