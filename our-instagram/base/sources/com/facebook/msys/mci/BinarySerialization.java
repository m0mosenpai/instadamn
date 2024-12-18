package com.facebook.msys.mci;

import X.C0K8;
import X.C53882dS;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public class BinarySerialization {
    public static native void nativeInitialize();

    public static HashMap decode(byte[] bArr) {
        try {
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (IOException | ClassNotFoundException e) {
            C0K8.A0F("BinarySerialization", "Decode failed.", e);
            return null;
        }
    }

    public static byte[] encode(HashMap hashMap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(hashMap);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                objectOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            C0K8.A0F("BinarySerialization", "Encode failed.", e);
            return null;
        }
    }

    static {
        C53882dS.A00();
    }
}
