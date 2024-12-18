package com.instagram.ui.igluglrender.hardwaretexture;

import X.A2T;
import X.C09170dP;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class HardwareTexture {
    public static final A2T Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native boolean allocateJni(IgluConfigHolder igluConfigHolder, int i, int i2);

    public final native Object getHardwareBuffer();

    public final native int getTextureIdJni();

    public final native void releaseJni();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.A2T, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-hardwarebuffer");
    }

    public final Bitmap getBitmap() {
        HardwareBuffer hardwareBuffer = (HardwareBuffer) getHardwareBuffer();
        if (hardwareBuffer == null) {
            return null;
        }
        return Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
    }
}
