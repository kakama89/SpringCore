package com.example.bean.wired;

public class PostgresConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("Postgres connect");
    }
}
