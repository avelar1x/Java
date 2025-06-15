package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastDays = d04.minusDays(15); // minus diminui
		System.out.println("pastDaysLocalDate = " + pastDays);
		
		LocalDate nextDays = d04.plusDays(15); // plus adiciona
		System.out.println("nextDaysLocalDate = " + nextDays);
		
		LocalDateTime pastWeek = d05.minusWeeks(1); // minus diminui
		System.out.println("pastWeekLocalDate = " + pastWeek);
		
		LocalDateTime nextWeek = d05.plusWeeks(1); // plus adiciona
		System.out.println("nextWeekLocalDate = " + nextWeek);
		
		LocalDate pastYear = d04.minusYears(1); // minus diminui
		System.out.println("pastYearLocalDate = " + pastYear);
		
		LocalDate nextYear = d04.plusYears(1); // plus adiciona
		System.out.println("nextYearLocalDate = " + nextYear);
		
		System.out.println("-------------------------------------------");

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // Remover com Instant
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // ADicionar com Instant
		System.out.println("nextWeekInstant = " + nextWeekInstant);

		System.out.println("-------------------------------------------");

		Duration t1 = Duration.between(pastWeek, d05); // Pegar a duração de uma data até a outra (LocalDateTime)
		System.out.println("t1 dias = " + t1.toDays () + " dias ");
		
		Duration t2 = Duration.between(pastYear.atStartOfDay(), d04.atStartOfDay()); // Pegar a duração de uma data até a outra (LocalDate)
		System.out.println("t2 dias = " + t2.toDays() + " dias");
		
		Duration t3 = Duration.between(pastWeekInstant, d06); // Pegar a duração de uma data até a outra (Instant)
		System.out.println("t3 dias = " + t3.toDays() + " dias ");
	}

}
