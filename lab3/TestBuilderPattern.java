package CS335;

public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new SportsCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
	}
	
	
	
	
	

}
