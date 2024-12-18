package com.facebook.rsys.grid.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class GridDisplayEligibleStates {
    public static C2N9 CONVERTER = new LSW(5);
    public static long sMcfTypeId;
    public final boolean isConnectedEligible;
    public final boolean isConnectingEligible;

    public static native GridDisplayEligibleStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridDisplayEligibleStates)) {
            return false;
        }
        GridDisplayEligibleStates gridDisplayEligibleStates = (GridDisplayEligibleStates) obj;
        return this.isConnectingEligible == gridDisplayEligibleStates.isConnectingEligible && this.isConnectedEligible == gridDisplayEligibleStates.isConnectedEligible;
    }

    public int hashCode() {
        return JQ0.A01(this.isConnectingEligible ? 1 : 0) + (this.isConnectedEligible ? 1 : 0);
    }

    public GridDisplayEligibleStates(boolean z, boolean z2) {
        this.isConnectingEligible = z;
        this.isConnectedEligible = z2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridDisplayEligibleStates{isConnectingEligible=");
        A1C.append(this.isConnectingEligible);
        A1C.append(",isConnectedEligible=");
        A1C.append(this.isConnectedEligible);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
