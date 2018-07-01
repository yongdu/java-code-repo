package Independency;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class main {

		public static void main(String[] args) {
			Book book1 = new BookService(new IsbnGenerator()).createBook("Java EE Step1");
			Book book2 = new BookService(new IssnGenerator()).createBook("Java EE Step2");
			
			String s1= "01";
			BigDecimal b1 = new BigDecimal("3") ;
			
			BigDecimal s3 = new BigDecimal(s1);
			
			Date old = new Date(117,11,30);
			Calendar startCalendar = new GregorianCalendar();
			startCalendar.setTime(old);
			
			Calendar endCalendar = new GregorianCalendar();
			Date current = new Date();
			//Date current= Calendar.getInstance().getTime();
			endCalendar.setTime(current);
			//System.out.println("old date Yeas: " + old.getYear() + "old date month  " + old.getMonth() + "Day  "+ old.getDay());
			//System.out.println("New date Yeas: " + current.getYear() + "New date month" + current.getMonth() + "Day  "+ current.getDay());
			
			

			int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
			int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
			int diffDay = diffMonth * 30 + endCalendar.get(Calendar.DAY_OF_MONTH) - startCalendar.get(Calendar.DAY_OF_MONTH);


			System.out.println("Start calendar : " + startCalendar.get(Calendar.YEAR) +"-" + startCalendar.get(Calendar.MONTH)+"-" + startCalendar.get(Calendar.DAY_OF_MONTH));
			System.out.println("end calendar : " + endCalendar.get(Calendar.YEAR) +"-" + endCalendar.get(Calendar.MONTH)+"-" + endCalendar.get(Calendar.DAY_OF_MONTH));
			

			System.out.println("Number of months since James gosling moth : " + diffMonth);
			System.out.println("Sir James Gosling's year : " + diffYear);
			System.out.println("Sir James Gosling's day : " + diffDay);

			
			
			int a = 3;
			int b = 4;
			System.out.println("a > b" + (a==b?"Equal":a<b?"Yes":"NO" ) );
			
			System.out.println("b1 > s1" + (b1.compareTo(s3) ) );
			
			
			System.out.println("#" + book1.getTilte()+ "\t" + book1.getNumber() );
			
			System.out.println("#" + book2.getTilte()+ "\t" + book2.getNumber() );
			
			
		}
		
		int MonthsDiff(Date start, Date current){
		
			Calendar startCalendar = new GregorianCalendar();
			startCalendar.setTime(start);
			Calendar endCalendar = new GregorianCalendar();
			endCalendar.setTime(current);
			int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
			int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
			int diffDay = diffMonth * 30 + endCalendar.get(Calendar.DAY_OF_MONTH) - startCalendar.get(Calendar.DAY_OF_MONTH);
			
			if(diffMonth<0) {return 100;}
			return diffDay;
			
		}
		
		
		
		
}
