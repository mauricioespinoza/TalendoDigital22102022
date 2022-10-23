package cl.monitor.services;

import org.springframework.stereotype.Service;

import cl.monitor.models.Warehouse;
import cl.monitor.repositories.WarehouseRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class WarehouseService {
	@Autowired
	WarehouseRepository cr;

	public List<Warehouse> findAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	

}
