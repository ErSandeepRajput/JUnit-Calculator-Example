import org.junit.gen5.api.Assertions;
import org.junit.Test;

public class testingClass {

    @Test
    public void duringMethod(){
        Assertions.assertEquals(5, Calculator.addition(2,3));
        Assertions.assertEquals(-1, Calculator.subtraction(2,3));
        Assertions.assertEquals(6, Calculator.multiplication(2,3));
    }

}
