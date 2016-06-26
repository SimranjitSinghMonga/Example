class Employee
{
   String empId,empName;
   double salary;
   
  Employee(String empId,String empName,double salary)
   {
      this.empId=empId;
      this.empName=empName;
      this.salary=salary;  
   }   
  public void getDetails()
   {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(salary);   
   }

}
class Manager extends Employee
{
  public String empDept;
   Manager(String empId,String empName,double salary,String empDept)
    {
    super(empId,empName,salary);
    this.empDept=empDept;
    }
  public void getDetails()
   {
     super.getDetails();
    System.out.println(empDept);

   }
  
}
class Admin extends Employee
{
   public String adminType;
   public Admin(String empId,String empName,double salary,String adminType)
    {
         super(empId,empName,salary);
         this.adminType=adminType;
    }
    public void getDetails()
    {
     super.getDetails();
     System.out.println(adminType);
    }
}
class EmployeeStock
{
  public double Calculate(Employee e)
  {
    if(e instanceof Manager)
     {
       return 2*e.salary;
     }
    else
     {
       return 3*e.salary;
     } 
  }
 

}
public class AExecute
{
  public static void main(String[] args)
   {
    EmployeeStock e=new EmployeeStock(); 
    Manager m=new Manager("101","Simran",1200,"IT");
   double sp= e.Calculate(m); 
   m.getDetails();
   System.out.println("Stock Value : "+sp);
System.out.println("**********************************************");
    Admin a=new Admin("102","Rajesh",2400,"Senior");
    sp=e.Calculate(a);
    a.getDetails();
    System.out.println("Stock Value : "+sp);
   }
}












