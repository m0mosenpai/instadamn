package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class VideoEffectCommunicationCallLayoutRemovingState {
    public static C2N9 CONVERTER = new LSW(20);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String notificationId;

    public static native VideoEffectCommunicationCallLayoutRemovingState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationCallLayoutRemovingState)) {
            return false;
        }
        VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState = (VideoEffectCommunicationCallLayoutRemovingState) obj;
        return this.effectInfo.equals(videoEffectCommunicationCallLayoutRemovingState.effectInfo) && this.notificationId.equals(videoEffectCommunicationCallLayoutRemovingState.notificationId);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.notificationId, JQ0.A01(this.effectInfo.hashCode()));
    }

    public VideoEffectCommunicationCallLayoutRemovingState(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        str.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.notificationId = str;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationCallLayoutRemovingState{effectInfo=");
        A1C.append(this.effectInfo);
        A1C.append(",notificationId=");
        A1C.append(this.notificationId);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
