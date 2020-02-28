package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {

    Date dateOfIncome;
    short expires;

    public FoodItem(int ID, String name, float price, Category category, Date dateOfIncome, short expires ) {
        super(ID, name, price, category );
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    void printAll() {
        System.out.printf("ID: %d, Name: %s, price: %5.2f, Category: %s, Date: %s, Expires: %d\n", ID, name, price, category, dateOfIncome, expires);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodItem)) return false;
        if (!super.equals(o)) return false;

        FoodItem foodItem = (FoodItem) o;

        if (expires != foodItem.expires) return false;
        return dateOfIncome != null ? dateOfIncome.equals(foodItem.dateOfIncome) : foodItem.dateOfIncome == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (dateOfIncome != null ? dateOfIncome.hashCode() : 0);
        result = 31 * result + (int) expires;
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FoodItem foodItem = new FoodItem(0, null, 0.0f, null, null, (short) 0);
        foodItem.ID = this.ID;
        foodItem.name = this.name;
        foodItem.price = this.price;
        foodItem.category = this.category;
        foodItem.dateOfIncome = this.dateOfIncome;
        foodItem.expires = this.expires;
        return foodItem;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "dateOfIncome=" + dateOfIncome +
                ", expires=" + expires +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
