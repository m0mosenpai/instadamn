package org.webrtc;

/* loaded from: classes12.dex */
public class AudioTrack extends MediaStreamTrack {
    public static native void nativeSetVolume(long j, double d);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeMediaStreamTrack(), d);
    }

    public AudioTrack(long j) {
        super(j);
    }
}
