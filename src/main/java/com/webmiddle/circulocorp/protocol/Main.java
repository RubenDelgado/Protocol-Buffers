/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webmiddle.circulocorp.protocol;

import com.webmiddle.circulocorp.protocol.model.Message;
import com.webmiddle.circulocorp.protocol.protos.EventHeaderProto;
import com.webmiddle.circulocorp.protocol.protos.PeriodicPositionProto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Ruben
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        Message message = new Message();
        message.setLatitude("18.9032865");
        message.setLongitude("-99.1345474");
        message.setTemplateId(1);
        message.setUnitId("a3tek0030");
        message.setUtcTimestamp(new Date());
        message.setVin("1N6AA1E50MZ502498");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utcTimestamp = sdf.format(message.getUtcTimestamp());

        String data = PeriodicPositionProto.PeriodicPosition
                .newBuilder()
                .setHeader(EventHeaderProto.EventHeader
                        .newBuilder()
                        .setLatitude(Double.parseDouble(message.getLatitude()))
                        .setLongitude(Double.parseDouble(message.getLongitude()))
                        .setTemplateId(message.getTemplateId())
                        .setUnitId(message.getUnitId())
                        .setUtcTimestampSeconds(sdf.parse(utcTimestamp).getTime())
                        .build())
                .build().toString();

        System.out.println("DATA STRING:\n" + data);

        byte[] dataBytes = PeriodicPositionProto.PeriodicPosition
                .newBuilder()
                .setHeader(EventHeaderProto.EventHeader
                        .newBuilder()
                        .setLatitude(Double.parseDouble(message.getLatitude()))
                        .setLongitude(Double.parseDouble(message.getLongitude()))
                        .setTemplateId(message.getTemplateId())
                        .setUnitId(message.getUnitId())
                        .setUtcTimestampSeconds(sdf.parse(utcTimestamp).getTime())
                        .build())
                .build().toByteArray();

        System.out.println("DATA BYTES:\n" + Arrays.toString(dataBytes));

        String encodedString = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println("\nDATA STRING TO BASE64:\n" + encodedString);

        String encodedBytes = Base64.getEncoder().encodeToString(dataBytes);
        System.out.println("\nDATA BYTES TO BASE64:\n" + encodedBytes);

//        MessageProtos.Data data = MessageProtos.Data.newBuilder()
//                .setLatitude(message.getLatitude())
//                .setLongitude(message.getLongitude())
//                //.setUtcTimestamp(utcTimestamp)
//                //.setVin(message.getVin())
//                .build();
//
//        System.out.println("PROTOCOL BUFFER DATA: \n" + data.toString());
//
//        String encodedString = Base64.getEncoder().encodeToString(data.toString().getBytes());
//        System.out.println("DATA STRING TO BASE64: " + encodedString);
//
//        String encodedBytes = Base64.getEncoder().encodeToString(data.toByteArray());
//        System.out.println("DATA BYTE ARRAY TO BASE64: " + encodedBytes);
//
//         byte[] encodedBytes2 = Base64.getEncoder().encode(data.toString().getBytes());
//         System.out.println("DATA BYTE ARRAY TO BASE64: " + new String(encodedBytes2, StandardCharsets.UTF_8));
//        String jsonString = ProtoJsonUtil.toJson(data);
//        System.out.println("DATA JSON: \n" + jsonString);
//
//        FileOutputStream fos = new FileOutputStream("Message.txt");
//        data.writeTo(fos);
//
//        MessageProtos.Data dataDeserialized = MessageProtos.Data.newBuilder().mergeFrom(new FileInputStream("Message.txt")).build();
//        System.out.println("DATA DESEREALIZE: \n" + dataDeserialized.toString());
    }

}
