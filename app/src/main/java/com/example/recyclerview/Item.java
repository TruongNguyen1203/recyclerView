package com.example.recyclerview;

public class Item {
    private int Image;
    private String Title;
    private String Description;
    private String Category;


    public Item (String Title, String Description, int Image, String Category)
    {
        this.Title = Title;
        this.Description = Description;
        this.Image = Image;
        this.Category = Category;

    }

    public  int getImage()
    {
        return Image;
    }
    public void setImage(int image) {
        this.Image = Image;
    }

    public  String getTitle()
    {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public  String getDescription()
    {
        return Description;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }

    public  String getCategory()
    {
        return Category;
    }
    public void setCategory(String Category){
        this.Category = Category;
    }




}
