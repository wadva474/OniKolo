package com.example.onikolo.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class LogIn {
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("banks")
    @Expose
    private String banks;
    @SerializedName("message")
    @Expose
    private String message;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBanks() {
        return banks;
    }

    public void setBanks(String banks) {
        this.banks = banks;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    }
