package com.test.table.MySQLAndroidCaching.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Client {

    @SerializedName("id")
    @Expose
//    public String id;
    public int id;
    @SerializedName("firstName")
    @Expose
    public String firstName;
    @SerializedName("lastName")
    @Expose
    public String lastName;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("phone")
    @Expose
    public String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//    public String getId() {
//    return id;
//}
//
//    public void setId(String id) {
//        this.id = id;
//    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//}
}
















//    @SerializedName("data")
//    public List<Datum> data = null;
//
//public class Datum {
//
//    @SerializedName("id")
//
//    public Integer id;
//
//    @SerializedName("firstName")
//    public String firstName;
//
//    @SerializedName("lastName")
//    public String lastName;
//
//    @SerializedName("address")
//    public String address;
//
//    @SerializedName("phone")
//    public String phone;
//}


































//package com.test.table.mysqlandroid.pojo;
//
//
////package com.journaldev.retrofitintro.pojo;
//
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MultipleResource {
//
////    @SerializedName("page")
////    public Integer page;
////    @SerializedName("per_page")
////    public Integer perPage;
////    @SerializedName("total")
////    public Integer total;
////    @SerializedName("total_pages")
////    public Integer totalPages;
//    @SerializedName("data")
//    public List<Datum> data = null;
//
//    public class Datum {
//
//        @SerializedName("id")
//
//        public Integer id;
//
//        @SerializedName("firstName")
//        public String firstName;
//
//        @SerializedName("lastName")
//        public String lastName;
//
//        @SerializedName("address")
//        public String address;
//
//        @SerializedName("phone")
//        public String phone;




//        @SerializedName("id")
//        @Expose
//        public Integer id;
//        @Expose
//        @SerializedName("firstName")
//        public String firstName;
//        @Expose
//        @SerializedName("lastName")
//        public String lastName;
//        @Expose
//        @SerializedName("address")
//        public String address;
//        @Expose
//        @SerializedName("phone")
//        public String phone;




//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getFirstName() {
//            return firstName;
//        }
//
//        public void setFirstName(String firstName) {
//            this.firstName = firstName;
//        }
//        public String getLastName() {
//            return lastName;
//        }
//
//        public void setLastName(String lastName) {
//            this.lastName = lastName;
//        }
//
//
//        public String getAddress() {
//            return address;
//        }
//
//        public void setAddress(String address) {
//            this.address = address;
//        }
//
//        public String getPhone() {
//            return phone;
//        }
//        public void setPhone(String phone) {
//            this.phone = phone;
//        }
//
 //   }
//}
