package com.facebook.common.mallochooks.jni;

import X.C09170dP;

/* loaded from: classes.dex */
public class NativeAllocationHooksUtil$NativeImpl {
    public static String sErrorMessage;

    public static native boolean installGwpAsanNative(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, int i7);

    public static native boolean installMitmHooksNative(int i, int i2, int i3, String str, boolean z, int i4);

    public static native boolean installNoopHooksNative();

    public static native boolean verifyMallocHooksNative(String str, boolean z, boolean z2);

    public static void setErrorMessage(String str) {
        sErrorMessage = str;
    }

    static {
        C09170dP.A0C("native_allocation_hooks_installer_jni");
    }
}
