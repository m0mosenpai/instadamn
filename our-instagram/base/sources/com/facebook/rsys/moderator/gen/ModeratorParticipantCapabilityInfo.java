package com.facebook.rsys.moderator.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class ModeratorParticipantCapabilityInfo {
    public static C2N9 CONVERTER = C55648OnZ.A00(57);
    public static long sMcfTypeId;
    public final boolean actionCapabilitiesAsModerator;
    public final boolean actionCapabilitiesAsParticipant;
    public final boolean isModerator;

    public static native ModeratorParticipantCapabilityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeratorParticipantCapabilityInfo)) {
            return false;
        }
        ModeratorParticipantCapabilityInfo moderatorParticipantCapabilityInfo = (ModeratorParticipantCapabilityInfo) obj;
        return this.isModerator == moderatorParticipantCapabilityInfo.isModerator && this.actionCapabilitiesAsModerator == moderatorParticipantCapabilityInfo.actionCapabilitiesAsModerator && this.actionCapabilitiesAsParticipant == moderatorParticipantCapabilityInfo.actionCapabilitiesAsParticipant;
    }

    public int hashCode() {
        return ((JQ0.A01(this.isModerator ? 1 : 0) + (this.actionCapabilitiesAsModerator ? 1 : 0)) * 31) + (this.actionCapabilitiesAsParticipant ? 1 : 0);
    }

    public ModeratorParticipantCapabilityInfo(boolean z, boolean z2, boolean z3) {
        this.isModerator = z;
        this.actionCapabilitiesAsModerator = z2;
        this.actionCapabilitiesAsParticipant = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModeratorParticipantCapabilityInfo{isModerator=");
        A1C.append(this.isModerator);
        A1C.append(",actionCapabilitiesAsModerator=");
        A1C.append(this.actionCapabilitiesAsModerator);
        A1C.append(",actionCapabilitiesAsParticipant=");
        return AbstractC50523MSb.A0X(A1C, this.actionCapabilitiesAsParticipant);
    }
}
