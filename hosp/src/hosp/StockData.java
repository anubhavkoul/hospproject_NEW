/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp;

/**
 *
 * @author abhishekraina
 */
public class StockData {
    private int registrationId;
    private String name;
    private String batch_no;
    private int quantity;
    private int dateOfExpiry;
    private String monthOfExpiry;
    private int yearOfExpiry;

    /**
     * @return the registrationId
     */
    public int getRegistrationId() {
        return registrationId;
    }

    /**
     * @param registrationId the registrationId to set
     */
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the batch_no
     */
    public String getBatch_no() {
        return batch_no;
    }

    /**
     * @param batch_no the batch_no to set
     */
    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the dateOfExpiry
     */
    public int getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * @param dateOfExpiry the dateOfExpiry to set
     */
    public void setDateOfExpiry(int dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    /**
     * @return the monthOfExpiry
     */
    public String getMonthOfExpiry() {
        return monthOfExpiry;
    }

    /**
     * @param monthOfExpiry the monthOfExpiry to set
     */
    public void setMonthOfExpiry(String monthOfExpiry) {
        this.monthOfExpiry = monthOfExpiry;
    }

    /**
     * @return the yearOfExpiry
     */
    public int getYearOfExpiry() {
        return yearOfExpiry;
    }

    /**
     * @param yearOfExpiry the yearOfExpiry to set
     */
    public void setYearOfExpiry(int yearOfExpiry) {
        this.yearOfExpiry = yearOfExpiry;
    }
}
