package com.facebook.onecamera.components.logging.xlogger.ar;

import X.C09170dP;
import X.InterfaceC201488vd;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class OneCameraARXLoggerImpl implements InterfaceC201488vd {
    public static final String TAG = "OneCameraARXLoggerImpl";
    public HybridData mHybridData;

    private native void createStandaloneOneCameraARXLoggerInternal();

    public static native HybridData initHybrid();

    private native boolean onEventInternal(int i, String str, boolean z);

    private native boolean onFailureEventInternal(int i, String str, String str2, int i2, String str3);

    private native boolean onStartEventInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void updateAnnotationInternal(String str, String str2, String str3);

    public OneCameraARXLoggerImpl() {
        HybridData hybridData;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            loadSoLibrary();
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static void loadSoLibrary() {
        SystemClock.elapsedRealtimeNanos();
        C09170dP.A0C("spark-ocarxlogger-native");
        SystemClock.elapsedRealtimeNanos();
    }

    public void createStandaloneOneCameraARXLogger() {
        createStandaloneOneCameraARXLoggerInternal();
    }

    @Override // X.InterfaceC201488vd
    public boolean onEvent(int i, String str, boolean z) {
        return onEventInternal(i, str, z);
    }

    @Override // X.InterfaceC201488vd
    public boolean onFailureEvent(int i, String str, String str2, int i2, String str3) {
        return onFailureEventInternal(i, str, str2, i2, str3);
    }

    @Override // X.InterfaceC201488vd
    public boolean onStartEvent(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return onStartEventInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // X.InterfaceC201488vd
    public void updateAnnotation(String str, String str2, String str3) {
        updateAnnotationInternal(str, str2, str3);
    }
}
