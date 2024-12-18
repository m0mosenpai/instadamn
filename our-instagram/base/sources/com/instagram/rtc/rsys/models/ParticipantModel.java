package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class ParticipantModel {
    public static C2N9 CONVERTER = new C55647OnY(11);
    public static long sMcfTypeId;
    public final boolean audioEnabled;
    public final boolean hasVoiceActivity;
    public final String rendererId;
    public final int state;
    public final String userId;
    public final boolean videoEnabled;
    public final boolean videoStalled;

    public static native ParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantModel)) {
            return false;
        }
        ParticipantModel participantModel = (ParticipantModel) obj;
        return this.userId.equals(participantModel.userId) && this.rendererId.equals(participantModel.rendererId) && this.state == participantModel.state && this.audioEnabled == participantModel.audioEnabled && this.videoEnabled == participantModel.videoEnabled && this.videoStalled == participantModel.videoStalled && this.hasVoiceActivity == participantModel.hasVoiceActivity;
    }

    public int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.rendererId, AbstractC50523MSb.A02(this.userId)) + this.state) * 31) + (this.audioEnabled ? 1 : 0)) * 31) + (this.videoEnabled ? 1 : 0)) * 31) + (this.videoStalled ? 1 : 0)) * 31) + (this.hasVoiceActivity ? 1 : 0);
    }

    public ParticipantModel(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        this.userId = str;
        this.rendererId = str2;
        this.state = i;
        this.audioEnabled = z;
        this.videoEnabled = z2;
        this.videoStalled = z3;
        this.hasVoiceActivity = z4;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParticipantModel{userId=");
        A1C.append(this.userId);
        A1C.append(",rendererId=");
        A1C.append(this.rendererId);
        A1C.append(",state=");
        A1C.append(this.state);
        A1C.append(",audioEnabled=");
        A1C.append(this.audioEnabled);
        A1C.append(",videoEnabled=");
        A1C.append(this.videoEnabled);
        A1C.append(",videoStalled=");
        A1C.append(this.videoStalled);
        A1C.append(",hasVoiceActivity=");
        return AbstractC50523MSb.A0X(A1C, this.hasVoiceActivity);
    }
}
