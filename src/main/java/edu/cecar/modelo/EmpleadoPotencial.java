package edu.cecar.modelo;

/**
*
* Clase: EmpleadoPotencial
*
* versión:0.1
*
* fecha Creación: 19/09/2019
*
* fecha Modificación: 19/09/2019
*
* Autor: Carmen Salgado...
*
* @author Casalg
* 
* @class Expression class is undefined on line 15, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE CREAR LOS MODIFICADORES DE ACCESO GET Y SET, ADEMÁS DE LAS VARIABLES...
*
**/

import java.util.HashMap;
import java.util.Map;

public class EmpleadoPotencial {
    
 private int identificador;
 private String users,posts,comments,photos,albums;
// private String first_name,last_name,gender,dob,email,phone,website,address,status;
  private Map<Integer,String> mapfirst_name = new HashMap<>();
  private Map<Integer,String> maplast_name = new HashMap<>();
  private Map<Integer,String> mapgender = new HashMap<>();
  private Map<Integer,String> mapdob = new HashMap<>();
  private Map<Integer,String> mapemail = new HashMap<>();
  private Map<Integer,String> mapphone = new HashMap<>();
  private Map<Integer,String> mapwebsite = new HashMap<>();
  private Map<Integer,String> mapaddress = new HashMap<>();
  private Map<Integer,String> mapstatus = new HashMap<>();

    public EmpleadoPotencial(int identificador, String users, String posts, String comments, String photos, String albums) {
        this.identificador = identificador;
        this.users = users;
        this.posts = posts;
        this.comments = comments;
        this.photos = photos;
        this.albums = albums;
    }

    public int getidentificador() {
        return identificador;
    }

    public void setidentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public String getAlbums() {
        return albums;
    }

    public void setAlbums(String albums) {
        this.albums = albums;
    }

    public Map<Integer, String> getMapfirst_name() {
        return mapfirst_name;
    }

    public void setMapfirst_name(Map<Integer, String> mapfirst_name) {
        this.mapfirst_name = mapfirst_name;
    }

    public Map<Integer, String> getMaplast_name() {
        return maplast_name;
    }

    public void setMaplast_name(Map<Integer, String> maplast_name) {
        this.maplast_name = maplast_name;
    }

    public Map<Integer, String> getMapgender() {
        return mapgender;
    }

    public void setMapgender(Map<Integer, String> mapgender) {
        this.mapgender = mapgender;
    }

    public Map<Integer, String> getMapdob() {
        return mapdob;
    }

    public void setMapdob(Map<Integer, String> mapdob) {
        this.mapdob = mapdob;
    }

    public Map<Integer, String> getMapemail() {
        return mapemail;
    }

    public void setMapemail(Map<Integer, String> mapemail) {
        this.mapemail = mapemail;
    }

    public Map<Integer, String> getMapphone() {
        return mapphone;
    }

    public void setMapphone(Map<Integer, String> mapphone) {
        this.mapphone = mapphone;
    }

    public Map<Integer, String> getMapwebsite() {
        return mapwebsite;
    }

    public void setMapwebsite(Map<Integer, String> mapwebsite) {
        this.mapwebsite = mapwebsite;
    }

    public Map<Integer, String> getMapaddress() {
        return mapaddress;
    }

    public void setMapaddress(Map<Integer, String> mapaddress) {
        this.mapaddress = mapaddress;
    }

    public Map<Integer, String> getMapstatus() {
        return mapstatus;
    }

    public void setMapstatus(Map<Integer, String> mapstatus) {
        this.mapstatus = mapstatus;
    }

    
    
   
     

}
