import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomArrayListTest {

    @Test
    public void test_add_one_item(){
        CustomList<Integer> sut = new CustomArrayList<>();
        sut.add(1);
        assertEquals(1, sut.get(0));
        assertEquals(10, sut.getSize());
    }
}