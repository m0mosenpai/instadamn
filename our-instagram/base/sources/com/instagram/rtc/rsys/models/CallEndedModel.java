package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class CallEndedModel {
    public static C2N9 CONVERTER = new C55647OnY(7);
    public static long sMcfTypeId;
    public final boolean endedRemotely;
    public final int reason;
    public final boolean wasConnected;

    public static native CallEndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallEndedModel)) {
            return false;
        }
        CallEndedModel callEndedModel = (CallEndedModel) obj;
        return this.reason == callEndedModel.reason && this.endedRemotely == callEndedModel.endedRemotely && this.wasConnected == callEndedModel.wasConnected;
    }

    public int hashCode() {
        return ((JQ0.A01(this.reason) + (this.endedRemotely ? 1 : 0)) * 31) + (this.wasConnected ? 1 : 0);
    }

    public CallEndedModel(int i, boolean z, boolean z2) {
        this.reason = i;
        this.endedRemotely = z;
        this.wasConnected = z2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallEndedModel{reason=");
        A1C.append(this.reason);
        A1C.append(",endedRemotely=");
        A1C.append(this.endedRemotely);
        A1C.append(",wasConnected=");
        return AbstractC50523MSb.A0X(A1C, this.wasConnected);
    }
}
