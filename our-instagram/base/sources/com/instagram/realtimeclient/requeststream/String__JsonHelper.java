package com.instagram.realtimeclient.requeststream;

import X.AbstractC166987dD;
import X.C02R;
import X.C16L;
import java.io.Reader;

/* loaded from: classes10.dex */
public final class String__JsonHelper {
    public static int sBufferLength = 1000;

    public static String parseFromJson(String str) {
        return str;
    }

    public static String parseFromJson(C16L c16l) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        int i = sBufferLength;
        char[] cArr = new char[i];
        Object A1M = c16l.A1M();
        C02R.A03(A1M, "Created by SessionAwareJsonFactory.createParser, cannot be null");
        Reader reader = (Reader) A1M;
        try {
            reader.reset();
            for (int i2 = 0; i2 != -1; i2 = reader.read(cArr, 0, i)) {
                A1C.append(cArr, 0, i2);
            }
            reader.close();
            return A1C.toString();
        } catch (Throwable th) {
            if (reader != null) {
                try {
                    reader.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
