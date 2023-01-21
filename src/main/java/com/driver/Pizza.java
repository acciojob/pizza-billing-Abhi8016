package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int chessPrice;
    private int toppingsPrice;
    private int tateAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.chessPrice = 80;
        this.tateAwayPrice = 20;
        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price = this.price + this.chessPrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price+= this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price+= this.tateAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: "+this.chessPrice+"\n";
            }
            if(isToppingsAdded){
                this.bill += "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill += "Paperbag Added: "+this.tateAwayPrice+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
