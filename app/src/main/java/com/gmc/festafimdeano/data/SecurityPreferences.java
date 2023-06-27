package com.gmc.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;
/* sharedpreferences guarda arquivos simples na memoria */
public class SecurityPreferences {

    private SharedPreferences mSharedPreferences;

    public SecurityPreferences(Context mContext){ //Construtor
       this.mSharedPreferences = mContext.getSharedPreferences("FestaFimAno", Context.MODE_PRIVATE);

    }

    public void storeString(String key, String value){
        this.mSharedPreferences.edit().putString(key,value).apply();
    }

    public String getStoreString(String key){
        return this.mSharedPreferences.getString(key,"");
    }


}

