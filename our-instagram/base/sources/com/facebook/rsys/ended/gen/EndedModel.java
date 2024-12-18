package com.facebook.rsys.ended.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class EndedModel {
    public static C2N9 CONVERTER = YAN.A00(44);
    public static long sMcfTypeId;
    public final boolean canTryAgain;
    public final UnsupportedCapabilityFallbacks fallbacks;
    public final int postCallViewType;
    public final int reason;
    public final boolean remoteEnded;
    public final boolean shouldInformPeer;
    public final boolean shouldTriggerVoicemail;
    public final String subReason;
    public final VideoQuality videoQuality;
    public final boolean wasConnected;

    public static native EndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EndedModel)) {
                return false;
            }
            EndedModel endedModel = (EndedModel) obj;
            if (this.reason == endedModel.reason && this.subReason.equals(endedModel.subReason) && this.wasConnected == endedModel.wasConnected && this.postCallViewType == endedModel.postCallViewType && this.canTryAgain == endedModel.canTryAgain && this.remoteEnded == endedModel.remoteEnded && this.shouldInformPeer == endedModel.shouldInformPeer && this.shouldTriggerVoicemail == endedModel.shouldTriggerVoicemail) {
                UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks = this.fallbacks;
                UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks2 = endedModel.fallbacks;
                if (unsupportedCapabilityFallbacks == null) {
                    if (unsupportedCapabilityFallbacks2 != null) {
                        return false;
                    }
                } else if (!unsupportedCapabilityFallbacks.equals(unsupportedCapabilityFallbacks2)) {
                    return false;
                }
                VideoQuality videoQuality = this.videoQuality;
                VideoQuality videoQuality2 = endedModel.videoQuality;
                if (videoQuality != null) {
                    if (!videoQuality.equals(videoQuality2)) {
                        return false;
                    }
                } else if (videoQuality2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AbstractC166997dE.A0K(this.subReason, JQ0.A01(this.reason)) + (this.wasConnected ? 1 : 0)) * 31) + this.postCallViewType) * 31) + (this.canTryAgain ? 1 : 0)) * 31) + (this.remoteEnded ? 1 : 0)) * 31) + (this.shouldInformPeer ? 1 : 0)) * 31) + (this.shouldTriggerVoicemail ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.fallbacks)) * 31) + AbstractC166997dE.A0I(this.videoQuality);
    }

    public EndedModel(int i, String str, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, UnsupportedCapabilityFallbacks unsupportedCapabilityFallbacks, VideoQuality videoQuality) {
        str.getClass();
        this.reason = i;
        this.subReason = str;
        this.wasConnected = z;
        this.postCallViewType = i2;
        this.canTryAgain = z2;
        this.remoteEnded = z3;
        this.shouldInformPeer = z4;
        this.shouldTriggerVoicemail = z5;
        this.fallbacks = unsupportedCapabilityFallbacks;
        this.videoQuality = videoQuality;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EndedModel{reason=");
        A1C.append(this.reason);
        A1C.append(",subReason=");
        A1C.append(this.subReason);
        A1C.append(MSV.A00(655));
        A1C.append(this.wasConnected);
        A1C.append(",postCallViewType=");
        A1C.append(this.postCallViewType);
        A1C.append(",canTryAgain=");
        A1C.append(this.canTryAgain);
        A1C.append(",remoteEnded=");
        A1C.append(this.remoteEnded);
        A1C.append(",shouldInformPeer=");
        A1C.append(this.shouldInformPeer);
        A1C.append(",shouldTriggerVoicemail=");
        A1C.append(this.shouldTriggerVoicemail);
        A1C.append(",fallbacks=");
        A1C.append(this.fallbacks);
        A1C.append(",videoQuality=");
        return JQ0.A0l(this.videoQuality, A1C);
    }
}
