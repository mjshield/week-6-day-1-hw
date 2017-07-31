class Bus{

  private Passenger[] seats;

  public Bus(){
    this.seats = new Passenger[5];
  }

  public int passengerCount(){

    int count = 0;

    for(Passenger person : this.seats){

      if(person != null){
        count++;
      }

    }
    return count;
  }

  public void pickup(Passenger person){
    if (seatsAreFull()) {
      return;
    }

    int passengerCount = passengerCount();
    seats[passengerCount] = person;
  }

  public boolean seatsAreFull(){
    return passengerCount() == seats.length;
  }




}