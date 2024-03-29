import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    //Request 1 : add new items
    @Test
    public void test_add_one_item() {
        CustomList<Integer> sut = new CustomArrayList<>();
        sut.add(1);
        assertEquals(1, sut.get(0));
        assertEquals(1, sut.getSize());
    }

    @Test
    public void test_add_one_hundred_items() {
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        assertEquals(99, sut.get(99));
        assertEquals(100, sut.getSize());
    }

    //Request 2: add new items in the specified index
    @Test
    public void test_add_new_item_to_specified_index() {
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.add(59, 95);
        assertEquals(101, sut.getSize());
        assertEquals(95, sut.get(59));
    }
    @Test
    public void test_add_new_item_to_first_index(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.add(0,95);
        assertEquals(101, sut.getSize());
        assertEquals(95, sut.get(0));
    }
    @Test
    public void test_add_new_item_to_last_index(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.add(99,95);
        assertEquals(101, sut.getSize());
        assertEquals(95, sut.get(99));
    }

    //Request 3: Throw Exception when index doesn't exist
    @Test
    public void test_throw_exception_when_index_does_not_exist(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        assertThrows(IndexOutOfBoundsException.class, ()-> sut.add(250,250));
        assertThrows(IndexOutOfBoundsException.class, ()-> sut.add(-2,250));

    }
    //Request 4: Remove items
    @Test
    public void test_remove_one_item_from_middle_of_list(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.remove(88);
        assertEquals(89, sut.get(88));
        assertEquals(99, sut.getSize());
        assertNull(sut.get(99));
    }
    @Test
    public void test_remove_one_item_from_beginning_of_list(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.remove(0);
        assertEquals(1, sut.get(0));
        assertEquals(99, sut.getSize());
        assertNull(sut.get(99));
    }
    @Test
    public void test_remove_one_item_from_end_of_list(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.remove(99);
        assertEquals(98, sut.get(98));
        assertEquals(99, sut.getSize());
        assertNull(sut.get(99));
    }
    @Test
    public void test_remove_multiple_items_from_list(){
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);
        sut.remove(0);
        sut.remove(59);
        sut.remove(97);
        assertEquals(1, sut.get(0));
        assertEquals(62, sut.get(60));
        assertEquals(97, sut.getSize());
        assertNull(sut.get(98));
    }

    @Test
    public void test_throw_exception_when_remove__index_does_not_exist() {
        CustomList<Integer> sut = new CustomArrayList<>();
        generateOneHundredNumbers(sut);

        assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(250));
        assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(-2));
    }


    //Method - Generate One Hundred Numbers for test
    private static void generateOneHundredNumbers(CustomList<Integer> sut) {
        for (int i = 0; i < 100; i++) {
            sut.add(i);
        }
    }

}
