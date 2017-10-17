package cars;

public class Bike implements Vehicule{
final private String Brand;
final private long value = 100;
private Discount discount;
public Bike(String mark){
	this.Brand = mark;
}
public Bike(String brand, Discount d){
	this(brand);
	this.discount=d;
}
public String getBrand() {
	return Brand;
}
public long getValue() {
	return value;
}
public Discount getDiscount() {
	return discount;
}
public void setDiscount(Discount discount) {
	this.discount = discount;
}
}
