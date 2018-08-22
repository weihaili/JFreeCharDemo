package org.cn.kkl.demo;

import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		instance.setTime(new Date());
		System.out.println(instance.get(Calendar.YEAR));

	}

}
