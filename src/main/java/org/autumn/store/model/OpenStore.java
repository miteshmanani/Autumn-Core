package org.autumn.store.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.autumn.storedetails.model.StoreDetails;
import org.hibernate.annotations.Proxy;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mitesh Manani
 */
@Entity
@Table(name = "openstore")
@Proxy(lazy = false)
public class OpenStore {

    @Id
    @Column(name = "storeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    private String storeName;
    private String storeURL;
    @Embedded
    private StoreDetails storeDetails;

    public StoreDetails getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(StoreDetails storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getStoreURL() {
        return storeURL;
    }

    public void setStoreURL(String storeURL) {
        this.storeURL = storeURL;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "storeId=" + storeId + ", storeName=" + storeName +", storeURL=" + storeURL;
    }
}
