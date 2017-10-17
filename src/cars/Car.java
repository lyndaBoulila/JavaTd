package cars;

public class Car implements Vehicule {
	
final private String brand;
final private String licencePlate;
final private long value;
public int vetuste;
private Discount discount;

public Car(String brand,String licencePlate, long value){
	if(value < 0)throw new IllegalArgumentException("!!negative value"); 
	if(brand==null || licencePlate==null)throw new NullPointerException();
	this.vetuste=0;
	this.brand= brand;
	this.licencePlate=licencePlate;
	this.value=value;

}
public Car(String brand,String licencePlate, long value,Discount d){
	this(brand,licencePlate,value);
	this.discount=d;
	
}
public Car (String brand,String licencePlate, long value,int vetuste,Discount d){
    this(brand,licencePlate,value,d);
    if(vetuste*1000>value)throw new IllegalArgumentException("tooo old");
	this.vetuste= vetuste;
	this.setDiscount(d);
}
public Car (String brand,String licencePlate, long value,int vetuste){
    this(brand,licencePlate,value);
    if(vetuste*1000>value)throw new IllegalArgumentException("tooo old");
	this.vetuste= vetuste;
	
}
public String getBrand() {
	return brand;
}
public String getLicencePlate() {
	return licencePlate;
}
public long getValue() {
	return (value-vetuste*1000);
}

public String ToString(){
	return "Brand : "+this.brand+" , Licence : "+this.licencePlate+"valeur "+this.value; 
}
@Override
public boolean equals (Object c){
	if (c != null && c instanceof Car){
		if(((Car) c).getBrand().equals(this.brand) && ((Car) c).getLicencePlate().equals( this.licencePlate) && ((Car) c).getValue() == this.value &&((Car) c).vetuste == this.vetuste)return true;
	}
	return false;
}
@Override
public int hashCode(){
	int hash=5;
	hash=(int) (59*hash+this.brand.hashCode()+this.licencePlate.hashCode()+this.value) ;
	return hash;
}
public Discount getDiscount() {
	return discount;
}
public void setDiscount(Discount discount) {
	this.discount = discount;
}

}

