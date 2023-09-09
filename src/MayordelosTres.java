import java.util.*;

public class MayordelosTres {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int a= input.nextInt();
       int b= input.nextInt();
       int c= input.nextInt();
       int mayor=0;

       if((a>b) && (a>c)){
           mayor=a;
       }
       else if((b>a) && (b>c)){
           mayor=b;
       }
       else if((c>a) && (c>b)){
           mayor=c;
       }
        System.out.println(mayor);

    }

}