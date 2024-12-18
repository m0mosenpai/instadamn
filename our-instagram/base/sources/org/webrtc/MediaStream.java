package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class MediaStream {
    public static final String TAG = "MediaStream";
    public long nativeStream;
    public final List audioTracks = AbstractC166987dD.A1E();
    public final List videoTracks = AbstractC166987dD.A1E();
    public final List preservedVideoTracks = AbstractC166987dD.A1E();

    public static native boolean nativeAddAudioTrackToNativeStream(long j, long j2);

    public static native boolean nativeAddVideoTrackToNativeStream(long j, long j2);

    public static native String nativeGetId(long j);

    public static native boolean nativeRemoveAudioTrack(long j, long j2);

    public static native boolean nativeRemoveVideoTrack(long j, long j2);

    private void checkMediaStreamExists() {
        if (this.nativeStream != 0) {
        } else {
            throw AbstractC166987dD.A14("MediaStream has been disposed.");
        }
    }

    public void addNativeAudioTrack(long j) {
        this.audioTracks.add(new MediaStreamTrack(j));
    }

    public void addNativeVideoTrack(long j) {
        this.videoTracks.add(new VideoTrack(j));
    }

    public void removeAudioTrack(long j) {
        removeMediaStreamTrack(this.audioTracks, j);
    }

    public void removeVideoTrack(long j) {
        removeMediaStreamTrack(this.videoTracks, j);
    }

    public MediaStream(long j) {
        this.nativeStream = j;
    }

    public static void removeMediaStreamTrack(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) it.next();
            if (mediaStreamTrack.getNativeMediaStreamTrack() == j) {
                mediaStreamTrack.dispose();
                it.remove();
                return;
            }
        }
        boolean z = Logging.loggingEnabled;
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeMediaStreamTrack())) {
            this.preservedVideoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeMediaStreamTrack())) {
            this.audioTracks.add(audioTrack);
            return true;
        }
        return false;
    }

    public void dispose() {
        checkMediaStreamExists();
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = (AudioTrack) this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = (VideoTrack) this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack((VideoTrack) this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0L;
    }

    public String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeMediaStreamTrack());
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[");
        A1C.append(getId());
        A1C.append(":A=");
        A1C.append(this.audioTracks.size());
        A1C.append(":V=");
        A1C.append(this.videoTracks.size());
        return AbstractC58319PtB.A0w(A1C);
    }

    public boolean addTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeMediaStreamTrack())) {
            this.videoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeMediaStreamTrack());
    }
}
