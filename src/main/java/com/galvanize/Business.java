package com.galvanize;

import java.util.List;
import java.util.ArrayList;

public class Business implements Addressable {
  private final String name;

  private final ArrayList<Address> addresses = new ArrayList<Address>();

  public Business(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public List<Address> getAddresses(){
    return this.addresses;
  }

  public void addAddress(Address newAddress){
    this.addresses.add(newAddress);
  }
}
