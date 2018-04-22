

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class binaryTreeTest {

    @Test
    void add_addThreeElements_True() {
        TreeMap treeMap = treeMapFabric();
        assertEquals(treeMap.size, 3);

    }

    @Test
    void removeElementAt_Default_True() {
        TreeMap treeMap = treeMapFabric();
        treeMap.remove(8);
        assertEquals(treeMap.size, 2);


    }

    @Test
    void removeAll_Remove_True() {
        TreeMap treeMap = treeMapFabric();
        treeMap.clear();
        assertEquals(treeMap.size, 0);
    }

    @Test
    void value_EqualsValue_True() {
        TreeMap treeMap = treeMapFabric();
        treeMap.get(8);
        assertEquals(treeMap.get(8), 5);
        assertEquals(treeMap.get(13), 7);
    }


    private TreeMap<Integer, Integer> treeMapFabric() {
        TreeMap<Integer, Integer> myTree= new TreeMap<Integer, Integer>();
        myTree.put(8,5);
        myTree.put(13,7);
        myTree.put(1,9);
        return myTree;
    }

   
    

}
