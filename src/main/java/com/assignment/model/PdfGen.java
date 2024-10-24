package com.assignment.model;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 {
"seller": "XYZ Pvt. Ltd.",
"sellerGstin": "29AABBCCDD121ZD",
"sellerAddress": "New Delhi, India",
"buyer": "Vedant Computers",
"buyerGstin": "29AABBCCDD131ZD",
"buyerAddress": "New Delhi, India",
"items": [
		{
		"name": "Product 1",
		"quantity": "12 Nos",
		"rate": 123.00,
		"amount": 1476.00
		}
		]
}
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PdfGen {
	
		
	 	private String seller;
	    private String sellerGstin;
	    private String sellerAddress;
	    private String buyer;
	    private String buyerGstin;
	    private String buyerAddress;
	    private List<Item> items;

		public List<Item> getItems() {
			// Add custom logic if needed, otherwise just return the items list
			if (items == null || items.isEmpty()) {
				throw new IllegalArgumentException("Items list cannot be null or empty");
			}
			return items;
		}

		public String getSeller() {
			return this.seller;
		}
		
		public String getBuyer() {
			return this.buyer;
		}

		public String getSellerGstin() {
            return this.sellerGstin;
        }

		public String getBuyerGstin() {
            return this.buyerGstin;
        }

		public String getSellerAddress() {
            return this.sellerAddress;
        }

		public String getBuyerAddress() {
            return this.buyerAddress;
        }

		

}
