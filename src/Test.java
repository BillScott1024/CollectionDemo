import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  per1[] = new Student[6];
		Teacher  per2[] = new Teacher[6];
		Admin  per3[] = new Admin[6];
		per2[0] = new Teacher("Zhang","zhang");
		per2[1] = new Teacher("Li","li");

		per1[2] = new Student("Wang","wang");
		per1[3] = new Student("Cheng","cheng");

		per3[4] = new Admin("Admin","admin");
		per3[5] = new Admin ("Wu","wu");

		//输入用户名和密码
		System.out.println("Input the username and password:\n");
		for(int i=0;i<6;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			String userName = sc1.next();
			String passWord = sc2.next();
			if( ( per1[i]).Login(userName,passWord))
			{
				System.out.println(" login success!");
			}
			else
			{
				System.out.println(" login failue !");
			}
		  
		}
	}

}
