package cl.monitor.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WAREHOUSES")
public class Warehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int warehouse_id;
	private String warehouse_name;

	public Warehouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Warehouse(String warehouse_name) {
		super();
		this.warehouse_name = warehouse_name;
	}

	public String getWarehouse_name() {
		return warehouse_name;
	}

	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
	

}
