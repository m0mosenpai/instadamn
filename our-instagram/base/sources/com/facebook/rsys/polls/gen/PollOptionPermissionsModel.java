package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class PollOptionPermissionsModel {
    public static C2N9 CONVERTER = new LSW(12);
    public static long sMcfTypeId;
    public final boolean canRemoveVote;
    public final boolean canVote;

    public static native PollOptionPermissionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOptionPermissionsModel)) {
            return false;
        }
        PollOptionPermissionsModel pollOptionPermissionsModel = (PollOptionPermissionsModel) obj;
        return this.canVote == pollOptionPermissionsModel.canVote && this.canRemoveVote == pollOptionPermissionsModel.canRemoveVote;
    }

    public int hashCode() {
        return JQ0.A01(this.canVote ? 1 : 0) + (this.canRemoveVote ? 1 : 0);
    }

    public PollOptionPermissionsModel(boolean z, boolean z2) {
        this.canVote = z;
        this.canRemoveVote = z2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollOptionPermissionsModel{canVote=");
        A1C.append(this.canVote);
        A1C.append(",canRemoveVote=");
        A1C.append(this.canRemoveVote);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
