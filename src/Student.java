import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public  class Student extends Person implements Serializable
{
	public Student (String name, String password) {		// ͨ�����췽��������������
		this.strName = name;
		this.strPass= password;
	}
	public String toString() {			// ��дtoString()����
		return "������" + this.strName + "�����룺" + this. strPass;
	}
	
	public static ArrayList<Student>  dser() throws Exception {
		File f = new File("D:" + File.separator + "info.txt");
		ObjectInputStream ois = null;
		InputStream input = new FileInputStream(f);		// �ļ�������
		ois = new ObjectInputStream(input); 			// Ϊ���������ʵ����
		ArrayList<Student> arrList= (ArrayList<Student>) ois.readObject();// ��ȡ��������
		ois.close(); 									// �ر����
		return arrList;
	}


	public boolean Login(String inName,String inPass)
		{
			if( this.strName.equals(inName) && this.strPass.equals(inPass))
			{
				return true;
			}
			else
				return false;
			
		}
}
