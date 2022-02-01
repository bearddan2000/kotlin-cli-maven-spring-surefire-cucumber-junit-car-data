import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.*

class CarModel {
  @Then("Car model should be test")
  fun checkModel() {
    val service = CarServiceImpl();
    val car = service.createCar();
     Assertions.assertEquals(car.model, "test");
  }
}
