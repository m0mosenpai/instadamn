package com.google.ar.core;

import X.EnumC72366Xc2;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class CameraConfigFilter {
    public long A00;
    public final long A01;
    public final Session A02;

    public CameraConfigFilter() {
        this.A02 = null;
        this.A00 = 0L;
        this.A01 = 0L;
    }

    public static native long nativeCreateCameraConfigFilter(long j);

    public static native void nativeDestroyCameraConfigFilter(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native int nativeGetStereoCameraUsage(long j, long j2);

    private native int nativeGetTargetFps(long j, long j2);

    private native void nativeSetDepthSensorUsage(long j, long j2, int i);

    private native void nativeSetFacingDirection(long j, long j2, int i);

    private native void nativeSetStereoCameraUsage(long j, long j2, int i);

    private native void nativeSetTargetFps(long j, long j2, int i);

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeDestroyCameraConfigFilter(this.A01, j);
            this.A00 = 0L;
        }
    }

    public CameraConfigFilter(Session session) {
        this.A02 = session;
        this.A00 = nativeCreateCameraConfigFilter(session.nativeWrapperHandle);
        this.A01 = session.nativeSymbolTableHandle;
    }

    public final void A00(EnumSet enumSet) {
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC72366Xc2) it.next()).A00;
        }
        nativeSetTargetFps(this.A02.nativeWrapperHandle, this.A00, i);
    }
}
