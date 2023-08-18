package functions;

import api.UserApi;
import models.user_list.RootModel;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserFunctions extends UserApi {
    public void getUserListPage(){
        RootModel rootModel = requestGetUserList().extract().as(RootModel.class);
        assertThat(rootModel.page, equalTo(2));
    }
}