package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class PollsFeaturePermissionsModel {
    public static C2N9 CONVERTER = new LSW(14);
    public static long sMcfTypeId;
    public final boolean canCreatePoll;
    public final boolean isCreationEnabled;

    public static native PollsFeaturePermissionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsFeaturePermissionsModel)) {
            return false;
        }
        PollsFeaturePermissionsModel pollsFeaturePermissionsModel = (PollsFeaturePermissionsModel) obj;
        return this.isCreationEnabled == pollsFeaturePermissionsModel.isCreationEnabled && this.canCreatePoll == pollsFeaturePermissionsModel.canCreatePoll;
    }

    public int hashCode() {
        return JQ0.A01(this.isCreationEnabled ? 1 : 0) + (this.canCreatePoll ? 1 : 0);
    }

    public PollsFeaturePermissionsModel(boolean z, boolean z2) {
        this.isCreationEnabled = z;
        this.canCreatePoll = z2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollsFeaturePermissionsModel{isCreationEnabled=");
        A1C.append(this.isCreationEnabled);
        A1C.append(",canCreatePoll=");
        A1C.append(this.canCreatePoll);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
