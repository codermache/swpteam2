/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Thinkpad
 */
public class User {

    private int id;
    /*User ID*/
    private String username;
    /*User Name*/
    private String password;
    /*User password*/
    private String email;
    /*User Mail*/
    private String name;
    /*User Name*/
    private String address;
    /*User mobile*/
    private int phone;
    /*User status*/
    private int roleID;
    /*User Role Entity*/
    private int banned;
    /*Banner User Entity*/
    
    /**
     * Blank constructor
     */
    public User() {
    }

    /**
     * Complete constructor
     *
     * @param id
     * @param username
     * @param password
     * @param email
     * @param address
     * @param phone
     * @param roleID
     * @param banned
     */
    public User(int id, String username, String password, String email, String name, String address, int phone, int roleID, int banned) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.roleID = roleID;
        this.banned = banned;
    }

  
    /**
     * Get user id
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Set user id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get user name
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set user name
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get user password
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set user password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get user email
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set user email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get user name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set user name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get user address
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set user address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get user phone
     *
     * @return
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Set user phone
     *
     * @param phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Get user roleID
     *
     * @return
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Set user roleID
     *
     * @param roleID
     */
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    /**
     * Get user banned
     *
     * @return
     */
    public int getBanned() {
        return banned;
    }

    /**
     * Set user banned
     *
     * @param banned
     */
    public void setBanned(int banned) {
        this.banned = banned;
    }

}
