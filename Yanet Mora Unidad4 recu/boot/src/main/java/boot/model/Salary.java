package boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="salaries")
public class Salary implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="emp_na")
	private String empNa;
	@Column(length=12)
	private float salary;
	@Temporal(TemporalType.DATE)
	@Column(name="from_date")
	private Date fromDate;
	@Temporal(TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;
	
	public Salary(String empNa, float salary, Date fromDate, Date toDate) {
		super();
		this.empNa = empNa;
		this.salary = salary;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpNa() {
		return empNa;
	}

	public void setEmpNa(String empNa) {
		this.empNa = empNa;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "Salaries [id=" + id + ", empNa=" + empNa + ", salary=" + salary
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
}
