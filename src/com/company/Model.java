package com.company;

public class Model {
    private String company;
    private String type;

    public Model(String company, String type){
        this.company = company;
        this.type = type;
    }


    public String getCompany(){
        return company;
    }

    public String getType(){
        return type;
    }
}
