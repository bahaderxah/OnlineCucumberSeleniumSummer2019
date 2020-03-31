package com.vytrack.step_definitions;

import com.vytrack.pages.CreateCarPage;
import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    CreateCarPage createCarPage=new CreateCarPage();
     VehiclesPage vehiclesPage=new VehiclesPage();

    @Then("user click on {string} button")
    public void user_click_on_button(String string) {
     vehiclesPage.waitUntilLoaderMaskDisappear();
     if(string.equals("Create Car")){
         vehiclesPage.clickToCreateACar();
     }
    }

    @Then("user adds new car information:")
    public void user_adds_new_car_information(List<Map<String,String>> dataTable) {
        System.out.println(dataTable);
    }

}
