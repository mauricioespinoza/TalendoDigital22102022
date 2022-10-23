package cl.monitor.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_name;
	private float list_price;
	private float standard_cost;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int product_id, String product_name, float list_price, float standard_cost) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.list_price = list_price;
		this.standard_cost = standard_cost;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getList_price() {
		return list_price;
	}
	public void setList_price(float list_price) {
		this.list_price = list_price;
	}
	public float getStandard_cost() {
		return standard_cost;
	}
	public void setStandard_cost(float standard_cost) {
		this.standard_cost = standard_cost;
	}
	
	

}
