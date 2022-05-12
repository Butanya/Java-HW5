import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcAverageRange() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 500);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcZeroRange() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcHugeRange() {
        SQRService service = new SQRService();
        int actual = service.calculate(2, 300_000_000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcNegativeRange() {
        SQRService service = new SQRService();
        int actual = service.calculate(-200, -300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}
