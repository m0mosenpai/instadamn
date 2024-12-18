package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC25230BEn;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes12.dex */
public class RtpTransceiver {
    public RtpReceiver cachedReceiver;
    public RtpSender cachedSender;
    public long nativeRtpTransceiver;

    /* loaded from: classes10.dex */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);

        public final int nativeIndex;

        public int getNativeIndex() {
            return this.nativeIndex;
        }

        RtpTransceiverDirection(int i) {
            this.nativeIndex = i;
        }

        public static RtpTransceiverDirection fromNativeIndex(int i) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            throw AbstractC25230BEn.A0n("Uknown native RtpTransceiverDirection type", i);
        }
    }

    /* loaded from: classes10.dex */
    public final class RtpTransceiverInit {
        public final RtpTransceiverDirection direction;
        public final List sendEncodings;
        public final List streamIds;

        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        public List getSendEncodings() {
            return AbstractC166987dD.A1F(this.sendEncodings);
        }

        public List getStreamIds() {
            return AbstractC166987dD.A1F(this.streamIds);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List list) {
            this(rtpTransceiverDirection, list, Collections.emptyList());
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List list, List list2) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = AbstractC166987dD.A1F(list);
            this.sendEncodings = AbstractC166987dD.A1F(list2);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, Collections.emptyList(), Collections.emptyList());
        }

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }
    }

    public static native RtpTransceiverDirection nativeCurrentDirection(long j);

    public static native RtpTransceiverDirection nativeDirection(long j);

    public static native MediaStreamTrack.MediaType nativeGetMediaType(long j);

    public static native String nativeGetMid(long j);

    public static native RtpReceiver nativeGetReceiver(long j);

    public static native RtpSender nativeGetSender(long j);

    public static native void nativeSetCodecPreferences(long j, List list);

    public static native boolean nativeSetDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

    public static native void nativeStopInternal(long j);

    public static native void nativeStopStandard(long j);

    public static native boolean nativeStopped(long j);

    private void checkRtpTransceiverExists() {
        if (this.nativeRtpTransceiver != 0) {
        } else {
            throw AbstractC166987dD.A14("RtpTransceiver has been disposed.");
        }
    }

    public RtpTransceiver(long j) {
        this.nativeRtpTransceiver = j;
        this.cachedSender = nativeGetSender(j);
        this.cachedReceiver = nativeGetReceiver(j);
    }

    public void dispose() {
        checkRtpTransceiverExists();
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
        this.nativeRtpTransceiver = 0L;
    }

    public RtpTransceiverDirection getCurrentDirection() {
        checkRtpTransceiverExists();
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getDirection() {
        checkRtpTransceiverExists();
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public MediaStreamTrack.MediaType getMediaType() {
        checkRtpTransceiverExists();
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public String getMid() {
        checkRtpTransceiverExists();
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        checkRtpTransceiverExists();
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public void setCodecPreferences(List list) {
        checkRtpTransceiverExists();
        nativeSetCodecPreferences(this.nativeRtpTransceiver, list);
    }

    public boolean setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        checkRtpTransceiverExists();
        return nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopInternal() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopStandard() {
        checkRtpTransceiverExists();
        nativeStopStandard(this.nativeRtpTransceiver);
    }
}
