package com.library.service;

import com.library.constants.LibraryConstants;

import retrofit2.Retrofit;

/** Copyright 2013 Square, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

public class BaseRestClient {

    private static Retrofit retrofit;

    static Retrofit getRetrofit(){

        retrofit = new Retrofit.Builder()
                .baseUrl(LibraryConstants.SERVER_BASEURL)
                .build();
        return retrofit;
    }

    static <T> T getApiClient(final Class<T> apiClass){

        if(retrofit == null){
            retrofit = getRetrofit();
        }

        T apiClient = retrofit.create(apiClass);

        return apiClient;
    }

}

