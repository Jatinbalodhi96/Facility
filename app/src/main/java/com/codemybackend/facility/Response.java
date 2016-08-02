package com.codemybackend.facility;

import java.util.List;


public class Response {

    private String help;
    private boolean success;
    private int count;
    /**
     * id : {"type":"serial","size":"normal","not null":true,"description":""}
     * timestamp : {"type":"int","size":"normal","not null":false,"description":""}
     * f_id : {"type":"int","size":"normal","not null":false,"description":""}
     * state : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * city : {"type":"varbinary","size":"normal","length":"50","not null":false,"description":""}
     * district : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * h_name : {"type":"varchar","size":"normal","length":"150","not null":false,"description":""}
     * address : {"type":"varchar","size":"normal","length":"150","not null":false,"description":""}
     * pincode : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * contact : {"type":"varchar","size":"normal","length":"150","not null":false,"description":""}
     * helpline : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * fax : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * category : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * website : {"type":"varchar","size":"normal","length":"100","not null":false,"description":""}
     * email : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * blood_component : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * blood_group : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * service_time : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * latitude : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     * longitude : {"type":"varchar","size":"normal","length":"50","not null":false,"description":""}
     */

    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        private String id;
        private String timestamp;
        private String f_id;
        private String state;
        private String city;
        private String district;
        private String h_name;
        private String address;
        private String pincode;
        private String contact;
        private String helpline;
        private String fax;
        private String category;
        private String website;
        private String email;
        private String blood_component;
        private String blood_group;
        private String service_time;
        private String latitude;
        private String longitude;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getF_id() {
            return f_id;
        }

        public void setF_id(String f_id) {
            this.f_id = f_id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getH_name() {
            return h_name;
        }

        public void setH_name(String h_name) {
            this.h_name = h_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getHelpline() {
            return helpline;
        }

        public void setHelpline(String helpline) {
            this.helpline = helpline;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getBlood_component() {
            return blood_component;
        }

        public void setBlood_component(String blood_component) {
            this.blood_component = blood_component;
        }

        public String getBlood_group() {
            return blood_group;
        }

        public void setBlood_group(String blood_group) {
            this.blood_group = blood_group;
        }

        public String getService_time() {
            return service_time;
        }

        public void setService_time(String service_time) {
            this.service_time = service_time;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }
}
