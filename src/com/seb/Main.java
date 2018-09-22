	package com.seb;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

        public class Main {
            private static DecimalFormat df2 = new DecimalFormat(".##");

            public static void main(String[] args) {


                Scanner input = new Scanner(System.in);


//Ask the user for input of the name and price of item01 and item02
                System.out.println("Insert Item 01 : ");
                String item01 = input.nextLine();
                System.out.println("Please insert the price of Item 01 : ");
                double price01 = input.nextDouble();
                input.nextLine();

                System.out.println("Insert Item 02 : ");
                String item02 = input.nextLine();
                System.out.println("Please insert the price of Item 02 : ");
                double price02 = input.nextDouble();

//Generating a random number for the quantity
                Random rd= new Random();
//Declare integer variable to hold the random number for the quantity of item01 and item02
                int quantiy01=rd.nextInt(10) + 1;
                int quantiy02=rd.nextInt(10) + 1;

//Calculate the total cost for each item and the total amount spent
                double totalcost01 = (price01 * quantiy01);
                double totalcost02 = (price01 * quantiy02);
                double totalamount = (totalcost01 + totalcost02);

                System.out.println("\n\nItem Name\t\t   Price\t\t   Quantity\t\t   Cost \n");
                System.out.println(item01 + "    \t\t\t"  + "$" + df2.format(price01) + "     \t\t\t"  + quantiy01 +  " \t\t\t"+ df2.format(totalcost01));
                System.out.println(item02 + "  \t\t\t"  + "$" + df2.format(price02)  + "   \t\t\t" + quantiy02 + " \t\t\t" + df2.format(totalcost02));
                System.out.println("\n\n\n\t\tTotal purchase amount is  =$" + df2.format(totalamount) );

//Check if the total amount spent is greater than 20$
                if(totalamount>=20){
                    System.out.println("\n\t    You spent too much today!");
                }
                else
                    System.out.println("\n\t    Thank you for shopping at my market");


            }


        }


