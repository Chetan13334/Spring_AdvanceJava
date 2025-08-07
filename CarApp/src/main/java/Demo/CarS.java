package Demo;

import org.springframework.stereotype.Component;

@Component("carS")
public class CarS implements Showroom {

	@Override
	public String show() {
		return "You Are In Car Section ";
	}

}
