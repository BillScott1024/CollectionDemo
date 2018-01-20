import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public  class Student extends Person implements Serializable
{
	public Student (String name, String password) {		// 通过构造方法设置属性内容
		this.strName = name;
		this.strPass= password;
	}
	public String toString() {			// 覆写toString()方法
		return "姓名：" + this.strName + "；密码：" + this. strPass;
	}
	
	public static ArrayList<Student>  dser() throws Exception {
		File f = new File("D:" + File.separator + "info.txt");
		ObjectInputStream ois = null;
		InputStream input = new FileInputStream(f);		// 文件输入流
		ois = new ObjectInputStream(input); 			// 为对象输出流实例化
		ArrayList<Student> arrList= (ArrayList<Student>) ois.readObject();// 读取对象数组
		ois.close(); 									// 关闭输出
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
