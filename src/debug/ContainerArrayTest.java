package debug;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ContainerArrayTest {
    private ContainerArray<String> myContainer = null;

    @Before
    public void setUp () {
        myContainer = new ContainerArray<>();
    }

    @Test
    public void testSizeChangeWithAdd () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Camel");
        assertEquals("Add size", 3, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertEquals("Add should be same reference", alligator, myContainer.get(0));
    }

    @Test
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
    }

    @Test
    public void testObjectIsRemoved () {
        String alligator = "Alligator";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        assertEquals("Remove should be same reference", alligator, myContainer.get(0));
    }
    
    @Test
    public void testRemove () {
    	String bear = "Bear";
    	myContainer.add(bear);
    	myContainer.remove(bear);
    	assertEquals(myContainer.get(0),null);
    }
    @Test
    public void testMultipleObjectSameTypeRemoval() {
    	String bear = "Bear";
    	myContainer.add(bear);
    	myContainer.add(bear);
    	myContainer.remove(bear);
    	assertEquals(myContainer.get(0),null);
    }
    @Test
    public void testContainorSizeNonexistent() {
    	String bear = "Bear";
    	String alligator = "Alligator";
    	myContainer.add(bear);
    	myContainer.add(bear);
    	myContainer.remove(alligator);
    	assertEquals(myContainer.size(),2);
    }
}
