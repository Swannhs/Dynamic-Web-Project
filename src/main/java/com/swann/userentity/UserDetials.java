package com.swann.userentity;

import javax.persistence.*;

@Entity
public class UserDetials {
    @Id
    @Column(name = "user", length = 30,unique = true)
    private String user;

    @Column(name = "firest_name", length = 30)
    private String fname;

    @Column(name = "last_name", length = 30)
    private String lname;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "address", unique = false, length = 100)
    private String address;

    @Column(name = "company", unique = false, length = 100)
    private String company;

    @Column(name = "phone", unique = false, length = 100)
    private String phone;

    public UserDetials() {
	}
    
    public UserDetials(String user, String fname, String lname,String email, String address, String company, String phone) {
        this.user = user;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.company = company;
		this.phone = phone;
	}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDetials{" +
                "user='" + user + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
