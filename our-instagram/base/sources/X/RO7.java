package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class RO7 extends AbstractC63028Say implements Serializable {
    public final byte[] A00;

    @Override // X.AbstractC63028Say
    public final int A01() {
        return this.A00.length * 8;
    }

    @Override // X.AbstractC63028Say
    public final byte[] A03() {
        return this.A00;
    }

    @Override // X.AbstractC63028Say
    public final int A00() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        if (length >= 4) {
            int i = bArr[0] & 255;
            int i2 = bArr[1] & 255;
            int i3 = bArr[2] & 255;
            return ((bArr[3] & 255) << 24) | i | (i2 << 8) | (i3 << 16);
        }
        throw AbstractC166987dD.A14(AbstractC62215S2k.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", AbstractC25228BEl.A1Y(length)));
    }

    public RO7(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }

    @Override // X.AbstractC63028Say
    public final boolean A02(AbstractC63028Say abstractC63028Say) {
        byte[] A03 = abstractC63028Say.A03();
        int length = A03.length;
        byte[] bArr = this.A00;
        int length2 = bArr.length;
        if (length2 != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length2; i++) {
            z &= AbstractC167007dF.A1P(bArr[i], A03[i]);
        }
        return z;
    }
}
