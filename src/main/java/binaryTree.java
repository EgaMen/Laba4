package main.java;

public class binaryTree<E> {


    private binaryTreeNode<E> root;
    int size=0;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setRoot(binaryTreeNode<E> root) {
        this.root = root;
    }

    public binaryTree(E e, int key)
    {
        root = new binaryTreeNode<>(e, key);
        size++;
    }
    public binaryTree(binaryTree<E> tree){
        root = copy(tree.getRoot());
        this.size=tree.getSize();
    }

    private static binaryTreeNode copy(binaryTreeNode node) {
        if(node!=null) {
            binaryTreeNode newRoot = new binaryTreeNode<>();
            newRoot.value = node.getValue();
            newRoot.key = node.getKey();

            newRoot.setLeft(copy(node.getLeft()));
            newRoot.setRight(copy(node.getRight()));
            return newRoot;
        }
        return null;
    }
    public boolean add(E e, int key) {
        if(root==null)
            root=new binaryTreeNode<E>(e, key);
        return decision(root, e, key);
    }

    public E search(binaryTreeNode root, int key)
    {
        if (root.getKey()==key)
            return (E)root.getValue();
        if(root==null)
            new NullPointerException();
        if(key<root.getKey())
            return search(root.getLeft(),key);
        else
            return search(root.getRight(), key);

    }
    public void remove() {
        root = null;
    }

    private boolean decision(binaryTreeNode root, E e, int key) {

        if(key<root.getKey()){
            if(root.getLeft()==null) {
                root.setLeft(new binaryTreeNode<E>(e, key));
                size++;
                return true;
            }
            decision(root.getLeft(), e, key);
        }
        else {
            if(root.getRight()==null) {
                root.setRight(new binaryTreeNode(e, key));
                size++;
                return true;
            }
            decision(root.getRight(), e, key);

        }
        return false;
    }

    public binaryTreeNode<E> getRoot() {
        return root;
    }
    public E getRootValue() {
        return root.getValue();
    }



    private static class binaryTreeNode<T> {


        private int key;



        private T value;
        private binaryTreeNode Right;
        private binaryTreeNode Left;

        public binaryTreeNode(){

        }

        public binaryTreeNode(T value, int key)
        {
            this.value=value;
            this.key=key;
        }

        public binaryTreeNode getRight() {
            return Right;
        }

        public void setRight(binaryTreeNode right) {
            Right = right;
        }

        public binaryTreeNode getLeft() {
            return Left;
        }

        public void setLeft(binaryTreeNode left) {
            Left = left;
        }
        public int getKey() {
            return key;
        }
        public T getValue() {
            return value;
        }

    }
}
