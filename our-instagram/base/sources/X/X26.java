package X;

import java.util.Random;

/* loaded from: classes11.dex */
public final class X26 extends Random {
    public boolean A00;
    public final AbstractC50712Us A01;

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        this.A01.A0B(bArr);
    }

    @Override // java.util.Random
    public final int next(int i) {
        return this.A01.A04(i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return this.A01.A0A();
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return this.A01.A00();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return this.A01.A02();
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return this.A01.A05(i);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return this.A01.A07();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (!this.A00) {
            this.A00 = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public X26(AbstractC50712Us abstractC50712Us) {
        this.A01 = abstractC50712Us;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return this.A01.A03();
    }
}
