package list.OperacoesBasiscas;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCar {

    private List<Item> shoppingCar;
    private double totalVValueShoppingCar;

    public ShoppingCar() {
        this.shoppingCar = new ArrayList<>();
    }

    public void addItem(String name, double price, int amount){
        shoppingCar.add(new Item(name, price, amount));
    }

    public void removeItem(String name) {
        List<Item> itemsRemoved = new ArrayList<>();
        for( Item item: shoppingCar )
            if(item.getName().equalsIgnoreCase(name)){
                itemsRemoved.add(item);
                System.out.println("Item removido: " + item);
            }
        shoppingCar.removeAll(itemsRemoved);
    }

    public void calculateTotalValue() {
        totalVValueShoppingCar = 0.0;
        for( Item item : shoppingCar) {
            calculateTotalItemValue(item);
        }
        System.out.println("Valor total do carrinho: " + totalVValueShoppingCar);
    }
    public void displayItems() {
        for(Item item : shoppingCar) {
            System.out.println("Itens: " + item);
        }
    }

    private void calculateTotalItemValue(Item item) {
        totalVValueShoppingCar += (item.getAmount() * item.getPrice());
    }

    public static void main(String[] args) {
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.addItem("Monitor", 4.900, 2);
        shoppingCar.addItem("Celular", 3.900, 2);
        shoppingCar.displayItems();
        shoppingCar.calculateTotalValue();
        shoppingCar.removeItem("Monitor");
        shoppingCar.displayItems();
        shoppingCar.calculateTotalValue();
    }
}
