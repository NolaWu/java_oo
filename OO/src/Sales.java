public class Sales extends Permanent {
	private double commission;
	public Sales(int empno,String name,double salary,double commission){
		super(empno,name,salary);
		this.commission=commission;
	}
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public void display() {
		super.display();
		System.out.println("commission: "+commission);
	}
	public double paySalary() {
		return super.getSalary()+commission; //寫supre.getSalary() or getSalary()都可以 但是寫supper比較好
	}
}
