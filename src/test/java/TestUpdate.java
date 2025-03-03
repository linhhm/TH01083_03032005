import com.example.th01083_03032025.SanPham;
import com.example.th01083_03032025.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUpdate {
    SanPhamService spsv = new SanPhamService();

    @Test
    public void testUpdate(){
        SanPham sp1 = new SanPham("1","A",2000,100,2,"Con");
        SanPham sp2 = new SanPham("2","A",2000,100,2,"Con");
        SanPham sp3 = new SanPham("3","A",2000,100,2,"Con");
        SanPham sp4 = new SanPham("4","A",2000,100,2,"Con");
        Assertions.assertEquals("ma da ton tai, update thanh cong",spsv.update(sp1, "1","B",2001,2,2,"Het"));
        Assertions.assertEquals("ma da ton tai, update thanh cong",spsv.update(sp2, "2","B",2001,2,2,"Het"));
        Assertions.assertEquals("ma da ton tai, update thanh cong",spsv.update(sp3, "3","B",2001,2,2,"Het"));
        Assertions.assertEquals("ma da ton tai, update thanh cong",spsv.update(sp4, "4","B",2001,2,2,"Het"));
    }
    @Test
    public void testUpdateMaChuaTonTai(){
        SanPham sp1 = new SanPham("1","A",2000,100,2,"Con");
        Assertions.assertEquals("update thanh cong",spsv.update(sp1, "2","B",2001,2,2,"Het"));
    }
    @Test
    public void testUpdateMaChuaTonTaiNL(){
        SanPhamService sanPhamService = new SanPhamService();
        SanPham sp1 = new SanPham("1","A",2000,100,2,"Con");
        Assertions.assertThrows(IllegalArgumentException.class,() ->  sanPhamService.update(sp1, "2","B",2001,2,2,"Het"));
    }
}
