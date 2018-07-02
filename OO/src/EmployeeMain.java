
public class EmployeeMain {
	public static void main(String[] args) {
		//因為Employee abstract 所以不能使用new
		/*Employee e1=new Employee();
		//e1.empno=1; //因為empno name 變成private
		//e1.name="Nola";
		e1.setEmpno(1);
		e1.setName("Nola");
		e1.display();
		
		Employee e2=new Employee(2,"YT");		
		e2.display();*/
		Permanent p=new Permanent();
		//p.name="Fat Rabbit";//因為empno name 變成private
		//p.empno=3;
		p.setEmpno(7);
		p.setName("Fat Rabbit");
		//p.salary=37800; //因為salary 變成private
		p.setSalary(37800);
		p.display();
		Permanent p1=new Permanent(3,"Cathy",23600);
		p1.display();
		System.out.println(p1.paySalary());
		Temporary t1=new Temporary(4,"Abby",150,60);
		t1.display();
		System.out.println(t1.paySalary());
		Sales s1=new Sales(5,"Ben",20000,23000);
		s1.display();
		System.out.println(s1.paySalary());
		System.out.println("--------------------------");
		Employee[] e=new Employee[3];
		e[0]=new Permanent(31,"Cathy",23600);
		e[1]=new Temporary(41,"Abby",150,60);
		e[2]=new Sales(51,"Ben",20000,23000);
		
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].getEmpno()+" "+e[i].getName()+": "+e[i].paySalary());	
			e[0].raiseSalary(e[i]);
			System.out.println("加薪"+e[i].getEmpno()+" "+e[i].getName()+": "+e[i].paySalary());		
		}	
		System.out.println("Employee Count:"+Employee.getEmpcount()); //也能使用 t1.empcount or e[1].empcount但是會有緊告訊息 -->static way
	}
}
