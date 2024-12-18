package com.facebook.photos.upload.mediaqualitykit.imagequalityutils;

import X.C09170dP;
import X.C53723NpC;
import android.graphics.Bitmap;
import com.facebook.jni.HybridClassBase;

/* loaded from: classes9.dex */
public final class ImageQualityUtils extends HybridClassBase {
    public static final C53723NpC Companion = new Object();
    public static int GREEN_CHANNEL = 1;
    public static int BLUE_CHANNEL = 2;

    private final native void initHybrid();

    public final native float calculateColorChannelSSIM(int i, Bitmap bitmap, Bitmap bitmap2);

    public final native float calculateESSIM(Bitmap bitmap, Bitmap bitmap2);

    public final native double calculateMSSSIM(Bitmap bitmap, Bitmap bitmap2);

    public final native float calculateSSIM(Bitmap bitmap, Bitmap bitmap2);

    public final native int getBitmapStride(Bitmap bitmap);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NpC, java.lang.Object] */
    static {
        C09170dP.A0C("image_quality_utils");
    }

    public ImageQualityUtils() {
        initHybrid();
    }
}
