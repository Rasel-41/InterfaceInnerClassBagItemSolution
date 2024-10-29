package q1;

import java.util.ArrayList;

public class Bag {
    //Inner class to represent an item
    private class Item {
        String name;
        int quantity;

        Item(String name, int quantity) {
            this.name = name;
            this.quantity = 1;
        }
    }

    //List to store items
    private ArrayList<Item> items;

    public Bag() {
        items = new ArrayList<>();
    }

    //Method to add an item
    public void add(String itemName) {
        for (Item item : items) {
            if (item.name.equals(itemName)) {
                item.quantity++;//Increment the quantity if item already exists

                return;
            }
        }
       items.add(new Item(itemName,1));
    }


    public int count(String itemName) {
        for (Item item : items) {

            if (item.name.equals(itemName)) {
                return item.quantity;// Return the quantity if the item exists
            }
        }
        return 0;// Return 0 if the item does not exist
    }
    // For testing purpose, a method to print all items in the bag

    public void printItems(){
        for(Item item:items){
            System.out.println("Item: " + item.name + ", Quantity: " + item.quantity);
        }
    }
}






