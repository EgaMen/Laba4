package test.java;

import main.java.binaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class binaryTreeTest {

    @Test
    void add_Default_True() {
        binaryTree<String> myTree= new binaryTree<String>("aaaa", 1);
        myTree.add("ffff",2);
        myTree.add("ggg",10);
        myTree.add("hghg",7);
        assertEquals(myTree.getRootValue(), "aaaa");

        assertEquals(myTree.getSize(), 4);
    }
    @Test
    void search_Default_True() {
        binaryTree<String> myTree = binaryTreeFabric();
        String a= myTree.search(myTree.getRoot(), 10);
        assertEquals(a, "ggg");
    }

    @Test
    void copyConstructor_Default_True(){
        binaryTree<String> myTree = binaryTreeFabric();
        binaryTree<String> newTree = new binaryTree<String>(myTree);
        assertEquals(newTree.getRootValue(), "aaaa");
        assertEquals(newTree.getSize(), 4);
        String a= myTree.search(myTree.getRoot(), 10);
        assertEquals(a, "ggg");
    }


    binaryTree<String> binaryTreeFabric() {
        binaryTree<String> myTree= new binaryTree<String>("aaaa", 1);
        myTree.add("ffff",2);
        myTree.add("ggg",10);
        myTree.add("hghg",7);
        return myTree;
    }

}
