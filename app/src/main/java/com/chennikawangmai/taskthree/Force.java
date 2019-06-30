package com.chennikawangmai.taskthree;

import com.google.gson.annotations.SerializedName;

public class Force {
    @SerializedName("body")
    private String description;
    private String url;
    private String id;
    private String telephone;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
