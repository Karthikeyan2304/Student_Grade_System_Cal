package package_student_list.com;

import java.util.Scanner;

public class Student_Grade_System {

	public static void main(String[] args) {
		  
System.out.println("****************************Welcome To Grade System App**************************\n");
			    Scanner sc = new Scanner (System.in);
			    System.out.println("Enter The Maths Mark Of The Student(100)"); 
                int maths=sc.nextInt();
                System.out.println("Enter The Science Mark Of The Student(100)"); 
                int science=sc.nextInt();
                System.out.println("Enter The Social Mark Of The Student(100)"); 
                int social=sc.nextInt();
                System.out.println("Enter The Computer Mark Of The Student(100)"); 
                int comp=sc.nextInt() ;
                System.out.println("Enter The Tamil Mark Of The Student(100)"); 
                int tamil=sc.nextInt() ;
                System.out.println("\n Grade Of The Student:"+gradeSystem(TotalMark(maths, science, social, comp, tamil)));
	}
	public static int TotalMark(int maths,int science,int social,int comp,int tamil) 
	{
		return maths+science+social+comp+tamil;
		
	} 
	
	public static String gradeSystem(int TotalMark) 
	{
		String Performance="";
		
		if(TotalMark >= 400 && TotalMark <= 500)
		{
					Performance="High Performer";
		}
		else if(TotalMark >= 300 && TotalMark <= 399)
		{
			Performance="Good Performer";
		}
		else if(TotalMark >= 200 && TotalMark <= 299)
		{
			Performance="Average Performer";
		}
		else if(TotalMark >= 0 && TotalMark <= 199)
		{
			Performance="Poor Performer";
		}
	return Performance;
	}
}




