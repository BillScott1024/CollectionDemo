import java.awt.Window.Type;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Signup {
	private String strName;
	private String strPass;

	public Signup(String name,String password){
		this.strName = name;
		this.strPass = password;
		
	}
	
	public static void ser(ArrayList<Person> arrList) throws Exception {
		File f = new File("D:" + File.separator + "info.txt");
		ObjectOutputStream oos = null;
		OutputStream out = new FileOutputStream(f); 		// 文件输出流
		oos = new ObjectOutputStream(out); 					// 为对象输出流实例化
		oos.writeObject(arrList);							// 保存对象数组到文件
		oos.close(); 										// 关闭输出
	}

}
