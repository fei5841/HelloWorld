package com.liuchunshu;

import java.math.BigInteger;
import java.util.Random;
import java.util.stream.IntStream;

//{args: A B C} 
public class Test {

	public static void main(String[] args) {
//		System.getProperties().list(System.out);
//		System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("java.library.path"));
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

//		int i=1;
//		System.out.println("i:"+i);
//		System.out.println("++i:"+(++i));
//		System.out.println("i:"+i);
//		System.out.println("i++:"+(i++));
//		System.out.println("i:"+i);
		
//		System.out.println("i:"+i);
		
//		int i=0;
//		while(i++<10){
//			System.out.println(i);
//		}
//		System.out.println("*********");
//		i=0;
//		while(++i<10){
//			System.out.println(i);
//		}
		
//		Random rand=new Random();
//		System.out.println(rand.nextBoolean());
//		System.out.println(rand.nextBoolean());
//		System.out.println(rand.nextBoolean());
//		System.out.println(rand.nextBoolean());
//		System.out.println(rand.nextBoolean());
//		System.out.println(rand.nextBoolean());
		
//		float f=1.39E-1F;
//		System.out.println(f);
//		f=1.39e-1f;
//		System.out.println(f);
		
//		int i=10,j=16;
//		System.out.println(Integer.toBinaryString(i));
//		System.out.println(Integer.toBinaryString(j));
//		
//		int b=i^j;
//		System.out.println(b);
//		System.out.println(Integer.toBinaryString(b));
		
//		BigInteger bi=BigInteger.valueOf((long) Math.pow(2, 32));
//		bi=new BigInteger("11",7);
//		
//		System.out.println(bi);
//		double i= Math.pow(2, 31)-1;
//		String s=Integer.toBinaryString((int)i);
//		System.out.println("i:"+i+"; **"+s+"** ;length:"+s.length());
//		i= Math.pow(-2, 31);
//		s=Integer.toBinaryString((int)i);
//		System.out.println("i:"+i+"; **"+s+"** ;length:"+s.length());
//		for(int i=-1;i>-10;i--){
//			String s=Integer.toBinaryString(i);
//			System.out.println("i:"+i+"; **"+s+"** ;length:"+s.length());
//			int j=Math.abs(i);
//			s=Integer.toBinaryString(j);
//			System.out.println("j:"+j+"; **"+s+"** ;length:"+s.length());
//		}


//		label1:
//			for(int i=0;i<10;i++){
//				int j=i+1;
//				while(j<20){
//					j++;
//					if(j%2==0){
//						System.out.println(j);
//					}else{
//						continue;
//						continue label1;
//					}
//				}
//			}
		String str="baa1";
		switch(str){
			case "aaa1":System.out.println("a1");break;
			case "baa1":System.out.println("b1");break;
			case "caa1":System.out.println("c1");break;
			default:System.out.println("&&&&");
		}
	}

}
