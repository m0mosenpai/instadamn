package com.facebook.acra.util;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class NativeProcFileReader {
    public static final AtomicBoolean sReadyToUse = new AtomicBoolean(false);

    private native int[] getOpenFDLimitsNative();

    public native int getOpenFDCount();

    public native String getOpenFileDescriptors();

    public NativeProcFileReader() {
        if (sReadyToUse.get()) {
        } else {
            throw new IllegalStateException("Class is not ready");
        }
    }
}
