package car;

import java.util.ArrayList;
import java.util.Objects;

public class Garage {
final private int Id;	
public static int  Compteur =0;
public ArrayList <Car> liste ;
public Garage(){
	this.Id=Compteur+1;
	liste=new ArrayList<Car>();
	Compteur++;
}
public void add(Car c){
	Objects.requireNonNull(c,"the car cannot be null");
	liste.add(c);
}
public int getId() {
	return Id;
}
public String toString(){
	StringBuffer buffer =new StringBuffer();
	for (int i=0; i<liste.size();i++){
		buffer.append(liste.get(i).toString());
	}
	return buffer.toString();
}
public int getValue(){
	int v=0;
	for(int i=0;i<liste.size();i++){
		v+= liste.get(i).getValue();
	}
	return v;	
}
public Car firstCarByBrand(String brand){
	if(brand == null )throw new NullPointerException();
	for(int i=0;i<liste.size();i++){
		if(liste.get(i).getBrand().equals(brand)){
			return liste.get(i);
		}
	}
	System.out.println("il ne y a pas de voiture de marque "+brand +"dans la garage");
	throw new NullPointerException();
}
public int indexOf(Car c){
	for (int i=0 ; i<liste.size();i++){
		if(liste.get(i).equals(c))return i;
	}
	return -1;

}
public void remove(Car c){
	int index = liste.indexOf(c);
	if(index == -1 )throw new IllegalStateException("la voiture n'existe pas dans le garage");
	liste.remove(index);
}
}
