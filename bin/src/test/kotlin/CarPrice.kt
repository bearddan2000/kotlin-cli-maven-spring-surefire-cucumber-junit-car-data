import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

import example.model.Car
import example.service.*

class CarPrice {

  @When("^Car created$")
  fun createCar(): Car {
     val service = CarServiceImpl();
     return service.createCar();
  }

  @Then("^Car price should be 0.0$")
  fun checkPrice() {
    val car = createCar()
    Assertions.assertEquals(car.price, 0.0);
  }
}
