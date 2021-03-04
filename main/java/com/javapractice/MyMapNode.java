package com.javapractice;

public class MyMapNode<K, V> implements INode<K>{
    K key;
    V value;
    MyMapNode<K,V> next;

    public MyMapNode(K key, V values) {
        this.key = key;
        this.value = values;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K Key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    public V getValue() {return this.value;}

    public void setValue(V value) { this.value = value;}

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K,V>) next;
    }

    @Override
    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" +  "K=").append(key)
                .append("V=").append(value).append("}");
        if(next != null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}
