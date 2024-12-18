package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class VideoEffectCommunicationEffectMatchMessage {
    public final long activeCallLayoutEffectId;
    public final boolean readyToStartCallLayout;
    public final VideoEffectCommunicationSharedEffectInfo sharedEffectInfo;
    public final boolean shouldClearSharedEffectInfo;
    public final Map userIdToActiveEffectStatus;
    public final Map userIdToEffectId;

    public static native VideoEffectCommunicationEffectMatchMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationEffectMatchMessage)) {
                return false;
            }
            VideoEffectCommunicationEffectMatchMessage videoEffectCommunicationEffectMatchMessage = (VideoEffectCommunicationEffectMatchMessage) obj;
            Map map = this.userIdToEffectId;
            Map map2 = videoEffectCommunicationEffectMatchMessage.userIdToEffectId;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = this.sharedEffectInfo;
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo2 = videoEffectCommunicationEffectMatchMessage.sharedEffectInfo;
            if (videoEffectCommunicationSharedEffectInfo == null) {
                if (videoEffectCommunicationSharedEffectInfo2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationSharedEffectInfo.equals(videoEffectCommunicationSharedEffectInfo2)) {
                return false;
            }
            if (this.activeCallLayoutEffectId != videoEffectCommunicationEffectMatchMessage.activeCallLayoutEffectId || this.readyToStartCallLayout != videoEffectCommunicationEffectMatchMessage.readyToStartCallLayout || this.shouldClearSharedEffectInfo != videoEffectCommunicationEffectMatchMessage.shouldClearSharedEffectInfo) {
                return false;
            }
            Map map3 = this.userIdToActiveEffectStatus;
            Map map4 = videoEffectCommunicationEffectMatchMessage.userIdToActiveEffectStatus;
            if (map3 != null) {
                if (!map3.equals(map4)) {
                    return false;
                }
            } else if (map4 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Map map = this.userIdToEffectId;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int A01 = (((AbstractC25236BEt.A01(this.activeCallLayoutEffectId, (JQ0.A01(hashCode) + AbstractC167017dG.A0M(this.sharedEffectInfo)) * 31) + (this.readyToStartCallLayout ? 1 : 0)) * 31) + (this.shouldClearSharedEffectInfo ? 1 : 0)) * 31;
        Map map2 = this.userIdToActiveEffectStatus;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return A01 + i;
    }

    public VideoEffectCommunicationEffectMatchMessage(Map map, VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, long j, boolean z, boolean z2, Map map2) {
        this.userIdToEffectId = map;
        this.sharedEffectInfo = videoEffectCommunicationSharedEffectInfo;
        this.activeCallLayoutEffectId = j;
        this.readyToStartCallLayout = z;
        this.shouldClearSharedEffectInfo = z2;
        this.userIdToActiveEffectStatus = map2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationEffectMatchMessage{userIdToEffectId=");
        A1C.append(this.userIdToEffectId);
        A1C.append(",sharedEffectInfo=");
        A1C.append(this.sharedEffectInfo);
        A1C.append(",activeCallLayoutEffectId=");
        A1C.append(this.activeCallLayoutEffectId);
        A1C.append(",readyToStartCallLayout=");
        A1C.append(this.readyToStartCallLayout);
        A1C.append(",shouldClearSharedEffectInfo=");
        A1C.append(this.shouldClearSharedEffectInfo);
        A1C.append(",userIdToActiveEffectStatus=");
        return JQ0.A0l(this.userIdToActiveEffectStatus, A1C);
    }
}
