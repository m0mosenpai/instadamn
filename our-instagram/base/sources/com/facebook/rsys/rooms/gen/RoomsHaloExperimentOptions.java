package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomsHaloExperimentOptions {
    public final boolean enableRoomsUiForGvcLink;
    public final boolean shouldEnableGVCLinkCallExperience;

    public static native RoomsHaloExperimentOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomsHaloExperimentOptions)) {
            return false;
        }
        RoomsHaloExperimentOptions roomsHaloExperimentOptions = (RoomsHaloExperimentOptions) obj;
        return this.enableRoomsUiForGvcLink == roomsHaloExperimentOptions.enableRoomsUiForGvcLink && this.shouldEnableGVCLinkCallExperience == roomsHaloExperimentOptions.shouldEnableGVCLinkCallExperience;
    }

    public final int hashCode() {
        return JQ0.A01(this.enableRoomsUiForGvcLink ? 1 : 0) + (this.shouldEnableGVCLinkCallExperience ? 1 : 0);
    }

    public RoomsHaloExperimentOptions(boolean z, boolean z2) {
        this.enableRoomsUiForGvcLink = z;
        this.shouldEnableGVCLinkCallExperience = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomsHaloExperimentOptions{enableRoomsUiForGvcLink=");
        A1C.append(this.enableRoomsUiForGvcLink);
        A1C.append(",shouldEnableGVCLinkCallExperience=");
        return AbstractC50523MSb.A0X(A1C, this.shouldEnableGVCLinkCallExperience);
    }
}
