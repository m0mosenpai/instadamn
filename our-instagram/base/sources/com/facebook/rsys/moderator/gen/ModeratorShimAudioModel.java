package com.facebook.rsys.moderator.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class ModeratorShimAudioModel {
    public static C2N9 CONVERTER = YAM.A00(11);
    public static long sMcfTypeId;
    public final String actionUuid;
    public final boolean audioOn;

    public static native ModeratorShimAudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeratorShimAudioModel)) {
            return false;
        }
        ModeratorShimAudioModel moderatorShimAudioModel = (ModeratorShimAudioModel) obj;
        return this.actionUuid.equals(moderatorShimAudioModel.actionUuid) && this.audioOn == moderatorShimAudioModel.audioOn;
    }

    public int hashCode() {
        return AbstractC50523MSb.A02(this.actionUuid) + (this.audioOn ? 1 : 0);
    }

    public ModeratorShimAudioModel(String str, boolean z) {
        str.getClass();
        this.actionUuid = str;
        this.audioOn = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModeratorShimAudioModel{actionUuid=");
        A1C.append(this.actionUuid);
        A1C.append(",audioOn=");
        return AbstractC50523MSb.A0X(A1C, this.audioOn);
    }
}
