package testing;
import demo.Foo;
public class Bar extends Foo
{
 private int sum=10;
   public void Info()
    {
   sum+=result;
 System.out.println(sum);
 System.out.println("Hello");
    }
public void greet()
{
System.out.println("hello");
}
 public static void main(String[] args)
   {
     Bar b=new Bar();
     b.Info();
   }
 
}