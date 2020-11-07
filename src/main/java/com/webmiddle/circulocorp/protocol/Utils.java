/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webmiddle.circulocorp.protocol;

import com.webmiddle.circulocorp.protocol.model.Message;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ruben
 */
public class Utils {

    public static byte[] getbytes(Message eventBase) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(eventBase);
            out.flush();
            byte[] yourBytes = bos.toByteArray();
            return yourBytes;
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }
    }
}
