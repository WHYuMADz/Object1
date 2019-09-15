
public class Pet2 {
	
	String Name = null;
	String Animal = null;
	int Age;
	
	public void setName(String newName) {
		this.Name = newName;
		
	}
	public String getName()
	{
		return this.Name;
	}
	public void setAnimal(String newAnimal) 
	{
		this.Animal = newAnimal;
	}
	public String getAnimal() {
		return this.Animal;
	}
	public void setAge(int newAge) {
		this.Age = newAge;
	}
	public int getAge() {
		return this.Age;
	}
	
	public static void main(String [] args) {
			
		Pet2 newAnimal = new Pet2();
		newAnimal.setAnimal("Dog");
		System.out.println(newAnimal.getAnimal());
		
		Pet2 newName = new Pet2();
		newName.setName("Rodger");
		System.out.println(newName.getName());
		
		Pet2 newAge = new Pet2();
		newAge.setAge(5);
		System.out.println(newAge.getAge());
		
		
		System.out.println("Kind of the Animal: " + newAnimal.getAnimal());
		System.out.println("Name of the Animal: " + newName.getName());
		System.out.println("How old is the Animal: " + newAge.getAge());
	}
	}
