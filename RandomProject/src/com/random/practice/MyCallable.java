package com.random.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public String call() throws Exception {
//		Thread.sleep(1000);
//		// return thread name executing this callable task
//		return Thread.currentThread().getName();
//	}
//	
//	public static void get(List<String> list){
//		System.out.println("first");
//		list.stream().forEach(System.out::println);
//	}
//	
////	public static void get(List<Integer> list){
////		System.out.println("second");
////		list.stream().forEach(System.out::println);
////	}
//
//	public static void main(String args[]) {
//		
//		List<String> one = new ArrayList<>();
//		List<Integer> two = new ArrayList<>();
//		
//		get(one);
//		get(two);
//		
////		String s1 = "Test";
////        String s2 = "Test";
////        String s3 = new String("Test");
////        final String s4 = s3.intern();
////        System.out.println(s1 == s2);
////        System.out.println(s2 == s3);
////        System.out.println(s3 == s4);
////        System.out.println(s1 == s3);
////        System.out.println(s1 == s4);
////        System.out.println(s1.equals(s2));
////        System.out.println(s2.equals(s3));
////        System.out.println(s3.equals(s4));
////        System.out.println(s1.equals(s4));
////        System.out.println(s1.equals(s3));
////        
////        System.out.println("--------");
////
////		ExecutorService executor = Executors.newFixedThreadPool(5);
////
////		List<Future<String>> list = new ArrayList<>();
////
////		Callable<String> callable = new MyCallable();
////
////		for (int n = 0; n < 8; n++)
////			list.add(executor.submit(callable));
////		
////		for (int n = 0; n < 8; n++){
////			try {
////				System.out.println(list.get(n).get());
////			} catch (InterruptedException | ExecutionException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
////		}
////
////		executor.shutdown();
////		
////		
//
//	}
//
}
