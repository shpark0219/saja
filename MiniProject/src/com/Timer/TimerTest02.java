package com.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest02 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(null, 0, 0);

	}

}
