package jp.co.goalist.training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Training {

	public static void main(String[] arg) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		DateFormat df = new SimpleDateFormat("M月d日");
		String dateStr = df.format(cal.getTime());
		System.out.println("明日の日付は" + dateStr + "です。");
	}
}
