package org.webrtc;

import X.AbstractC166987dD;

/* loaded from: classes12.dex */
public class TimestampAligner {
    public volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    public static native long nativeCreateTimestampAligner();

    public static native void nativeReleaseTimestampAligner(long j);

    public static native long nativeRtcTimeNanos();

    public static native long nativeTranslateTimestamp(long j, long j2);

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner != 0) {
        } else {
            throw AbstractC166987dD.A14("TimestampAligner has been disposed.");
        }
    }

    public static long getRtcTimeNanos() {
        return nativeRtcTimeNanos();
    }

    public void dispose() {
        checkNativeAlignerExists();
        nativeReleaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0L;
    }

    public long translateTimestamp(long j) {
        checkNativeAlignerExists();
        return nativeTranslateTimestamp(this.nativeTimestampAligner, j);
    }
}
