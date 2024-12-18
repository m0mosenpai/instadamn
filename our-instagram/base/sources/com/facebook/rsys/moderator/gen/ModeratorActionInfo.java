package com.facebook.rsys.moderator.gen;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class ModeratorActionInfo {
    public static C2N9 CONVERTER = C55648OnZ.A00(56);
    public static long sMcfTypeId;
    public final String issuedByUserId;
    public final String uuid;

    public static native ModeratorActionInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeratorActionInfo)) {
            return false;
        }
        ModeratorActionInfo moderatorActionInfo = (ModeratorActionInfo) obj;
        return this.uuid.equals(moderatorActionInfo.uuid) && this.issuedByUserId.equals(moderatorActionInfo.issuedByUserId);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.issuedByUserId, AbstractC50523MSb.A02(this.uuid));
    }

    public String toString() {
        return AnonymousClass001.A11("ModeratorActionInfo{uuid=", this.uuid, ",issuedByUserId=", this.issuedByUserId, "}");
    }

    public ModeratorActionInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.uuid = str;
        this.issuedByUserId = str2;
    }
}
