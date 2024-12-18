package com.instagram.common.api.base;

import X.C09170dP;
import X.C40566Hym;
import com.facebook.jni.HybridData;

/* loaded from: classes7.dex */
public abstract class RequestMeasurerUtil {
    public static final C40566Hym Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(int i, int i2, int[] iArr, int i3);

    public final native long getLastMeasurementBytes();

    public final native long getLastMeasurementTimeMs();

    public final native boolean requestDidFinishTransferringData(long j, long j2, long j3);

    public final native void requestDidStartTransferringData(long j, long j2, long j3);

    public final native void requestDidTransferData(long j, long j2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Hym, java.lang.Object] */
    static {
        C09170dP.A0C("request_measurement_jni");
    }
}
