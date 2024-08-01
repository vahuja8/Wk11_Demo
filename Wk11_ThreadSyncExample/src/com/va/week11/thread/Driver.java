package com.va.week11.thread;

public class Driver {

	public static void main(String args[]) throws InterruptedException {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj); // creates object
		MyThread2 t2 = new MyThread2(obj);

		System.out.println("Info about t1 thread: " + t1.getPriority() + t1.getState());
		System.out.println("Info about t2 thread: " + t2.getPriority() + t2.getState());
		t1.start(); // start the thread!!.
		t1.join(); // waits for the thread to terminate! or use sync the method.
		t2.start();
		System.out.println("Info about t1 thread: " + t1.getPriority() + t1.getState());
		System.out.println("Info about t2 thread: " + t2.getPriority() + t2.getState());

	}
}