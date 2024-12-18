package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class TarBrotliDecompressor {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        C09170dP.A0C("tar-brotli-archive-native");
    }
}
