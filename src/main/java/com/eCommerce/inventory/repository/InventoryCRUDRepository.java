/**
 * 
 */
package com.eCommerce.inventory.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.inventory.model.Inventory;

/**
 * @author Team 6
 *
 */
@Repository
public interface InventoryCRUDRepository extends JpaRepository<Inventory, Integer> {

	
}
