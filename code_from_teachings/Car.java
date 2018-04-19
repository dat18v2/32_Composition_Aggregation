public class Car {

      private Driver driver;
      //private Driver[] drivers;
      private Engine engine;
      
      public Car(Driver driver){
      
         // Composition
         engine = new Engine();
      
         // Aggregation
         this.driver = driver;
      
         // Assosiation
        // driver = new Driver("Claus");
         
        /* drivers = new Driver[3];
         drivers[0] = new Driver("Jonatan");
         drivers[1] = new Driver("Pia");*/
  
      }
      
      
      public Driver getDriver(){
         return driver;
      }
      
     /* public Driver[] getDrivers(){
         return drivers;
      }*/

}