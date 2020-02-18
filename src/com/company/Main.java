package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


try {
    int num = Integer.parseInt(args[0]);      //vi har ændret i edit configuration > program arguments til 3 og den står på position 0 i array

    for (int i = 1; i <= 10; i++) {                  //tæller fra 1-10 op
        int result = i * num;                      // i = 1-10 * num = 3
        System.out.println(num + " x " + i + " = " + result);     //udskriver num= 3 x i= 1-10 = resultatet af gange udregningen.
    }
}catch(NumberFormatException e){
    System.out.println("input need to be an integer between 1 and 10");
}
    }
}
