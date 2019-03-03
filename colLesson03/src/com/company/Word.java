package com.company;

public class Word {
    public String unknown;
    public String meaning;

    public Word(String unknown, String meaning){
        this.unknown = unknown;
        this.meaning = meaning;
    }

    public String getUnknown(){
        return  unknown;
    }

    public void setUnknown(String unknown){
        this.unknown = unknown;
    }

    public String getMeaning(){
        return meaning;
    }

    public void setMeaning(String meaning){
        this.meaning = meaning;
    }
}
