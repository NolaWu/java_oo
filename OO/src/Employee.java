public abstract class Employee {
	private int empno; //�ʸ�
	private String name;
	private static int empcount;
	public static int getEmpcount() {
		return empcount;
	}
	public Employee(int empno,String name){ //�o�˴N��ϥ�(�ǰѼ�)Employee e2=new Employee(2,"YT");
		this.empno=empno; // this.empno �Oinstance variable		
		this.name=name; // name �Olocal variable
		empcount++;
		//System.out.println("���Ѽƪ��غc�l");
	}
	public Employee(){
		empcount++;
		//System.out.println("�Ū��غc�l");
	} //�o�˴N��ϥ�new Employee();
	//�o�˴N��s��private���ܼƤF ----start----
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
			p.setSalary(p.getSalary()*1.05); // �]��salary�ܦ�private �n���B��nsetSalary(getSalary())
		}else if(e instanceof Temporary) {
			Temporary t=(Temporary)e;
			//t.hourPay+=20;
			t.setHourPay(t.getHourPay()+20);
		}
		
	}
}
