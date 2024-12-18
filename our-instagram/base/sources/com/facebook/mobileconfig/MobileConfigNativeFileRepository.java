package com.facebook.mobileconfig;

import X.C09270dc;

/* loaded from: classes.dex */
public class MobileConfigNativeFileRepository {
    public static String TAG = "MobileConfigNativeFileRepository";
    public static boolean isNativeBridgeInitialized;

    public static native void registerNativeBridge();

    public static synchronized void registerFileRepository() {
        synchronized (MobileConfigNativeFileRepository.class) {
            if (!isNativeBridgeInitialized) {
                registerNativeBridge();
                isNativeBridgeInitialized = true;
            }
        }
    }

    static {
        C09270dc.A03("mobileconfig-jni");
    }
}
