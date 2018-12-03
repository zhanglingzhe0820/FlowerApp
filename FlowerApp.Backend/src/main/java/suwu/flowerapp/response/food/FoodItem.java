package suwu.flowerapp.response.food;

public class FoodItem {
    private int id;
    private String name;
    private String url;
    private double price;
    private int orderNum;
    private boolean hasChoice;
    private String[] choice;

    public FoodItem() {
    }

    public FoodItem(int id, String name, String url, double price, boolean hasChoice, String[] choice) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.price = price;
        this.orderNum = 0;
        this.hasChoice = hasChoice;
        this.choice = choice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public boolean isHasChoice() {
        return hasChoice;
    }

    public void setHasChoice(boolean hasChoice) {
        this.hasChoice = hasChoice;
    }

    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }
}
