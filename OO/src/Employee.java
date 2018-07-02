public abstract class Employee {
	private int empno; //封裝
	private String name;
	private static int empcount;
	public static int getEmpcount() {
		return empcount;
	}
	public Employee(int empno,String name){ //這樣就能使用(傳參數)Employee e2=new Employee(2,"YT");
		this.empno=empno; // this.empno 是instance variable		
		this.name=name; // name 是local variable
		empcount++;
		//System.out.println("有參數的建構子");
	}
	public Employee(){
		empcount++;
		//System.out.println("空的建構子");
	} //這樣就能使用new Employee();
	//這樣就能存取private的變數了 ----start----
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno=empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//----end----
	public void display() {
		System.out.println("NO: "+empno);
		System.out.println("Name: "+name);
	}
	public abstract double paySalary();
	public void raiseSalary(Employee e) {
		if(e instanceof Permanent) {
			Permanent p=(Permanent) e;
			//p.salary*=1.05;
			p.setSalary(p.getSalary()*1.05); // 因為salary變成private 要做運算要setSalary(getSalary())
		}else if(e instanceof Temporary) {
			Temporary t=(Temporary)e;
			//t.hourPay+=20;
			t.setHourPay(t.getHourPay()+20);
		}
		
	}
}
