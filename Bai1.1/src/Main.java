import java.util.Scanner;
 public class Main{
     public static void main(String[] args) {
         final String square = "square";
         final String triangle = "triangle";
         final String circle = "circle";
         System.out.print("Nhập hình dạng của viên gạch: ");
          Scanner in = new Scanner(System.in);
          String type = in.nextLine();
          double area = 0.0;

          if(type.equals(square)){
              System.out.print("Nhập độ dài của cạnh: ");
              int a = in.nextInt();
              area = Math.pow(a,2);
              System.out.println("Diện tích viên gạch là: " + area);
          }
          else if(type.equals(triangle)){
              System.out.print("Nhập cạnh của viên gạch: ");
              int x = in.nextInt(); int y= in.nextInt();
              int z = in.nextInt();
              double p = (double)(x+y+z)/2;
              area = Math.sqrt(p*(p-x)*(p-y)*(p-z));
              System.out.printf("Diện tích của viên gạch là: %.1f", area );
          }
          else if(type.equals(circle)){
              int r ;
              do{
                  System.out.print("Nhập bán kính viên gạch: ");
                  r = in.nextInt();
                  if(r <= 0){
                      System.out.print("Nhập lại bán kính viên gạch: ");
                  }
              } while(r <= 0);
              area = Math.PI*Math.pow(r,2);
              System.out.printf("Diện tích viên gạch là: %.2f", area);
          }
          else{
              System.out.println("Hình dạng viên gạch không hợp lệ! ");
              System.exit(0);
          }
     }
 }
