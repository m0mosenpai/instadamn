package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class VideoEffectCommunicationGroupEffectSharingState {
    public static C2N9 CONVERTER = new LSW(21);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String notificationId;
    public final boolean useEffectMatch;

    public static native VideoEffectCommunicationGroupEffectSharingState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationGroupEffectSharingState)) {
            return false;
        }
        VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState = (VideoEffectCommunicationGroupEffectSharingState) obj;
        return this.effectInfo.equals(videoEffectCommunicationGroupEffectSharingState.effectInfo) && this.notificationId.equals(videoEffectCommunicationGroupEffectSharingState.notificationId) && this.useEffectMatch == videoEffectCommunicationGroupEffectSharingState.useEffectMatch;
    }

    public int hashCode() {
        return AbstractC166997dE.A0K(this.notificationId, JQ0.A01(this.effectInfo.hashCode())) + (this.useEffectMatch ? 1 : 0);
    }

    public VideoEffectCommunicationGroupEffectSharingState(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str, boolean z) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        str.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.notificationId = str;
        this.useEffectMatch = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationGroupEffectSharingState{effectInfo=");
        A1C.append(this.effectInfo);
        A1C.append(",notificationId=");
        A1C.append(this.notificationId);
        A1C.append(",useEffectMatch=");
        A1C.append(this.useEffectMatch);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
