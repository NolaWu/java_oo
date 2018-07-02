public class StaticBlockDemo {
	int num;
	static int count;
	static {
		count=10;
	}
	public static void main(String[] args) {
		StaticBlockDemo sbd=new StaticBlockDemo();
		System.out.println(count);
		System.out.println(sbd.num+1);
		System.out.println(count+1);
		
	}
}
