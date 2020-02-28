package com.company;


public class GenericItem implements Cloneable{
    public int ID;
    public String name;
    public float price;
    public Category category ;
    public GenericItem analogy;

    public GenericItem(int ID, String name, float price, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void printAll(){
        System.out.printf("ID: %d, Name: %s, price: %5.2f, Category: %s \n", ID, name, price, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericItem)) return false;

        GenericItem that = (GenericItem) o;

        if (ID != that.ID) return false;
        if (Float.compare(that.price, price) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return category == that.category;
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GenericItem genericItem = new GenericItem(0, null, 0.0f, null);
        genericItem.ID = this.ID;
        genericItem.name = this.name;
        genericItem.price = this.price;
        genericItem.category = this.category;
        genericItem.analogy = this.analogy;
        return genericItem;
    }
}
