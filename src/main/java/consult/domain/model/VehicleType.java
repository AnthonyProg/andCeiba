package consult.domain.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VehicleType implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String type;
	
	public VehicleType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	
	
}
