/**
 * 
 */
package com.eCommerce.inventory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eCommerce.inventory.model.Inventory;
import com.eCommerce.inventory.repository.InventoryCRUDRepository;
import com.eCommerce.inventory.service.InventoryService;

/**
 * @author Team 6
 *
 */
@Service
@Qualifier(value = "InventoryService")
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryCRUDRepository inventoryCRUDRepository;

	public List<Inventory> getAllInventoryDetails() {
		//
		return inventoryCRUDRepository.findAll();
	}

	public Inventory getInventoryById(int productID) {
		
			return inventoryCRUDRepository.findById(productID).get();
	}


	public String deleteProductByID(String productID) {

		Optional<Inventory> inventory = inventoryCRUDRepository.findById(Integer.parseInt(productID));

		inventoryCRUDRepository.deleteById(inventory.get().getProductID());
		return "Object has been removed from the DB";
	}

	public Inventory updateInventoryDetails(Inventory inventory) {
		inventory = inventoryCRUDRepository.saveAndFlush(inventory);
       return inventory;
	}

	public Inventory saveNewInventory(Inventory inventory) {
		inventory = inventoryCRUDRepository.save(inventory);
	       return inventory;
	}
}
