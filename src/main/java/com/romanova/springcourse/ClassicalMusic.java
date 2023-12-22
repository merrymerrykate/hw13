package com.romanova.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {


    public String getSong() {
        return  " ClassicalMusic song";
    }

}
