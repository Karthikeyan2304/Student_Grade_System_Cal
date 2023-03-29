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
              
                //  Passing  TotalMark() Result in Tmark(Varaible)
                
                int Tmark=TotalMark(maths, science, social, comp, tamil);
                System.out.println("\nTotal Mark:"+Tmark);
               
                
                // Passing gradeSystem() Result in Sperformer(Varaible);
                
                
                String Sperformer=gradeSystem(Tmark);
                System.out.println("\nGrade Of The Student:"+Sperformer);
                
	}
	
	public static int TotalMark(int maths,int science,int social,int comp,int tamil) 
	{
	 
	return  maths+science+social+comp+tamil;
	} 
	
	public static String gradeSystem(int TMark) 
	{
		String Performance="";
		
		if(TMark >= 400 && TMark <= 500)
		{
					Performance="High Performer";
		}
		else if(TMark >= 300 && TMark <= 399)
		{
			Performance="Good Performer";
		}
		else if(TMark >= 200 && TMark <= 299)
		{
			Performance="Average Performer";
		}
		else if(TMark >= 0 && TMark <= 199)
		{
			Performance="Poor Performer";
		}
	return Performance;
	}

}


