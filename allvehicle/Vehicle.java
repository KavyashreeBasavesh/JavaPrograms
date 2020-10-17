package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	
	private void vehicleNecessery() {
		// TODO Auto-generated method stub
System.out.println("yes");
	}

	public static void main(String[] args) {
		
		Vehicle v= new Vehicle();
		
				v.vehicleNecessery();
		
				TwoWheller t= new TwoWheller();
				t.bike();
				t.cycle();
				
				ThreeWheeler t3= new ThreeWheeler();
				t3.Auto();
				
				FourWheeler f= new FourWheeler();
				f.bus();
				f.car();
				
						
						

				
	}
}
