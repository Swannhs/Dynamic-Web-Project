package com.swann.userentity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

@MappedSuperclass
@ToString
public @Data
abstract class UserEntity<ID> {

    @Version
    private Long version;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "last_modified_date", nullable = false)
    private Date lastModifiedDate;

    public abstract Long getId();


    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @PrePersist
    public void prePersist() {
        this.createdDate = new Date();
        this.lastModifiedDate = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this.lastModifiedDate = new Date();
    }

}
