package X;

import java.io.Closeable;

/* loaded from: classes10.dex */
public final class THO implements Closeable {
    public TWX A03;
    public boolean A04;
    public byte[] A05;
    public C63304ShA A06;
    public long A02 = -1;
    public int A01 = -1;
    public int A00 = -1;

    public final int A00(long j) {
        if (j >= -1) {
            TWX twx = this.A03;
            long j2 = twx.A00;
            if (j <= j2) {
                if (j != -1 && j != j2) {
                    long j3 = 0;
                    C63304ShA c63304ShA = twx.A01;
                    C63304ShA c63304ShA2 = c63304ShA;
                    C63304ShA c63304ShA3 = this.A06;
                    if (c63304ShA3 != null) {
                        long j4 = this.A02 - (this.A01 - c63304ShA3.A01);
                        if (j4 > j) {
                            c63304ShA2 = c63304ShA3;
                            j2 = j4;
                        } else {
                            c63304ShA = c63304ShA3;
                            j3 = j4;
                        }
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long A00 = C63304ShA.A00(c63304ShA);
                            if (j < A00 + j3) {
                                break;
                            }
                            j3 += A00;
                            c63304ShA = c63304ShA.A02;
                        }
                    } else {
                        while (j2 > j) {
                            c63304ShA2 = c63304ShA2.A03;
                            j2 -= C63304ShA.A00(c63304ShA2);
                        }
                        j3 = j2;
                        c63304ShA = c63304ShA2;
                    }
                    if (this.A04 && c63304ShA.A05) {
                        C63304ShA A04 = c63304ShA.A04();
                        TWX twx2 = this.A03;
                        if (twx2.A01 == c63304ShA) {
                            twx2.A01 = A04;
                        }
                        c63304ShA.A05(A04);
                        c63304ShA = A04;
                        A04.A03.A02();
                    }
                    this.A06 = c63304ShA;
                    this.A02 = j;
                    this.A05 = c63304ShA.A06;
                    int i = c63304ShA.A01 + ((int) (j - j3));
                    this.A01 = i;
                    int i2 = c63304ShA.A00;
                    this.A00 = i2;
                    return i2 - i;
                }
                this.A06 = null;
                this.A02 = j;
                this.A05 = null;
                this.A01 = -1;
                this.A00 = -1;
                return -1;
            }
        }
        throw AbstractC58319PtB.A0f("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.A03.A00)});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            this.A06 = null;
            this.A02 = -1L;
            this.A05 = null;
            this.A01 = -1;
            this.A00 = -1;
            return;
        }
        throw AbstractC166987dD.A14("not attached to a buffer");
    }
}
