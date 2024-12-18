package com.facebook.rsys.grid.gen;

import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class GridGroupOptions {
    public static C2N9 CONVERTER = YAN.A00(54);
    public static long sMcfTypeId;
    public final String representativeParticipantId;

    public static native GridGroupOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridGroupOptions)) {
                return false;
            }
            String str = this.representativeParticipantId;
            String str2 = ((GridGroupOptions) obj).representativeParticipantId;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC167017dG.A0O(this.representativeParticipantId);
    }

    public String toString() {
        return AnonymousClass001.A0g("GridGroupOptions{representativeParticipantId=", this.representativeParticipantId, "}");
    }

    public GridGroupOptions(String str) {
        this.representativeParticipantId = str;
    }
}
