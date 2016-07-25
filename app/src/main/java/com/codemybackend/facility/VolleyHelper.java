package com.codemybackend.facility;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class VolleyHelper {

    private static VolleyHelper mInstance;
    private RequestQueue mRequestQueue;
    private static Context mctx;

    private VolleyHelper(Context context){
        mctx = context;
        mRequestQueue = getRequestQueue();

    }

    public static synchronized VolleyHelper getInstance(Context context){
        if (mInstance == null){
            mInstance = new VolleyHelper(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        if (mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(mctx.getApplicationContext());
        }
        return mRequestQueue;
    }


    public <T> void addToRequestQueue (Request<T> req){
        getRequestQueue().add(req);
    }

}
