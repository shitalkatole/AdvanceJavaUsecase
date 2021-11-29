package com.spring.scope.implementation;

public class CustomerApp {
	
		
		private String name;
		
		private String productPurchase;
		
		private int productId;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProductPurchase() {
			return productPurchase;
		}

		public void setProductPurchase(String productPurchase) {
			this.productPurchase = productPurchase;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		@Override
		public String toString() {
			return "Customer [name=" + name + ", productPurchase=" + productPurchase + ", productId=" + productId + "]";
		}

	}


