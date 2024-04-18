import java.util.Scanner;
 public class Hospital {
	 Scanner scr = new Scanner(System.in);
        String name;
        double[] doub = new double[100];
        double amountdue;
        double  amountpaid;
        double totalamount;
        Hospital(String name){
        	this.name = name;
        	amountdue=0;
        	amountpaid=0;
        	totalamount=0;
        }
      public void generatepaymentdetails(){
    	  System.out.println("patient name :"+ " " + name );
    	  System.out.println("total amount to be paid:"+ " "+ totalamount);
    	  System.out.println("amount paid:"+" "+amountpaid);
    	  System.out.println("due:"+" "+ (totalamount-amountpaid));
      }
      public void  editpaymentdetails(double a,double b ) {
    	   this.amountdue= a-b;
    	   this.amountpaid = b;
    	   this.totalamount = a;
      }
      public void paymentways(int n) {
    	  int a =n;
    	  double count=0;
    	  double[] b = new double[n];
	  this.doub = b;
    	  for(a=0;a<n;a++) {
    		  System.out.println("Enter the "+" "+ (a+1)+" "+"payment patient has done" );
    		  b[a] =  scr.nextDouble();
    		  count += b[a];
    	  }
    	  this.amountpaid=count;
      }
      public void allpaymentsdone() {
    	  for(int j=0;j<doub.length;j++) {
    		  System.out.println("The amount the patient paid for" +" " +j+ " time is:"+" "+doub[j]);
    	  }
      }
}
class Diagnosis {
	 Scanner sc = new Scanner(System.in);
	String name;
        Diagnosis(String name){
        	this.name = name;
	}
      public void diagnosisdetails()
      {
	System.out.println("The diagnosis that patient is suffering from is: "+name);
      }
      public void editdiagnosis(int a)
      {
	if(a==1)
	{
	  System.out.println("What is the update in diagnosis details:");
	  String s = sc.nextLine();
	  System.out.println("There is an update in the diagnosis detail: "+name+","+s);
	}
	else
	{
	  System.out.println("There is no update, the diagnosis detail is: "+name); 
	}
      }
      public void querydiagnosis(int choice)
      {
 	switch(choice)
	{
	   case 1: System.out.println("There is an update in diagnosis details");
	   break;
	   case 0: System.out.println("There is no change in diagnosis details");
	   break;
	}
      }
      public void generatereport(double a,double b,double c,double d)
      {
	System.out.println("Haemoglobin percentage: "+a);
	System.out.println("White Blood Cells count: "+b);
	System.out.println("Platelets count: "+c);
	System.out.println("ESR count: "+d);
      }
}

 class checkus{
	 public static void main(String args[]) {
		 Scanner scr1 = new Scanner(System.in);
		 System.out.println("Enter the patients name:");
		 String name = scr1.nextLine();
		 Hospital obj = new Hospital(name);
		 System.out.println("Enter the total bill to be paid by patient");
		 double a = scr1.nextDouble();
		 System.out.println("Enter the total bill paid by the patient");
		 double b = scr1.nextDouble();
		 obj.editpaymentdetails(a,b);
		 obj.generatepaymentdetails();
		 System.out.println("Please enter the number of transactions the patient had made:");
		  int k = scr1.nextInt();
		 obj.paymentways(k);
		 obj.allpaymentsdone();
		 obj.generatepaymentdetails();
		 System.out.println("Enter the diagnosis details:");
		 String name1 = scr1.nextLine();
		 Diagnosis o = new Diagnosis(name1);
		 o.diagnosisdetails();
		 System.out.println("Query in diagnosis: 1 or 0");
		 int m = scr1.nextInt();
		 o.querydiagnosis(m);
		 System.out.println("Update in diagnosis details: 1 or 0");
		 int n = scr1.nextInt();
		 o.editdiagnosis(n);
		 System.out.println("Enter hb percentage:");
		 double w = scr1.nextDouble();
		 System.out.println("Enter WBC percentage");
		 double x =scr1. nextDouble();
		 System.out.println("Enter platelets count");
		 double y = scr1.nextDouble();
		 System.out.println("Enter esr count");
		 double z = scr1.nextDouble();
		 o.generatereport(w,x,y,z);
	 }
 }
 
