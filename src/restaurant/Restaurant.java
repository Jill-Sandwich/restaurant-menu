package restaurant;

public class Restaurant {
    public static void main (String[] args){
        MenuItem item1 = new MenuItem("Salad", 6.00, "Edible Water", "Dinner", true);
        MenuItem item2 = new MenuItem("Salad", 6.00, "Edible Water", "Dinner", true);
        MenuItem item3 = new MenuItem("CheeseCake", 3.00, "Better than regular cake", "Dessert", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        //myMenu.removeMenuItem(item3);
        System.out.println(myMenu.toString());
        //System.out.println(item1.toString());

        /*//Test out toString method
        System.out.println(item1.toString());
        //Test out equals method
        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));*/
    }
}
