package org.webrtc;

import X.AbstractC166987dD;

/* loaded from: classes12.dex */
public class MediaSource {
    public long nativeSource;

    public static native State nativeGetState(long j);

    /* loaded from: classes12.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource != 0) {
        } else {
            throw AbstractC166987dD.A14("MediaSource has been disposed.");
        }
    }

    public MediaSource(long j) {
        this.nativeSource = j;
    }

    public void dispose() {
        checkMediaSourceExists();
        JniCommon.nativeReleaseRef(this.nativeSource);
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
