import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPetTest {

//    @Before
//    public void setUp() throws Exception {
//
//        System.out.println("setUp");
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        System.out.println("tearDown");
//    }


    @Test
    public void getName() {

        fail();
        TestPet pet = new TestPet("Cat");
        assertEquals("Cat",pet.getName());

    }

//    @Test
//    public void checkPetName(){
//        fail();
//        TestPet pet = new TestPet();
//        assertTrue(pet.isPet());
//
//    }


}