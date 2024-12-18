package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25227BEk;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class VideoEffectCommunicationEffectSyncMessage {
    public final int action;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String senderId;
    public final Map userIdToEffectId;

    public static native VideoEffectCommunicationEffectSyncMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationEffectSyncMessage)) {
                return false;
            }
            VideoEffectCommunicationEffectSyncMessage videoEffectCommunicationEffectSyncMessage = (VideoEffectCommunicationEffectSyncMessage) obj;
            if (this.effectInfo.equals(videoEffectCommunicationEffectSyncMessage.effectInfo) && this.action == videoEffectCommunicationEffectSyncMessage.action) {
                Map map = this.userIdToEffectId;
                Map map2 = videoEffectCommunicationEffectSyncMessage.userIdToEffectId;
                if (map == null) {
                    if (map2 != null) {
                        return false;
                    }
                } else if (!map.equals(map2)) {
                    return false;
                }
                String str = this.senderId;
                String str2 = videoEffectCommunicationEffectSyncMessage.senderId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int A01 = (JQ0.A01(this.effectInfo.hashCode()) + this.action) * 31;
        Map map = this.userIdToEffectId;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return ((A01 + hashCode) * 31) + AbstractC25227BEk.A07(this.senderId);
    }

    public VideoEffectCommunicationEffectSyncMessage(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, int i, Map map, String str) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.action = i;
        this.userIdToEffectId = map;
        this.senderId = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationEffectSyncMessage{effectInfo=");
        A1C.append(this.effectInfo);
        A1C.append(",action=");
        A1C.append(this.action);
        A1C.append(",userIdToEffectId=");
        A1C.append(this.userIdToEffectId);
        A1C.append(",senderId=");
        A1C.append(this.senderId);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
