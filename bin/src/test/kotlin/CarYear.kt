import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.*

class CarYear {
  @Then("Car year should be 0")
  fun checkYear() {
    val service = CarServiceImpl();
    val car = service.createCar();
    Assertions.assertEquals(car.year, 0);
  }
}
