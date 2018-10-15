package task.model;

import java.util.Arrays;
import java.util.Date;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickname;
    private String comments;
    private String phoneNumber;
    private String email;
    private String skype;
    private Group[] group;
    private Date createDate;
    private Date lastUpdate;
    private Address address;

    public User() {
    }

    public User(String firstName, String middleName, String lastName, String nickname,
                String comments, String phoneNumber, String email, String skype, Date createDate, Date lastUpdate, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.comments = comments;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.skype = skype;
        this.group = Group.values();
        this.createDate = new Date();
        this.lastUpdate = new Date();
        this.address = address;

    }

    public enum Group {
        GROUP_1, GROUP_2
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comments='" + comments + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", group=" + Arrays.toString(group) +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                ", address=" + address +
                '}';
    }
}
