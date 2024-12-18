package com.facebook.rsys.crypto.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class CryptoParticipantIdentity {
    public static C2N9 CONVERTER = C55648OnZ.A00(25);
    public static long sMcfTypeId;
    public final boolean isNewIdentityKey;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public static native CryptoParticipantIdentity createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoParticipantIdentity)) {
            return false;
        }
        CryptoParticipantIdentity cryptoParticipantIdentity = (CryptoParticipantIdentity) obj;
        return this.participantId.equals(cryptoParticipantIdentity.participantId) && Arrays.equals(this.publicIdentityKey, cryptoParticipantIdentity.publicIdentityKey) && this.isNewIdentityKey == cryptoParticipantIdentity.isNewIdentityKey;
    }

    public int hashCode() {
        return ((AbstractC50523MSb.A02(this.participantId) + Arrays.hashCode(this.publicIdentityKey)) * 31) + (this.isNewIdentityKey ? 1 : 0);
    }

    public CryptoParticipantIdentity(String str, byte[] bArr, boolean z) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
        this.isNewIdentityKey = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CryptoParticipantIdentity{participantId=");
        A1C.append(this.participantId);
        A1C.append(",publicIdentityKey=");
        A1C.append(this.publicIdentityKey);
        A1C.append(",isNewIdentityKey=");
        return AbstractC50523MSb.A0X(A1C, this.isNewIdentityKey);
    }
}
