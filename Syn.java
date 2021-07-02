package me.rootedsmp.synattack;

import java.util.HashSet;
import java.util.Set;

public class Syn {
	
	public static void main(String[] args) {
		Set<Thread> threads = new HashSet<>();
		String x = args[0];
		int k = Integer.parseInt(args[1]);
		int f = Integer.parseInt(args[2]);
		
		for(int p =0; p < f; p++) {
			threads.add(new Thread(new SynRunnable(x, k)));
		}
		
		for (Thread thread : threads) {
			thread.start();
		}
	}
	
}
