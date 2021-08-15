package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Product>{

        private final ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
            this.index = 0;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.getProducts().size();
        }

        @Override
        public Product current() {
            return productCollection.getProducts().get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
