package com.company;

import java.util.ArrayList;

public class BusinessCardHolder {
    private ArrayList<BusinessCard> List;

    public void add(BusinessCard element){
        List.add(element);
    }
    public boolean removeFirst(){
        if(List.isEmpty()){
            return false;
        } else{
            List.remove(0);
            return true;
        }
    }
    public void printAll(){
        for (BusinessCard businessCard : List) {
            System.out.println(businessCard.toString());
        }
    }
}
