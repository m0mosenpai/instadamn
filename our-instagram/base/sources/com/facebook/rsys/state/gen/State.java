package com.facebook.rsys.state.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class State {
    public static C2N9 CONVERTER = C55648OnZ.A00(67);
    public static long sMcfTypeId;
    public final int callState;
    public final boolean isActive;
    public final String localCallId;
    public final String selfUserId;

    public static native State createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            if (this.selfUserId.equals(state.selfUserId)) {
                String str = this.localCallId;
                String str2 = state.localCallId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                if (this.callState != state.callState || this.isActive != state.isActive) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC50523MSb.A02(this.selfUserId) + AbstractC167017dG.A0O(this.localCallId)) * 31) + this.callState) * 31) + (this.isActive ? 1 : 0);
    }

    public State(String str, String str2, int i, boolean z) {
        str.getClass();
        this.selfUserId = str;
        this.localCallId = str2;
        this.callState = i;
        this.isActive = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("State{selfUserId=");
        A1C.append(this.selfUserId);
        A1C.append(",localCallId=");
        A1C.append(this.localCallId);
        A1C.append(",callState=");
        A1C.append(this.callState);
        A1C.append(",isActive=");
        return AbstractC50523MSb.A0X(A1C, this.isActive);
    }
}
