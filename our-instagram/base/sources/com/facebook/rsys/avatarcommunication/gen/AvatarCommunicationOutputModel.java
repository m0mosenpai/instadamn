package com.facebook.rsys.avatarcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class AvatarCommunicationOutputModel {
    public final boolean avatarsUsedInCall;
    public final boolean usedAvatars;
    public final String userId;

    public static native AvatarCommunicationOutputModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AvatarCommunicationOutputModel)) {
                return false;
            }
            AvatarCommunicationOutputModel avatarCommunicationOutputModel = (AvatarCommunicationOutputModel) obj;
            if (this.avatarsUsedInCall == avatarCommunicationOutputModel.avatarsUsedInCall && this.usedAvatars == avatarCommunicationOutputModel.usedAvatars) {
                String str = this.userId;
                String str2 = avatarCommunicationOutputModel.userId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((JQ0.A01(this.avatarsUsedInCall ? 1 : 0) + (this.usedAvatars ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.userId);
    }

    public AvatarCommunicationOutputModel(boolean z, boolean z2, String str) {
        this.avatarsUsedInCall = z;
        this.usedAvatars = z2;
        this.userId = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AvatarCommunicationOutputModel{avatarsUsedInCall=");
        A1C.append(this.avatarsUsedInCall);
        A1C.append(",usedAvatars=");
        A1C.append(this.usedAvatars);
        A1C.append(",userId=");
        return AbstractC50523MSb.A0W(this.userId, A1C);
    }
}
