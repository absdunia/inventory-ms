/**
 * 
 */
package com.eCommerce.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.inventory.model.Inventory;
import com.eCommerce.inventory.serviceImpl.InventoryServiceImpl;

/**
 * @author Team 6
 *
 */
@RestController
@RequestMapping("/eCommerce/inventory")
public class InventoryController {

	@Autowired
	private InventoryServiceImpl inventoryServiceImpl;

	@GetMapping(value = "/getAllInventoryDetails", produces = "application/json")
	public List<Inventory> getAllInventoryDetails() {
		return inventoryServiceImpl.getAllInventoryDetails();
	}

	@GetMapping(value = "/getQuantityById")
	public int getQuantityById(@RequestParam String productID) {
		return inventoryServiceImpl.getQuantityById(Integer.parseInt(productID));
	}

	@GetMapping(value = "/getSupplierDetailsById")
	public String getSupplierDetailsById(@RequestParam String productID) {
		return inventoryServiceImpl.getSupplierDetailsById(Integer.parseInt(productID));
	}

	@DeleteMapping(value = "/deleteByProductID", consumes = "application/json", produces = "application/json")
	public String removeStudent(@RequestParam String productID) {
		return inventoryServiceImpl.deleteProductByID(productID);
	}

	@PutMapping(value = "/updateInventoryByID", consumes = "application/json", produces = "application/json")
	public Inventory updateInventory(@RequestBody Inventory inventory) {
		return inventoryServiceImpl.updateInventoryDetails(inventory);
	}

	@PostMapping(value = "/createInventory", consumes = "application/json", produces = "application/json")
	public Inventory createPrice(@RequestBody Inventory inventory) {
		return inventoryServiceImpl.saveNewInventory(inventory);
	}

	@GetMapping(value = "/")
	public String inventoryWelcomePage() {
		return "Welcome to the Inventory Page";
	}
}
