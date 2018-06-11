import org.junit.gen5.api.Assertions;
import org.junit.Test;

public class testingClass {

    @Test
    public void duringMathod(){
        Assertions.assertEquals(5, calculator.addition(2,3));
        Assertions.assertEquals(-1, calculator.subtraction(2,3));
        Assertions.assertEquals(6, calculator.multiplication(2,3));
    }

}
