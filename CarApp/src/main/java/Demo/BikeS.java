package Demo;

import org.springframework.stereotype.Component;

@Component("bike")
public class BikeS implements Showroom {

	@Override
	public String show() {
		return "You Are In Bike Section ";
	}

	

}
