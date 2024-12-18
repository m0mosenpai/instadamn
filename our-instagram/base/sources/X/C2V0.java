package X;

import java.util.Random;

/* renamed from: X.2V0, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2V0 extends AbstractC50712Us {
    public abstract Random A0C();

    @Override // X.AbstractC50712Us
    public final double A00() {
        return A0C().nextDouble();
    }

    @Override // X.AbstractC50712Us
    public final float A02() {
        return A0C().nextFloat();
    }

    @Override // X.AbstractC50712Us
    public final int A03() {
        return A0C().nextInt();
    }

    @Override // X.AbstractC50712Us
    public final int A04(int i) {
        return (A0C().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // X.AbstractC50712Us
    public final int A05(int i) {
        return A0C().nextInt(i);
    }

    @Override // X.AbstractC50712Us
    public final long A07() {
        return A0C().nextLong();
    }

    @Override // X.AbstractC50712Us
    public final boolean A0A() {
        return A0C().nextBoolean();
    }

    @Override // X.AbstractC50712Us
    public final byte[] A0B(byte[] bArr) {
        A0C().nextBytes(bArr);
        return bArr;
    }
}
