/*
the try block is used to specify a block of code that may throw an exception.
The catch block is used to handle the exception if it is thrown.
The finally block is used to execute the code after the try and catch blocks have been executed.
*/




public class ExceptionHandling {
    public static void main(String[] args){
        try{
            System.out.println("try block");
             double n= 10%0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
    }
}
