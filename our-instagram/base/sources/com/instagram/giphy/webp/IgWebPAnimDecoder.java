package com.instagram.giphy.webp;

import X.AbstractC166997dE;
import X.C14360o3;
import android.graphics.Bitmap;
import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class IgWebPAnimDecoder {
    public final AtomicBoolean destructed = AbstractC166997dE.A17();
    public final HybridData mHybridData;

    private final native int nativeGetDuration();

    private final native int nativeGetFrameCount();

    private final native int nativeGetHeight();

    private final native int nativeGetLoopCount();

    private final native int nativeGetMaxCropX();

    private final native int nativeGetMaxCropY();

    private final native int nativeGetMinCropX();

    private final native int nativeGetMinCropY();

    private final native int nativeGetWidth();

    private final native void nativeSeekToFrame(int i, Bitmap bitmap);

    private final native int nativeSeekToTime(int i, Bitmap bitmap);

    public final synchronized int seekToTime(int i, Bitmap bitmap) {
        C14360o3.A0B(bitmap, 1);
        return nativeSeekToTime(i, bitmap);
    }

    public IgWebPAnimDecoder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final int getDuration() {
        return nativeGetDuration();
    }

    public final int getFrameCount() {
        return nativeGetFrameCount();
    }

    public final int getHeight() {
        return nativeGetHeight();
    }

    public final int getMaxCropX() {
        return nativeGetMaxCropX();
    }

    public final int getMaxCropY() {
        return nativeGetMaxCropY();
    }

    public final int getMinCropX() {
        return nativeGetMinCropX();
    }

    public final int getMinCropY() {
        return nativeGetMinCropY();
    }

    public final int getWidth() {
        return nativeGetWidth();
    }
}
