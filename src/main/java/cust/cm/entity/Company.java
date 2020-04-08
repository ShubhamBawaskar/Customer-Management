package cust.cm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_det")
public class Company
{

	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Customer_name")
    private String cname;
	private String cname1;
    private String no;
    private String cname2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname1() {
		return cname1;
	}
	public void setCname1(String cname1) {
		this.cname1 = cname1;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCname2() {
		return cname2;
	}
	public void setCname2(String cname2) {
		this.cname2 = cname2;
	}
	
 }
