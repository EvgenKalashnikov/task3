package task.model;

 public class Address {
    private String postIndex;
    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;

     public Address() {
     }

     public Address(String postIndex, String city, String street, String houseNumber, String flatNumber) {
         this.postIndex = postIndex;
         this.city = city;
         this.street = street;
         this.houseNumber = houseNumber;
         this.flatNumber = flatNumber;
     }

     public String getPostIndex() {
         return postIndex;
     }

     public void setPostIndex(String postIndex) {
         this.postIndex = postIndex;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getStreet() {
         return street;
     }

     public void setStreet(String street) {
         this.street = street;
     }

     public String getHouseNumber() {
         return houseNumber;
     }

     public void setHouseNumber(String houseNumber) {
         this.houseNumber = houseNumber;
     }

     public String getFlatNumber() {
         return flatNumber;
     }

     public void setFlatNumber(String flatNumber) {
         this.flatNumber = flatNumber;
     }

     @Override
     public String toString() {
         return "Address{" +
                 "postIndex='" + postIndex + '\'' +
                 ", city='" + city + '\'' +
                 ", street='" + street + '\'' +
                 ", houseNumber='" + houseNumber + '\'' +
                 ", flatNumber='" + flatNumber + '\'' +
                 '}';
     }
 }
