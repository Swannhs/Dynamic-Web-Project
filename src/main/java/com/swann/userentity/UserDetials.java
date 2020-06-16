package com.swann.userentity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
public @Data class UserDetials {
    @Id
    @Column(name = "user", length = 30,unique = true)
    @Getter
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

    
    public UserDetials(String user, String fname, String lname,String email, String address, String company, String phone) {
        this.user = user;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.company = company;
		this.phone = phone;
	}

}
