package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.MSX;
import X.MSY;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class VideoTrack extends MediaStreamTrack {
    public final IdentityHashMap sinks;

    public static native void nativeAddSink(long j, long j2);

    public static native void nativeFreeSink(long j);

    public static native void nativeRemoveSink(long j, long j2);

    public static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink != null) {
            if (!this.sinks.containsKey(videoSink)) {
                long nativeWrapSink = nativeWrapSink(videoSink);
                MSX.A1N(videoSink, this.sinks, nativeWrapSink);
                nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("The VideoSink is not allowed to be null");
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        Iterator A0k = AbstractC167007dF.A0k(this.sinks);
        while (A0k.hasNext()) {
            long A07 = MSY.A07(A0k);
            nativeRemoveSink(getNativeMediaStreamTrack(), A07);
            nativeFreeSink(A07);
        }
        this.sinks.clear();
        super.dispose();
    }

    public void removeSink(VideoSink videoSink) {
        Number number = (Number) this.sinks.remove(videoSink);
        if (number != null) {
            long nativeMediaStreamTrack = getNativeMediaStreamTrack();
            long longValue = number.longValue();
            nativeRemoveSink(nativeMediaStreamTrack, longValue);
            nativeFreeSink(longValue);
        }
    }

    public VideoTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }
}
