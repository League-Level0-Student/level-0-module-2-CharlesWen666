package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
public static void main(String[] args) {
	String a= JOptionPane.showInputDialog("chose a number from 0-50");
	String b= JOptionPane.showInputDialog("chose another number from 0-50");
	String c= JOptionPane.showInputDialog("chose the third number from 0-50");
	String d= JOptionPane.showInputDialog("chose the fourth from 0-50");
	String e= JOptionPane.showInputDialog("chose the fifth number from 0-50");
	String f= JOptionPane.showInputDialog("chose the sixth number from 0-50");
	Random last = new Random();
	String g=""+last.nextInt(51);
	if(g.equals(a)||g.equals(b)||g.equals(c)||g.equals(d)||g.equals(e)||g.equals(f)) {
		a+=","+b;
		a+=","+c;
		a+=","+d;
		a+=","+e;
		a+=","+f;
		System.out.println("your lottery:"+a);
		System.out.println("The lucy number:"+g);
		System.out.println("Congratulation! You win!");
	}

	else {
		a+=","+b;
		a+=","+c;
		a+=","+d;
		a+=","+e;
		a+=","+f;
		System.out.println("your lottery:"+a);
		System.out.println("The lucky number:"+g);
		System.out.println("Sorry! You didn't win!");
	}
	
	
	
}
}
