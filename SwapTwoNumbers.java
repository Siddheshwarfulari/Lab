public class SwapTwoNumbers{

 public static void main(String []args) {
   
   int first = 7, second = 10;

   System.out.println("--Before swap--");
   System.out.println("first number = " + first);
   System.out.println("second number = "+ second);

   int temporary = first;

   first = second;
 
   second = temporary;

   System.out.println("--After swap--");
   System.out.println("first number = " + first);
   System.out.println("second number = "+ second);
}
}