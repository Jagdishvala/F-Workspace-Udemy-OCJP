import java.time.LocalDate;

public class LocalDateCompare {
	public static void main(String[] args) {
		LocalDate currentDate =LocalDate.now();
			System.out.println(currentDate);
		LocalDate newDate=currentDate.plusDays(5);
			System.out.println(newDate);
		String strDate="2019-12-10";
		System.out.println(currentDate.isEqual(strDate));
		
		
	}

}
