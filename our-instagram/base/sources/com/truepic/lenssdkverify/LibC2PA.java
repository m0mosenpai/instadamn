package com.truepic.lenssdkverify;

import X.C09170dP;

/* loaded from: classes11.dex */
public class LibC2PA {
    public static native String filenameGetC2PAJson(String str);

    public static native Object[] filenameGetC2PAJsonWithThumbnails(String str);

    public static native String getC2PAJson(byte[] bArr);

    static {
        C09170dP.A0C("android_c2pa");
    }
}
