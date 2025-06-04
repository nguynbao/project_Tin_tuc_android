package com.example.myapplication.component;

import android.net.Uri;

import androidx.room.TypeConverter;

public class UriTypeConverter {

    @TypeConverter
    public static String fromUri(Uri uri) {
        return uri == null ? null : uri.toString();
    }

    @TypeConverter
    public static Uri toUri(String uriString) {
        return uriString == null ? null : Uri.parse(uriString);
    }
}