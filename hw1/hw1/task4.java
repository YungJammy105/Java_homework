package hw1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
    
        
                Scanner in = new Scanner(System.in);
                System.out.print("Введите уравнение, пример(2?4 + 5??5 = 5259)\n => ");
                String[] input = in.nextLine().split(" "); // ["2?","+","?5","=","69"]
                in.close();
        
                String firstNumStr = input[0];
                String secondNumStr = input[2];
                String test = "";
                String temp1, temp2;
        
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        temp1 = firstNumStr.replace("?", String.valueOf(i));
                        temp2 = secondNumStr.replace("?", String.valueOf(j));
                        test = temp1 + " " + input[1] + " " + temp2;
        
                        if (Integer.parseInt(temp1) + Integer.parseInt(temp2) == Integer.parseInt(input[4])) {
                            System.out.println(test + " = " + input[4]);
                            return;
                        }
                    }
                }
                System.out.println("Решения нет");
            }
        }