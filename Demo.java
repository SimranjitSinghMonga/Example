class Employee
{
   public String ename,eid;
  protected void   Info()
    {
     ename="Simran";
     eid="101";   
 System.out.println("Ename : "+ename+ "Employee ID : "+eid);
    }
}
class Demo extends Employee
{
  public String eDept;
  It will not execute as it has weaker access than parent class
//private void Info()
   {
     ename="Simran";
     eid="101";
     eDept="IT";
System.out.println("EID : "+eid+" Ename : "+ename+" EDept : "+eDept);
   }
 public static void main(String[] args)
  {
   Demo d=new Demo();
  d.Info();
  }
}