package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurentSystemHooks {

    @Before("@SmokeTest")
    public void setUp(Scenario sc){
        System.out.println("In the set up method "+sc.getName());
    }

    @After("@SmokeTest")
    public void tearDown(Scenario sc){
        System.out.println("In the tear down method "+sc.getName());
    }
}
