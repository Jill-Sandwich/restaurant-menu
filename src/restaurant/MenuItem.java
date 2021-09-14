package restaurant;

public class MenuItem {
    //Class Variables
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;
    private Boolean isUpdated = false;

    //Constructors

    public MenuItem(String name, double price, String description){
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }

    public MenuItem(String name, double price, String description, String category, boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = category;
        this.isNew = isNew;
    }

    //Methods - Getters and Setters

    public String getName(String aName){
        return name;
    }

    public double getPrice(double aPrice){
        return price;
    }

    public String getDescription(String aDescription){
        return description;
    }

    public String getCategory(String aCategory){
        return category;
    }

    public Boolean isNew(){
        return this.isNew;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public void setPrice(double aPrice){
        this.price = aPrice;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public void setCategory(String aCategory){
        this.category = aCategory;
    }

    public void setIsNew(Boolean isItNew){
        this.isNew = isItNew;
    }

    //Other Methods

    @Override
    public String toString(){
        String returnString = "";

        returnString += "Item Name: " + this.name + "\n";
        returnString += "Item Description: " + this.description + "\n";
        returnString += "Item Price: " + this.price + "\n";
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item is New?: " + this.isNew + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (!(obj instanceof MenuItem)){
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
            && menuItem.description.equals(this.description)
            && menuItem.price.equals(this.price)
            && menuItem.category.equals(this.category))
        return true;
        else return false;
    }

}
