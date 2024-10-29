package q1;

public class Runner {
    public static void main(String[] args) {
        Bag bag = new Bag();

        bag.add("apple");
        bag.add("banana");
        bag.add("apple");
        bag.add("orange");
        bag.add("orange");
        System.out.println("Count of apple: "+bag.count("apple"));
        System.out.println("Count of banana: "+bag.count("banana"));
        System.out.println("Count of ornge: "+bag.count("orange"));
        System.out.println("Count of grapes: "+bag.count("grape"));
        // Print all items in the bag
        System.out.println("Items in the bag:");
        bag.printItems();
    }
}
