package com.company;

public class TechnicalItem extends GenericItem {
    short warrantyTime;

    public TechnicalItem(int ID, String name, float price, Category category, short warrantyTime) {
        super(ID, name, price, category);
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll() {
        System.out.printf("ID: %d, Name: %s, price: %5.2f, Category: %s, WarrantyTime: %d \n", ID, name, price, category, warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TechnicalItem)) return false;
        if (!super.equals(o)) return false;

        TechnicalItem that = (TechnicalItem) o;

        return warrantyTime == that.warrantyTime;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) warrantyTime;
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TechnicalItem technicalItem = new TechnicalItem(0, null, 0.0f, null, (short) 0);
        technicalItem.ID = this.ID;
        technicalItem.name = this.name;
        technicalItem.price = this.price;
        technicalItem.category = this.category;
        technicalItem.warrantyTime = this.warrantyTime;
        return technicalItem;
    }

    @Override
    public String toString() {
        return "TechnicalItem{" +
                "warrantyTime=" + warrantyTime +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
