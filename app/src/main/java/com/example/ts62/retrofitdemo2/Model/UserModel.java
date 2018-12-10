package com.example.ts62.retrofitdemo2.Model;

public class UserModel {
    private String FirstName;
    private String LastName;
    private String Email;
    private CountryModel country;
    private int CountryId;
    private String CountryCode;
    private String Phone;
    private int UserId;
    private String ProfilePicture;
    private String FaceBookId;
    private String GoogleId;
    private float ratings;
    private boolean isPaymentAdded;
    private boolean isVehicleAdded;
    private int DeviceTypeId;
    private boolean IsVerified;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public CountryModel getCountry() {
        return country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getProfilePicture() {
        return ProfilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        ProfilePicture = profilePicture;
    }

    public String getFaceBookId() {
        return FaceBookId;
    }

    public void setFaceBookId(String faceBookId) {
        FaceBookId = faceBookId;
    }

    public String getGoogleId() {
        return GoogleId;
    }

    public void setGoogleId(String googleId) {
        GoogleId = googleId;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public boolean isPaymentAdded() {
        return isPaymentAdded;
    }

    public void setPaymentAdded(boolean paymentAdded) {
        isPaymentAdded = paymentAdded;
    }

    public boolean isVehicleAdded() {
        return isVehicleAdded;
    }

    public void setVehicleAdded(boolean vehicleAdded) {
        isVehicleAdded = vehicleAdded;
    }

    public int getDeviceTypeId() {
        return DeviceTypeId;
    }

    public void setDeviceTypeId(int deviceTypeId) {
        DeviceTypeId = deviceTypeId;
    }

    public boolean isVerified() {
        return IsVerified;
    }

    public void setVerified(boolean verified) {
        IsVerified = verified;
    }
}
