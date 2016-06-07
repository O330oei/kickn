package com.mifos.api.services;

import com.mifos.api.model.APIEndPoint;
import com.mifos.objects.accounts.GroupAccounts;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by nellyk on 3/20/2016.
 */

public interface GroupAccountService {

    @GET(APIEndPoint.GROUPS + "/{groupId}/accounts")
    Observable<GroupAccounts> getAllGroupsOfClient(@Path("groupId") int groupId);

}