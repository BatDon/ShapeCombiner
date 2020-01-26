package com.test.table.MySQLAndroidCaching;

//package com.journaldev.retrofitintro;

//import com.test.table.mysqlandroid.pojo.MultipleResource;
//import com.journaldev.retrofitintro.pojo.MultipleResource;
//import com.journaldev.retrofitintro.pojo.User;
//import com.journaldev.retrofitintro.pojo.UserList;
//import com.test.table.mysqlandroid.pojo.MultipleResource;

import retrofit2.Call;
import retrofit2.http.GET;

interface ApiService {

    @GET("/")
    Call<ClientList> getMyJSON();

}




//    @GET("/")
//    Call<Client> doGetListResources();
//
//    @POST("/api/users")
//    Call<User> createUser(@Body User user);
//
//    @GET("/api/users?")
//    Call<UserList> doGetUserList(@Query("page") String page);
//
//    @FormUrlEncoded
//    @POST("/api/users?")
//    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
//}
