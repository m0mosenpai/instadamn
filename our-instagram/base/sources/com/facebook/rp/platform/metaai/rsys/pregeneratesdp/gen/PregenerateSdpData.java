package com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen;

import X.JQ0;

/* loaded from: classes9.dex */
public final class PregenerateSdpData {
    public final String audioTrack;
    public final String sdpString;
    public final String signalingId;
    public final String transactionId;
    public final String videoTrack;

    public final String getAudioTrack() {
        return this.audioTrack;
    }

    public final String getSdpString() {
        return this.sdpString;
    }

    public final String getSignalingId() {
        return this.signalingId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getVideoTrack() {
        return this.videoTrack;
    }

    public PregenerateSdpData(String str, String str2, String str3, String str4, String str5) {
        JQ0.A1O(str, str2, str3, str4, str5);
        this.signalingId = str;
        this.transactionId = str2;
        this.sdpString = str3;
        this.audioTrack = str4;
        this.videoTrack = str5;
    }
}
