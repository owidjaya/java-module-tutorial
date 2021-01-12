package com.oscar.tutorial.main;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.oscar.tutorial.model.User;
import com.oscar.tutorial.hiddenmodel.Pet;

public class Application {
   private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

   public static void main(String... args) {
       LOGGER.log(Level.INFO, "Testing one two three");
       User someUser = new User();
       someUser.setName("Oscar Widjaya");
       someUser.setAddress("4567 Canada Way");
       someUser.setPostalCode("V5G4T1");
       LOGGER.log(Level.INFO, someUser.toString());

       Pet somePet = new Pet();
       somePet.setName("Rover");
       somePet.setAge(3);
       somePet.setCanBark(true);
       LOGGER.log(Level.INFO, somePet.toString());
   } 
}