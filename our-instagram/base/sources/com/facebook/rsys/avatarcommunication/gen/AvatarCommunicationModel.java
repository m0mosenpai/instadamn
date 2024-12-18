package com.facebook.rsys.avatarcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class AvatarCommunicationModel {
    public static C2N9 CONVERTER = YAN.A00(14);
    public static long sMcfTypeId;
    public final int avatarsLoadState;
    public final boolean avatarsUsedInCall;
    public final boolean codecAvatarStreamed;
    public final boolean eligibleForAvatarPostCallMimicryUpsell;
    public final boolean usingAvatars;

    public static native AvatarCommunicationModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarCommunicationModel)) {
            return false;
        }
        AvatarCommunicationModel avatarCommunicationModel = (AvatarCommunicationModel) obj;
        return this.avatarsUsedInCall == avatarCommunicationModel.avatarsUsedInCall && this.usingAvatars == avatarCommunicationModel.usingAvatars && this.avatarsLoadState == avatarCommunicationModel.avatarsLoadState && this.eligibleForAvatarPostCallMimicryUpsell == avatarCommunicationModel.eligibleForAvatarPostCallMimicryUpsell && this.codecAvatarStreamed == avatarCommunicationModel.codecAvatarStreamed;
    }

    public int hashCode() {
        return ((((((JQ0.A01(this.avatarsUsedInCall ? 1 : 0) + (this.usingAvatars ? 1 : 0)) * 31) + this.avatarsLoadState) * 31) + (this.eligibleForAvatarPostCallMimicryUpsell ? 1 : 0)) * 31) + (this.codecAvatarStreamed ? 1 : 0);
    }

    public AvatarCommunicationModel(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.avatarsUsedInCall = z;
        this.usingAvatars = z2;
        this.avatarsLoadState = i;
        this.eligibleForAvatarPostCallMimicryUpsell = z3;
        this.codecAvatarStreamed = z4;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AvatarCommunicationModel{avatarsUsedInCall=");
        A1C.append(this.avatarsUsedInCall);
        A1C.append(",usingAvatars=");
        A1C.append(this.usingAvatars);
        A1C.append(",avatarsLoadState=");
        A1C.append(this.avatarsLoadState);
        A1C.append(",eligibleForAvatarPostCallMimicryUpsell=");
        A1C.append(this.eligibleForAvatarPostCallMimicryUpsell);
        A1C.append(",codecAvatarStreamed=");
        return AbstractC50523MSb.A0X(A1C, this.codecAvatarStreamed);
    }
}
