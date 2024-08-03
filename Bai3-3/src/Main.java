import java.util.Scanner;
  public class Main{
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          int a = (int) (Math.random()*11);
          int b = (int) (Math.random()*11);
          int c = (int) (Math.random()*21);
         // kiểm tra xem a + b = c ?
          boolean isCorrect = (a + b == c);
          // đổi vị trí a và b
          if (!isCorrect) {
              int temp = a;
              a = b;
              b = temp;
          }

          System.out.println("Kết quả phép tính: " + a + " + "  + b + " = " + c);
          System.out.print("Phép tính trên đúng hay sai: (Y/N): ");
          String anwer = input.nextLine();
          // so sánh câu trả lời với ket quả
          if((anwer.equalsIgnoreCase("Y")) && isCorrect
                  || anwer.equalsIgnoreCase("N") && !isCorrect){
              System.out.print("True!");
          }
          else {
              System.out.print("False!");
          }
      }
  }