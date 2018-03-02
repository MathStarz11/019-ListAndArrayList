package com.christodd;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    //Add to List
    public void addGrocertyItem(String item) {
        groceryList.add(item);

    }

    //Getter for groceryList
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //Print groceryList
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your" +
                "grocery list");

        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
    //modify groceryList (Public Function)
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    //modify groceryList (Private Function)
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    //Remove an item from groceryList (Public Function)
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    //Remove an item from groceryList (Private Function)
    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    //Find an item in Grocery List (Private Function)
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    //Search for item in Grocery List (Public Function)
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);

        if(position >= 0 ) {
            return true;
        }

        return false;
    }
}
