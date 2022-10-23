package cl.monitor.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INVENTORIES")
public class Inventories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quantity;

	public Inventories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventories(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
