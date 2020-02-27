import java.util.*;
class Dog extends Animal{
	public int getLegs(){
		return legs;}	
	public Dog(String name, int leg){ name = name; leg = leg;}
	public String toString(){
		return name + " "+legs;}
	/*public static void main(String[] args){
		Dog d1 = new Dog("A",2);
		Dog d2 = new Dog("B",4);
		
		HashSet<Dog> pack = new HashSet<Dog>();
		pack.add(d1);
		pack.add(d2);
		for (Dog i: pack){

			System.out.println(i);}
		
		Iterator<Dog> i = pack.iterator();
		while(i.hasNext()){
			System.out.println(i.next());}
}*/
}		

