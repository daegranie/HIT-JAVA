import java.util.Scanner;
public class Main{
    private static boolean kiemTradoixung(String str){
        int left = 0; int right = str.length() -1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = input.nextLine();
        boolean chuoiDoixung = kiemTradoixung(str);
        if(chuoiDoixung){
            String viethoa = str.toUpperCase();
            System.out.println("Chuỗi đối xứng, viết hoa: " + viethoa);
        }
        else {
            String vietthuong = str.toLowerCase();
            System.out.println("Chuỗi không đối xứng, viết thường: " + vietthuong);
        }
    }
}