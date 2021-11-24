package edu.upc.dsa.restclientandroid;

public class Track {
    private String id;
    private String title;
    private String singer;

    public Track(){
        //Empty Constructor
    }

    public Track(String title, String singer) { //POST Method
        this.title = title;
        this.singer = singer;
    }

    public Track(String id, String title, String singer){ //PUT (edit) Method
        this.id = id;
        this.title = title;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }
}
