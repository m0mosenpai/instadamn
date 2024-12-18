package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class VideoEffectCommunicationSharedEffectInfo {
    public static C2N9 CONVERTER = new C55647OnY(3);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationAdditionalEffectInfo additionalInfo;
    public final boolean applyOnJoin;
    public final String cryptoHash;
    public final long effectId;
    public final String effectName;
    public final String effectThumbnailUri;
    public final int effectType;
    public final String initiatorId;
    public final String initiatorName;
    public final boolean synchronizedStart;
    public final boolean synchronizedStop;

    public static native VideoEffectCommunicationSharedEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationSharedEffectInfo)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = (VideoEffectCommunicationSharedEffectInfo) obj;
            if (this.effectId == videoEffectCommunicationSharedEffectInfo.effectId) {
                String str = this.effectName;
                String str2 = videoEffectCommunicationSharedEffectInfo.effectName;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.effectThumbnailUri;
                String str4 = videoEffectCommunicationSharedEffectInfo.effectThumbnailUri;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.initiatorId;
                String str6 = videoEffectCommunicationSharedEffectInfo.initiatorId;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.initiatorName;
                String str8 = videoEffectCommunicationSharedEffectInfo.initiatorName;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                String str9 = this.cryptoHash;
                String str10 = videoEffectCommunicationSharedEffectInfo.cryptoHash;
                if (str9 == null) {
                    if (str10 != null) {
                        return false;
                    }
                } else if (!str9.equals(str10)) {
                    return false;
                }
                if (this.synchronizedStart != videoEffectCommunicationSharedEffectInfo.synchronizedStart || this.synchronizedStop != videoEffectCommunicationSharedEffectInfo.synchronizedStop || this.applyOnJoin != videoEffectCommunicationSharedEffectInfo.applyOnJoin || this.effectType != videoEffectCommunicationSharedEffectInfo.effectType) {
                    return false;
                }
                VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo = this.additionalInfo;
                VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo2 = videoEffectCommunicationSharedEffectInfo.additionalInfo;
                if (videoEffectCommunicationAdditionalEffectInfo != null) {
                    if (!videoEffectCommunicationAdditionalEffectInfo.equals(videoEffectCommunicationAdditionalEffectInfo2)) {
                        return false;
                    }
                } else if (videoEffectCommunicationAdditionalEffectInfo2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((JQ0.A01(AbstractC25228BEl.A03(this.effectId)) + AbstractC167017dG.A0O(this.effectName)) * 31) + AbstractC167017dG.A0O(this.effectThumbnailUri)) * 31) + AbstractC167017dG.A0O(this.initiatorId)) * 31) + AbstractC167017dG.A0O(this.initiatorName)) * 31) + AbstractC167017dG.A0O(this.cryptoHash)) * 31) + (this.synchronizedStart ? 1 : 0)) * 31) + (this.synchronizedStop ? 1 : 0)) * 31) + (this.applyOnJoin ? 1 : 0)) * 31) + this.effectType) * 31) + AbstractC166997dE.A0I(this.additionalInfo);
    }

    public VideoEffectCommunicationSharedEffectInfo(long j, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i, VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo) {
        this.effectId = j;
        this.effectName = str;
        this.effectThumbnailUri = str2;
        this.initiatorId = str3;
        this.initiatorName = str4;
        this.cryptoHash = str5;
        this.synchronizedStart = z;
        this.synchronizedStop = z2;
        this.applyOnJoin = z3;
        this.effectType = i;
        this.additionalInfo = videoEffectCommunicationAdditionalEffectInfo;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationSharedEffectInfo{effectId=");
        A1C.append(this.effectId);
        A1C.append(",effectName=");
        A1C.append(this.effectName);
        A1C.append(",effectThumbnailUri=");
        A1C.append(this.effectThumbnailUri);
        A1C.append(",initiatorId=");
        A1C.append(this.initiatorId);
        A1C.append(",initiatorName=");
        A1C.append(this.initiatorName);
        A1C.append(",cryptoHash=");
        A1C.append(this.cryptoHash);
        A1C.append(",synchronizedStart=");
        A1C.append(this.synchronizedStart);
        A1C.append(",synchronizedStop=");
        A1C.append(this.synchronizedStop);
        A1C.append(",applyOnJoin=");
        A1C.append(this.applyOnJoin);
        A1C.append(",effectType=");
        A1C.append(this.effectType);
        A1C.append(",additionalInfo=");
        return JQ0.A0l(this.additionalInfo, A1C);
    }
}
