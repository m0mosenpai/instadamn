package com.facebook.rsys.moderator.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class ModeratorClientModel {
    public static C2N9 CONVERTER = YAM.A00(10);
    public static long sMcfTypeId;
    public final boolean isInitialized;
    public final boolean isModerator;
    public final boolean screenShareEnabled;
    public final String screenShareEnabledActorId;

    public static native ModeratorClientModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorClientModel)) {
                return false;
            }
            ModeratorClientModel moderatorClientModel = (ModeratorClientModel) obj;
            if (this.screenShareEnabled == moderatorClientModel.screenShareEnabled) {
                String str = this.screenShareEnabledActorId;
                String str2 = moderatorClientModel.screenShareEnabledActorId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                if (this.isModerator != moderatorClientModel.isModerator || this.isInitialized != moderatorClientModel.isInitialized) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((JQ0.A01(this.screenShareEnabled ? 1 : 0) + AbstractC167017dG.A0O(this.screenShareEnabledActorId)) * 31) + (this.isModerator ? 1 : 0)) * 31) + (this.isInitialized ? 1 : 0);
    }

    public ModeratorClientModel(boolean z, String str, boolean z2, boolean z3) {
        this.screenShareEnabled = z;
        this.screenShareEnabledActorId = str;
        this.isModerator = z2;
        this.isInitialized = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModeratorClientModel{screenShareEnabled=");
        A1C.append(this.screenShareEnabled);
        A1C.append(",screenShareEnabledActorId=");
        A1C.append(this.screenShareEnabledActorId);
        A1C.append(",isModerator=");
        A1C.append(this.isModerator);
        A1C.append(",isInitialized=");
        return AbstractC50523MSb.A0X(A1C, this.isInitialized);
    }
}
