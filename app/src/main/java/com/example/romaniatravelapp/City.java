package com.example.romaniatravelapp;

import java.util.ArrayList;
import java.util.List;

public class City {
    private Integer id;
    private String cityName;
    private List<String> images;
    private String url;
    private Integer collectionSize;
    private String attractions;
    private String description;

    public City(){
        this.id=0;
        this.cityName="";
        this.images=new ArrayList<String>();
        this.url="";
        this.collectionSize=0;
        this.attractions="";
        this.description="";
    }

    public City(Integer id, String name, List<String> img,String url, Integer size, String attractions, String descriptions){
        this.id=id;
        this.cityName=name;
        this.images=img;
        this.url=url;
        this.collectionSize=size;
        this.attractions=attractions;
        this.description=descriptions;
    }

    public Integer getId(){return id;}

    public void setId(Integer id){this.id=id;}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCollectionSize() {
        return collectionSize;
    }

    public void setCollectionSize(Integer collectionSize) {
        this.collectionSize = collectionSize;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }

    public String getDescriptions() {
        return description;
    }

    public void setDescriptions(String descriptions) {
        this.description = descriptions;
    }
}
