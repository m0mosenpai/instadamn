package com.facebook.browser.helium.goofy_linker;

/* loaded from: classes10.dex */
public abstract class GoofyLibrary {
    public static native int nativeCreate(String str);

    public static native void nativePopulate(int i, int i2);

    static {
        System.loadLibrary("goofy_library");
    }
}
