package com.facebook.rsys.appstate.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class AppstateModel {
    public static C2N9 CONVERTER = YAN.A00(1);
    public static long sMcfTypeId;
    public final boolean isBackgrounded;
    public final boolean isPictureInPicture;
    public final boolean isScreenOff;

    public static native AppstateModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppstateModel)) {
            return false;
        }
        AppstateModel appstateModel = (AppstateModel) obj;
        return this.isBackgrounded == appstateModel.isBackgrounded && this.isPictureInPicture == appstateModel.isPictureInPicture && this.isScreenOff == appstateModel.isScreenOff;
    }

    public int hashCode() {
        return ((JQ0.A01(this.isBackgrounded ? 1 : 0) + (this.isPictureInPicture ? 1 : 0)) * 31) + (this.isScreenOff ? 1 : 0);
    }

    public AppstateModel(boolean z, boolean z2, boolean z3) {
        this.isBackgrounded = z;
        this.isPictureInPicture = z2;
        this.isScreenOff = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AppstateModel{isBackgrounded=");
        A1C.append(this.isBackgrounded);
        A1C.append(",isPictureInPicture=");
        A1C.append(this.isPictureInPicture);
        A1C.append(",isScreenOff=");
        return AbstractC50523MSb.A0X(A1C, this.isScreenOff);
    }
}
