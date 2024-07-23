package filterMethods;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	Double price;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Product(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}

public class filterdemo4 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "name1 ", 1d));
		products.add(new Product(2, "name2 ", 2d));
		products.add(new Product(3, "name3 ", 3d));
		products.add(new Product(4, "name4 ", 4d));
		products.add(new Product(5, "name5 ", 5d));
		products.add(new Product(6, "name6 ", 6d));
		products.add(new Product(7, "name7 ", 7d));
		
		// print the price between 3-6
		
		products.stream().filter(pd -> pd.getPrice()>3 && pd.getPrice()<6).forEach(System.out::println);

		System.out.println(" now print the price ");
		products.stream().filter(pd -> pd.getPrice()>3 && pd.getPrice()<6).forEach(t -> System.out.println(t.getPrice()));

	}

}
