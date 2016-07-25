package com.codemybackend.facility;

//https://data.gov.in/api/datastore/resource.json?
// resource_id=e16c75b6-7ee6-4ade-8e1f-2cd3043ff4c9
// &api-key=data.gov.in api key
// &filters[state]=delhi
// &fields=city,id,state,h_name,address,email,contact,latitude,longitude
// &sort[city]

import android.net.Uri;

public class UriBuilder {

    public String getURL() {

        String resource_id = "e16c75b6-7ee6-4ade-8e1f-2cd3043ff4c9";
        String api_key = "bacdc4a9814fb08420fda85d2cc0c4bd";
        String filters = "delhi";
        String fields = "city,id,state,h_name,address,email,contact,latitude,longitude";
        String sort = "[city]";


        final String DATA_BASE_URL = "https://data.gov.in/api/datastore/resource.json?";
        final String QUERY_RESOURCE_ID = "resource_id";
        final String QUERY_API_KEY = "api-key";
        final String QUERY_FILTERS = "filters[state]";
        final String QUERY_FIELDS = "fields";
        final String QUERY_SORT = "sort[city]";

        Uri builturi = Uri.parse(DATA_BASE_URL).buildUpon()
                .appendQueryParameter(QUERY_RESOURCE_ID, resource_id)
                .appendQueryParameter(QUERY_API_KEY, api_key)
                .appendQueryParameter(QUERY_FILTERS, filters)
                .appendQueryParameter(QUERY_FIELDS, fields)
                .appendQueryParameter(QUERY_SORT, sort)
                .build();

                String url = builturi.toString();

        return url;

    }
}
