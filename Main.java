import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    
    do {
      System.out.println("Press 1 to learn about salary. ");
      System.out.println("Press 2 to learn about the job. ");
      System.out.println("Press 3 to learn about demand. ");
      System.out.println("Press 4 to view current students. ");
      System.out.println("Press 5 to quit. ");
      
      String read = scanner.next();
      
      if (read.equals("1")) {
        System.out.println("$98,345 average salary in South Florida! "+"\n") ;
         
      }
      if (read.equals("2")) {
        System.out.println("US News - 100 Best Jobs!"+"\n");
        
      }
      if (read.equals("3")) {
        System.out.println("Top 10 Forbes In-Demand Jobs!"+"\n");
        
      }
      if (read.equals("4")) {
        System.out.println("Current Students:");
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
 
    try {
        String line;
        while ((line = br.readLine()) != null) {
           System.out.println(line);
        }
    } finally {
        br.close();
    }
      }
      if (read.equals("5")) {
        break;
      } 
    } 
      while (true);
  }
}