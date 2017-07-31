import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{

  Bus bus;
  Passenger person;

  @Before
  public void before(){
    bus = new Bus();
    person = new Passenger();
  }

  @Test
  public void seatsStartEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void  canPickupPassengers(){
    bus.pickup(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void cannotExceedCapacity(){

    for( int i = 0; i < 5; i++) {
      bus.pickup(person);
    }

  }

}