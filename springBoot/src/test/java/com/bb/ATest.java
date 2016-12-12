package com.bb;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by admin on 2016/12/10.
 */
public class ATest {



    public static void main(String[] args) {

        String text = "Example on how to convert a String to an InputStream";

        try {
            InputStream is = new ByteArrayInputStream(text.getBytes());

            int byteRead;
            while ((byteRead = is.read()) != -1) {
                System.out.print((char)byteRead);
            }
            System.out.println();
            is.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
