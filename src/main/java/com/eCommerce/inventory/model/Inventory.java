/**
 * 
 */
package com.eCommerce.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Team 6
 *
 */
@Entity
public class Inventory {
	
	@Id
	private int productID;
	
	@Column(name="Quantity")	
	private int quantity;
	@Column(name="Supplier_Details")
	private String supplierDetails;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSupplierDetails() {
		return supplierDetails;
	}

	public void setSupplierDetails(String supplierDetails) {
		this.supplierDetails = supplierDetails;
	}
	
	@Override
	public String toString()
	{
		return "Inventory fields : 1.Product ID :"+productID+" 2.Quantity : "+quantity+"  3.Supplier Details : "+supplierDetails;
	}
}
