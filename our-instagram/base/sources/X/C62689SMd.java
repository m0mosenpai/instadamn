package X;

import java.util.Arrays;

/* renamed from: X.SMd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62689SMd {
    public final int A00;
    public final int A01;
    public final C62935SYd A02;
    public final short A03;
    public final short A04;
    public final byte[] A05;

    public C62689SMd(C62935SYd c62935SYd, byte[] bArr, int i, int i2, short s, short s2) {
        this.A02 = c62935SYd;
        this.A04 = s;
        this.A03 = s2;
        this.A01 = i;
        this.A05 = bArr;
        this.A00 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DnsAnswer{mName=");
        A1C.append(this.A02);
        A1C.append(", mType=");
        A1C.append((int) this.A04);
        A1C.append(", mKlass=");
        A1C.append((int) this.A03);
        A1C.append(", mTtl=");
        A1C.append(this.A01);
        A1C.append(", mRdata=");
        A1C.append(Arrays.toString(this.A05));
        A1C.append(", mNumOfBytes=");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }
}
