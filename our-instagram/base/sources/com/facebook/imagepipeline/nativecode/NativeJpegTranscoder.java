package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public class NativeJpegTranscoder {
    public int mMaxBitmapSize;
    public boolean mResizingEnabled;
    public boolean mUseDownsamplingRatio;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);
}
