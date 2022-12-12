package com.Timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;

public class TimerTest {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		System.out.println("남은시간(초)");
		Runnable runnable = new Runnable() {
			int countdownStarter =10;

			public void run() {

				System.out.print(countdownStarter + " ");
				countdownStarter--;

				if (countdownStarter < 0) {
					System.out.println("\r시간초과");
					scheduler.shutdown();
				}
			}
		};
		scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
	}
}
