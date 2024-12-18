package com.facebook.animated.gif;

import X.XEH;
import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public class GifFrame implements XEH {
    public long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // X.XEH
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDisposalMode() {
        return nativeGetDisposalMode();
    }

    @Override // X.XEH
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.XEH
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.XEH
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.XEH
    public int getYOffset() {
        return nativeGetYOffset();
    }

    @Override // X.XEH
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
