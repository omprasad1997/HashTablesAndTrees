package com.javapractice;

public class MyBinaryTree<K extends  Comparable<K>> {
    public MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root,key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if(current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult==0) return current;
        if(compareResult < 0){
            current.left = addRecursively(current.left,key);
        }else{
            current.right = addRecursively(current.right,key);
        }
        return current;
    }
    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                                        + this.getSizeRecursive(current.right);
    }

    public K searchNode(MyBinaryNode<Integer> root, K value) {

        if(root == null)
            return value;

        if(this.root.key == value)
            return value;

        int answer = value.compareTo((K) root.key);
        if(answer < 0) return searchNode(root.left,value) ;
        else            return searchNode(root.right,value);

    }
}
