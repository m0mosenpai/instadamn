package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class VideoEffectCommunicationParticipant {
    public static C2N9 CONVERTER = new C55647OnY(2);
    public static long sMcfTypeId;
    public final boolean isActiveInCall;
    public final boolean isActiveInSameEffect;
    public final int loadStatus;
    public final String participantId;

    public static native VideoEffectCommunicationParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationParticipant)) {
            return false;
        }
        VideoEffectCommunicationParticipant videoEffectCommunicationParticipant = (VideoEffectCommunicationParticipant) obj;
        return this.participantId.equals(videoEffectCommunicationParticipant.participantId) && this.isActiveInCall == videoEffectCommunicationParticipant.isActiveInCall && this.isActiveInSameEffect == videoEffectCommunicationParticipant.isActiveInSameEffect && this.loadStatus == videoEffectCommunicationParticipant.loadStatus;
    }

    public int hashCode() {
        return ((((AbstractC50523MSb.A02(this.participantId) + (this.isActiveInCall ? 1 : 0)) * 31) + (this.isActiveInSameEffect ? 1 : 0)) * 31) + this.loadStatus;
    }

    public VideoEffectCommunicationParticipant(String str, boolean z, boolean z2, int i) {
        str.getClass();
        this.participantId = str;
        this.isActiveInCall = z;
        this.isActiveInSameEffect = z2;
        this.loadStatus = i;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationParticipant{participantId=");
        A1C.append(this.participantId);
        A1C.append(",isActiveInCall=");
        A1C.append(this.isActiveInCall);
        A1C.append(",isActiveInSameEffect=");
        A1C.append(this.isActiveInSameEffect);
        A1C.append(",loadStatus=");
        A1C.append(this.loadStatus);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
