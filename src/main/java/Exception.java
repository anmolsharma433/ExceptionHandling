public class Exception {
    public static  void main(String[] args)
    {
        int a =25;
        int b= 5;
        int c;

        int x[]={1,2,3};

        System.out.println("Start");
        try {
            x[8] =1000;
            c = a / b;
            System.out.println(" C: " +c);
        }
        catch (java.lang.Exception ae)
        {
            System.out.println(ae.toString());
        }
        finally {
            System.out.println("i handle all the errors");
        }

        System.out.println("End");
    }
}
