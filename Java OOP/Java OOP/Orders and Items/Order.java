import java.util.ArrayList;

public class Order { 
        private String name;
        private boolean ready;
        private ArrayList<Item> items = new ArrayList<Item>();

        public Order(){
                this.name = "Guest";
                this.items = new ArrayList<Item>();
        }
        public Order(String name){
                this.name = name;
                this.items = new ArrayList<Item>();
        }

        public String getOrderName(){
                return this.name;
        }
    
        public boolean getOrderReady(){
                return this.ready;
        }
        public ArrayList<Item> getOrderItems(){
                return this.items;
        }

        public void setOrderName(String name){
                this.name = name;
        }

        public void setOrderReady(boolean ready){
                this.ready = ready;
        }
        public void setOrderItems(ArrayList<Item> items){
                this.items = items;
        }

        public void addItem(Item item){
                items.add(item);
        }
        public String getStatusMessage(){
                if(this.ready){
                        return "Your order is ready :)";
                }
                return "Apologies for the delay, your order will be out shortly.";
        }
        public double getOrderTotal(){
                double total=0;
                for(Item item : items){
                        total += item.getItemPrice();
                }
                return total;
        }
        public void display(){
                System.out.println("Customer: " + this.name);
                for(Item item : items){
                        System.out.println(item.getItemName() + ", Price: $" + item.getItemPrice());
                }
                System.out.println("Total: $" + getOrderTotal());
        }

}