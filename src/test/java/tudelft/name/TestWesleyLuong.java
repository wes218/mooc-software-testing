package tudelft.name;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWesleyLuong {

    @Test
    public void getFullName() {
        String result = new WesleyLuong().getFullName();
        Assertions.assertEquals("Wesley Luong", result);
    }
    
    @Test
    public void getFirstName() {
        String result = new WesleyLuong().getFirstName();
        Assertions.assertEquals("Wesley", result);
    }
    
    @Test
    public void getLastName() {
        String result = new WesleyLuong().getLastName();
        Assertions.assertEquals("Luong", result);
    }
    
    @Test
    public void getUCInetID() {
        String result = new WesleyLuong().getUCInetID();
        Assertions.assertEquals("wluong3", result);
    }
    
    @Test
    public void getStudentNumber() {
        int result = new WesleyLuong().getStudentNumber();
        Assertions.assertEquals(64161478, result);
    }
    
    @Test
    public void getRotatedFullNamePositive() {
        String result = new WesleyLuong().getRotatedFullName(2);
        Assertions.assertEquals("sley LuongWe", result);
    }
    
    @Test
    public void getRotatedFullNameNegative() {
        String result = new WesleyLuong().getRotatedFullName(-5);
        Assertions.assertEquals("LuongWesley", result);
    }
}
