package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

import java.util.Random;

public class FilePathExampleReview {
    @Test
    public void test1(){
        String projectName = System.getProperty("user.dir");
        String pathName = "src/test/resources/textfile.txt";
        String fullPath = projectName + "/" + pathName;
        System.out.println("fullPath = " + fullPath);

    }

}
