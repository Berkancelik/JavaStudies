package staticDemo;

public class ProductValidator {

	static {
		System.out.println(" Static Blok Çalýþtý");

	}

	public ProductValidator() {
		System.out.println("Blok Çalýþtý");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;

		} else {
			return false;
		}
	}

	public void bisey() {

	}
	// inner class
//	public static class BaskaBirClass{
//		public static void delete() {
//			
//		}
}
