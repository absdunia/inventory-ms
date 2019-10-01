/**
 * 
 */
package com.eCommerce.inventory.service;

import java.util.List;

import com.eCommerce.inventory.model.Inventory;

/**
 * @author Team 6
 *
 */
public interface InventoryService {

	public List<Inventory> getAllInventoryDetails();
	public Inventory getInventoryById(int productID);
	public String deleteProductByID(String productID);
	public Inventory updateInventoryDetails(Inventory inventory);
	public Inventory saveNewInventory(Inventory inventory);
	}
