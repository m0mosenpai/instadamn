package com.facebook.common.iopri;

/* loaded from: classes10.dex */
public class IoPriority {
    static {
        try {
            Class.forName("com.facebook.common.iopri.loader.IoPriLoader").getDeclaredMethod("load", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static native int nativeGetCurrentIoPriority();

    public static native int nativeGetIoPriority(int i);

    public static native int nativeGetIoValueClass(int i);

    public static native int nativeGetIoValueData(int i);

    public static native int nativeGetRawIoPriValue(int i, int i2);

    public static native void nativeSetCurrentIoPriority(int i, int i2);

    public static native void nativeSetCurrentRawIoPriority(int i);

    public static native void nativeSetIoPriority(int i, int i2, int i3);

    public static native void nativeSetRawIoPriority(int i, int i2);
}
