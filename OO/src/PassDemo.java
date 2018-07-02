public class PassDemo {
	int data;
	void passInt(int val) {
		val=22;
	}
	void passObj(PassDemo ref) {
		ref.data=99;
	}
	void passData(int num) {
		num=10;
	}
	public static void main(String[] args) {
		int value=11;
		PassDemo pt=new PassDemo();
		pt.passInt(value);
		System.out.println(value);
		pt.data=101;
		pt.passObj(pt);
		System.out.println(pt.data);
		pt.passInt(pt.data);
		System.out.println(pt.data);
		
	}
}
