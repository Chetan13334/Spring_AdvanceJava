package Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Costomer {

		@Qualifier("bike")
		@Autowired
		private Showroom s;
		
		@Qualifier("carS")
		@Autowired
		private Showroom s2;

		public Showroom getS() {
			return s;
		}

		public void setS(Showroom s) {
			this.s = s;
		}

		public Showroom getS2() {
			return s2;
		}

		public void setS2(Showroom s2) {
			this.s2 = s2;
		}

		@Override
		public String toString() {
			return "Costomer [s=" + s + ", s2=" + s2 + "]";
		}
		
		
		
		
	}


