package com.example.yazidnaufalhudzami_41522010078_tugasbesar2.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}