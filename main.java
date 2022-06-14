import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your divider : ");
        int x = sc.nextInt();
        dividerCal obj = new dividerCal(x);
        obj.display();
    }
}