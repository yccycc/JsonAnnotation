package com.example.dicky.ormlitetest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.dicky.ormlitetest.bean.TeacherBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
        String str = "{\"god_age\":18}";
        Log.i("goddes", gson.toJson(new TeacherBean()));
        Type type = new TypeToken<TeacherBean>(){}.getType();
        TeacherBean tt = gson.fromJson(str, type);
        Log.i("goddes", tt.toString());
    }

}
