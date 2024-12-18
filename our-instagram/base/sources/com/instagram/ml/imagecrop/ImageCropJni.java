package com.instagram.ml.imagecrop;

import X.C09170dP;
import X.C47063KrK;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class ImageCropJni {
    public static final C47063KrK Companion = new Object();
    public static boolean isLibraryLoadSuccessful;
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native float[] getSaliencyRegion(int i, int i2, float f, ByteBuffer byteBuffer);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KrK, java.lang.Object] */
    static {
        C09170dP.A0C("image-crop");
    }
}
