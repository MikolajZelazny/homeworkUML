package com.company;

import java.util.ArrayList;

public class Order {
    ArrayList<OrderPosition> object = new ArrayList<OrderPosition>();

    public boolean ElectronicConfirmation;

    public void orderValue(){
        for (int i=0; i<object.size();i++){
            OrderPosition tempObject = object.get(i);


        }
    }

    public void taxValue(){
        for (int i=0; i<object.size();i++){
            OrderPosition tempObject = object.get(i);


        }
    }


    public void addObject (OrderPosition object) {
        this.object.add(object);
    }


}
