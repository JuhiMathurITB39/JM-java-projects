package example;
public class exception3 {
    public static void main (String args[]){
        try{
            try{
                System.out.println(x:"going to divide");
                int b=39/0;

            }catch(ArithmeticException e){System.out.println(e);}
            try {
                int a[]=new int [5];
                a[5]=4;

            }catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
            System.out.println(x:"Other Statement");
        }catch(Exception e) {System.out.println(x:"handeled");}
        System.out.println(x: "normal flow..";)
    }
}