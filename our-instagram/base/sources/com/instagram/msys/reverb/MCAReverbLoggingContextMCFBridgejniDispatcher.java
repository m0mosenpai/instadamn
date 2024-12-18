package com.instagram.msys.reverb;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public class MCAReverbLoggingContextMCFBridgejniDispatcher {
    public static native NativeHolder MCAReverbLoggingContextCreateNative(String str);

    public static native NativeHolder MCAReverbLoggingContextCreateWithQPLInstanceNative(String str, int i, int i2);

    public static native int MCAReverbLoggingContextGetQplInstanceKeyNative(NativeHolder nativeHolder);

    public static native String MCAReverbLoggingContextGetUniqueIdNative(NativeHolder nativeHolder);

    static {
        C09170dP.A0C("MCAReverbLoggingContextMCFBridgejni");
    }
}
