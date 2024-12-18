package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class Q7O extends Q7P {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;
    public final OutputStream A04;

    public static void A00(Q7O q7o) {
        q7o.A04.write(q7o.A03, 0, q7o.A00);
        q7o.A00 = 0;
    }

    public static void A01(Q7O q7o, int i) {
        if (q7o.A02 - q7o.A00 < i) {
            A00(q7o);
        }
    }

    public final void A0D(int i) {
        byte[] bArr = this.A03;
        int A0D = AbstractC58323PtF.A0D(bArr, this.A00, i);
        this.A00 = A0D + 1;
        AbstractC58318PtA.A19(i >> 24, bArr, A0D);
        this.A01 += 4;
    }

    public final void A0E(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (Q7P.A02) {
            long j2 = this.A00;
            while (true) {
                int i4 = i & (-128);
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = i5;
                if (i4 == 0) {
                    break;
                }
                C58400Pue.A07(bArr2, (byte) ((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128), j);
                i >>>= 7;
            }
            C58400Pue.A07(bArr2, (byte) i, j);
            i3 = this.A01 + ((int) (this.A00 - j2));
        } else {
            while (true) {
                int i6 = i & (-128);
                bArr = this.A03;
                i2 = this.A00;
                this.A00 = i2 + 1;
                if (i6 == 0) {
                    break;
                }
                bArr[i2] = (byte) ((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                this.A01++;
                i >>>= 7;
            }
            bArr[i2] = (byte) i;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0F(long j) {
        byte[] bArr = this.A03;
        int A0G = AbstractC58323PtF.A0G(bArr, AbstractC58324PtG.A00(bArr, this.A00, j), j);
        this.A00 = A0G + 1;
        AbstractC58322PtE.A17(j, bArr, A0G);
        this.A01 += 8;
    }

    public final void A0G(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        long j2;
        int i4;
        if (Q7P.A02) {
            long j3 = this.A00;
            while (true) {
                long j4 = j & (-128);
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j2 = i5;
                i4 = (int) j;
                if (j4 == 0) {
                    break;
                }
                C58400Pue.A07(bArr2, (byte) ((i4 & StringTreeSet.MAX_SYMBOL_COUNT) | 128), j2);
                j >>>= 7;
            }
            C58400Pue.A07(bArr2, (byte) i4, j2);
            i3 = this.A01 + ((int) (this.A00 - j3));
        } else {
            while (true) {
                long j5 = j & (-128);
                bArr = this.A03;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) j;
                if (j5 == 0) {
                    break;
                }
                bArr[i] = (byte) ((i2 & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                this.A01++;
                j >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0H(byte[] bArr, int i, int i2) {
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = i3 - i4;
        byte[] bArr2 = this.A03;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.A00 += i2;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.A00 = i3;
            this.A01 += i5;
            A00(this);
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.A00 = i2;
            } else {
                this.A04.write(bArr, i6, i2);
            }
        }
        this.A01 += i2;
    }

    public Q7O(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.A03 = new byte[max];
            this.A02 = max;
            this.A04 = outputStream;
            return;
        }
        throw AbstractC166987dD.A12("bufferSize must be >= 0");
    }
}
