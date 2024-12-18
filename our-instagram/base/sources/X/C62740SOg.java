package X;

import java.util.Arrays;

/* renamed from: X.SOg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62740SOg {
    public final SOM A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C62740SOg) {
            C62740SOg c62740SOg = (C62740SOg) obj;
            if (this.A00.equals(c62740SOg.A00)) {
                return Arrays.equals(this.A01, c62740SOg.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.A01);
    }

    public C62740SOg(SOM som, byte[] bArr) {
        if (bArr != null) {
            this.A00 = som;
            this.A01 = bArr;
            return;
        }
        throw AbstractC166987dD.A15("bytes is null");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EncodedPayload{encoding=");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(", bytes=[...]}", A1C);
    }
}
