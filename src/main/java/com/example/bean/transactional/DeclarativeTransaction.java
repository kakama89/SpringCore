package com.example.bean.transactional;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;


public class DeclarativeTransaction {

    @Transactional(readOnly = false, noRollbackFor = IllegalArgumentException.class)
    public void getUser() throws FileNotFoundException { // must be non private
        throw new IllegalArgumentException("File not found");
    }


    public void deleteUser() {

    }

}
