
import com.example.th01083_03032025.CongNhanChia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCongNhanChia {
    CongNhanChia ct = new CongNhanChia();

    @Test
    public void testCong() {
        int exp = 7;
        int act = ct.cong(4, 3);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testTong() {
        int kq = 5;
        int tt = ct.cong(2, 3);
        Assertions.assertEquals(kq, tt, "Sai kết quả");
    }

    @Test
    public void testChia() {
        double kqmm = 3;
        double tt = ct.chia(6, 2);
        Assertions.assertEquals(kqmm,tt);
    }
    @Test
    public void ngoaiLe(){
        Assertions.assertThrows(
                ArithmeticException.class, () -> ct.chia(3,0)
        );
    }
}
