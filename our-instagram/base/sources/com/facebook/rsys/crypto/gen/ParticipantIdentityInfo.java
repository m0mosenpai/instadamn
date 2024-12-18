package com.facebook.rsys.crypto.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class ParticipantIdentityInfo {
    public static C2N9 CONVERTER = C55648OnZ.A00(26);
    public static long sMcfTypeId;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public static native ParticipantIdentityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantIdentityInfo)) {
            return false;
        }
        ParticipantIdentityInfo participantIdentityInfo = (ParticipantIdentityInfo) obj;
        return this.participantId.equals(participantIdentityInfo.participantId) && Arrays.equals(this.publicIdentityKey, participantIdentityInfo.publicIdentityKey);
    }

    public int hashCode() {
        return AbstractC50523MSb.A02(this.participantId) + Arrays.hashCode(this.publicIdentityKey);
    }

    public ParticipantIdentityInfo(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParticipantIdentityInfo{participantId=");
        A1C.append(this.participantId);
        A1C.append(",publicIdentityKey=");
        return JQ0.A0l(this.publicIdentityKey, A1C);
    }
}
