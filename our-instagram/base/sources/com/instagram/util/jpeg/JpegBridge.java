package com.instagram.util.jpeg;

import X.C09170dP;
import X.C0K8;
import X.C0w9;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class JpegBridge {
    public static boolean A00;

    public static NativeImage A00(Rect rect, String str) {
        if (rect != null) {
            return decodeCroppedJpeg(str, rect.left, rect.top, rect.right, rect.bottom, 12);
        }
        return decodeFullJpeg(str, 12);
    }

    public static native float[] calcBWpoint(int i);

    public static native int calcCDF(int i);

    public static native boolean compressBitmapToFileNative(Bitmap bitmap, String str, int i, boolean z, boolean z2, boolean z3);

    public static native NativeImage createNativeImageFromRgbaBuffer(int i, int i2, ByteBuffer byteBuffer);

    public static native NativeImage decodeCroppedJpeg(String str, int i, int i2, int i3, int i4, int i5);

    public static native NativeImage decodeCroppedJpegFromMemory(int i, int i2, byte[] bArr, int i3, int i4, int i5, int i6, int i7);

    public static native NativeImage decodeFullJpeg(String str, int i);

    public static native NativeImage decodeFullJpegFromMemory(int i, int i2, byte[] bArr, int i3);

    public static native String getJpegLibraryNameNative();

    public static native String getJpegLibraryVersionNative();

    public static native int loadBufferToTexture(long j, int i, int i2, int i3);

    public static native int loadCDF(int i);

    public static native int releaseNativeBuffer(int i);

    public static native NativeImage rotateImage(NativeImage nativeImage, int i);

    public static native int saveImage(NativeImage nativeImage, String str, int i, boolean z, boolean z2);

    public static native NativeImage scaleImage(NativeImage nativeImage, int i, int i2, int i3);

    public static native int uploadTexture(NativeImage nativeImage, int i);

    public static synchronized boolean A01() {
        boolean z;
        synchronized (JpegBridge.class) {
            if (!A00) {
                try {
                    C09170dP.A0C("cj_moz");
                    A00 = true;
                } catch (UnsatisfiedLinkError e) {
                    C0K8.A05(JpegBridge.class, "Could not load native library", e);
                    C0w9.A07("jpegbridge_load_error", e);
                }
            }
            z = A00;
        }
        return z;
    }
}
