import com.example.th01083_03032025.ChanLe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChanLe {
    ChanLe cl = new ChanLe();
    @Test
    public void testSoChan(){
        Assertions.assertEquals("Số chẵn",cl.chanLe(8));
        Assertions.assertEquals("Số chẵn",cl.chanLe(10));
        Assertions.assertEquals("Số chẵn",cl.chanLe(12));
    }
    @Test
    public void testSoLe(){
        Assertions.assertEquals("Số lẻ",cl.chanLe(7));
        Assertions.assertEquals("Số lẻ",cl.chanLe(5));
    }
}
