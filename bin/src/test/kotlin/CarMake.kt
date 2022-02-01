import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.*

class CarMake {
  @Then("Car make should be test")
  fun checkMake() {
    val service = CarServiceImpl();
    val car = service.createCar();
    Assertions.assertEquals(car.make, "test");
  }
}
