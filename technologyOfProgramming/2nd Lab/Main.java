package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem item1 = new GenericItem(1,"Socks", 30.0f, Category.GENERAL);
        GenericItem item2 = new GenericItem(4,"SocksRed", 40.0f, Category.GENERAL);
        item1.analogy = item2;
        item1.printAll();
        FoodItem pizza = new FoodItem(2,"Pizza", 200.0f, Category.FOOD, new Date(), (short) 12);
        TechnicalItem telephone = new TechnicalItem(3 , "Telephone", 5000.0f, Category.GENERAL, (short) 21);
        GenericItem items [] = new GenericItem[2];
        items[0] = pizza;
        items[1] = telephone;
        for (int i = 0; i < 2; i++ ){
            items[i].printAll();
        }
        GenericItem genericItem = (GenericItem) item1.clone();
        System.out.println(genericItem.equals(item1));
        FoodItem foodItem = (FoodItem) pizza.clone();
        System.out.println(foodItem.equals(pizza));
        TechnicalItem technicalItem = (TechnicalItem) telephone.clone();
        System.out.println(technicalItem.equals(telephone));

    }
}
