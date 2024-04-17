package advance.dev;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		p.name = "Thanh";
        p.age = 18;
        p.dtb = 7.6;
        p.Address = "Thua Thien Hue";
        System.out.println(p.name+"\n"+p.age+"\n"+p.dtb+"\n"+p.Address);
	}

}
