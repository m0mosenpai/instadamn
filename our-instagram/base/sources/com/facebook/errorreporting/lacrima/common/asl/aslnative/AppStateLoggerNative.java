package com.facebook.errorreporting.lacrima.common.asl.aslnative;

/* loaded from: classes.dex */
public class AppStateLoggerNative {
    public static volatile boolean sAppStateLoggerNativeInited = false;
    public static volatile int sSelfSignalFunctionsSuccessfullyHooked = -1;

    public static native void appInForeground(boolean z, boolean z2);

    public static native void disableSelfSigkillHandlers();

    public static native void enableSelfSigkillHandlingForFADv2();

    public static native boolean isShuttingDownNative();

    public static native void registerForMonitoringThreadLocalKeys(String str);

    public static native boolean registerOomHandler();

    public static native int registerSelfSigkillHandlers();

    public static native void registerStreamWithBreakpad();

    public static native void registerWithNativeCrashHandler(String str, String str2, String str3, String str4, boolean z);

    public static native void replaceThreadLocalImplementation();

    public static native void selfSigkillWithoutUpdatingAppStateLogStatus();

    public static native void setBreakpadStreamDataNative(byte[] bArr);
}
