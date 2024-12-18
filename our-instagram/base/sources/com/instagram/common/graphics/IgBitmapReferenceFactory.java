package com.instagram.common.graphics;

import android.graphics.BitmapFactory;

/* loaded from: classes.dex */
public class IgBitmapReferenceFactory {
    public static Boolean A00;

    public static native IgBitmapReference nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options);

    public static synchronized boolean A00() {
        boolean booleanValue;
        synchronized (IgBitmapReferenceFactory.class) {
            Boolean bool = A00;
            if (bool == null) {
                bool = false;
                A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }
}
