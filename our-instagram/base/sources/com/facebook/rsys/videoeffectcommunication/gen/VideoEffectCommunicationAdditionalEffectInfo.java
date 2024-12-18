package com.facebook.rsys.videoeffectcommunication.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class VideoEffectCommunicationAdditionalEffectInfo {
    public static C2N9 CONVERTER = new YAL(7);
    public static long sMcfTypeId;
    public final int notificationType;

    public static native VideoEffectCommunicationAdditionalEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof VideoEffectCommunicationAdditionalEffectInfo) && this.notificationType == ((VideoEffectCommunicationAdditionalEffectInfo) obj).notificationType;
        }
        return true;
    }

    public int hashCode() {
        return 527 + this.notificationType;
    }

    public String toString() {
        return AnonymousClass001.A0c("VideoEffectCommunicationAdditionalEffectInfo{notificationType=", "}", this.notificationType);
    }

    public VideoEffectCommunicationAdditionalEffectInfo(int i) {
        this.notificationType = i;
    }
}
