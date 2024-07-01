package com.home.data;

import jakarta.persistence.*;

@Entity
@Table(name = "user_password_salt", schema = "ptl")
public class SaltInfoDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_password_salt_uid")
    private Long id;
    @Column(name = "user_uid")
    private Long userUid; // Foreign key referencing UserDO table
    @Column(name = "salt_txt")
    private String saltTxt;
    @Column(name = "active_ind")
    private String activeInd;
    public String getActiveInd() {
        return activeInd;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public Long getUserUid() {
        return userUid;
    }

    public void setUserUid(Long userUid) {
        this.userUid = userUid;
    }

    public String getSaltTxt() {
        return saltTxt;
    }

    public void setSaltTxt(String saltTxt) {
        this.saltTxt = saltTxt;
    }

}