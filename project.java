package main;
import java.util.Scanner;
import java.text.NumberFormat;
public class project {
	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Bir sayı girin: ");
		        int number = input.nextInt();

		        if (isPrime(number, 2)) {
		            System.out.println(number + " asal bir sayıdır.");
		        } else {
		            System.out.println(number + " asal bir sayı değildir.");
		        }
		    }

		    public static boolean isPrime(int number, int divisor) {
		        if (number <= 2) {
		            return (number == 2) ? true : false;
		        }

		        if (number % divisor == 0) {
		            return false;
		        } else if (divisor < Math.sqrt(number)) {
		            return isPrime(number, divisor + 1);
		        } else {
		            return true;
		        }
		    }
		}

