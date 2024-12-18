package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomCapabilityModel {
    public static C2N9 CONVERTER = YAM.A00(44);
    public static long sMcfTypeId;
    public final boolean isAutoJoinDisabled;
    public final boolean isIncallAudienceExpansionEnabled;

    public static native RoomCapabilityModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomCapabilityModel)) {
            return false;
        }
        RoomCapabilityModel roomCapabilityModel = (RoomCapabilityModel) obj;
        return this.isIncallAudienceExpansionEnabled == roomCapabilityModel.isIncallAudienceExpansionEnabled && this.isAutoJoinDisabled == roomCapabilityModel.isAutoJoinDisabled;
    }

    public int hashCode() {
        return JQ0.A01(this.isIncallAudienceExpansionEnabled ? 1 : 0) + (this.isAutoJoinDisabled ? 1 : 0);
    }

    public RoomCapabilityModel(boolean z, boolean z2) {
        this.isIncallAudienceExpansionEnabled = z;
        this.isAutoJoinDisabled = z2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomCapabilityModel{isIncallAudienceExpansionEnabled=");
        A1C.append(this.isIncallAudienceExpansionEnabled);
        A1C.append(",isAutoJoinDisabled=");
        return AbstractC50523MSb.A0X(A1C, this.isAutoJoinDisabled);
    }
}
