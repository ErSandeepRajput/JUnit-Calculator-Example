import org.junit.gen5.api.Assertions;
import org.junit.Test;

public class testingClass {

    @Test
    public void additionMethodTest(){
        Assertions.assertEquals(5, Calculator.addition(2,3));
    }

    @Test
    public void subtractionMethodTest(){
        Assertions.assertEquals(-1, Calculator.subtraction(2,3));
    }

    @Test
    public void multiplicationMethodTest(){
        Assertions.assertEquals(6, Calculator.multiplication(2,3));
    }

    @Test
    public void divisionMethodTest(){
        Assertions.assertEquals(0, Calculator.division(2,3));
    }

}