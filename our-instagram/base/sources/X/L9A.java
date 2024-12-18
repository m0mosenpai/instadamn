package X;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class L9A {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;
    public final byte[] A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;
    public final byte[] A08;

    public L9A(Integer num, Integer num2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z) {
        AbstractC167027dH.A0a(1, bArr, bArr2, bArr3, bArr4);
        AbstractC167007dF.A1J(bArr5, 8, bArr6);
        this.A02 = z;
        this.A00 = num;
        this.A01 = num2;
        this.A03 = JQ0.A1b(bArr);
        this.A04 = JQ0.A1b(bArr2);
        this.A05 = JQ0.A1b(bArr3);
        this.A06 = JQ0.A1b(bArr4);
        this.A07 = Arrays.copyOf(bArr5, bArr5.length);
        this.A08 = Arrays.copyOf(bArr6, bArr6.length);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            L9A l9a = (L9A) obj;
            Integer num = this.A00;
            Integer num2 = l9a.A00;
            if (num == null) {
                equals = AbstractC25229BEm.A1Z(num2);
            } else {
                equals = num.equals(num2);
            }
            Integer num3 = this.A01;
            Integer num4 = l9a.A01;
            if (num3 == null) {
                equals2 = AbstractC25229BEm.A1Z(num4);
            } else {
                equals2 = num3.equals(num4);
            }
            if (!Arrays.equals(this.A03, l9a.A03) || !Arrays.equals(this.A04, l9a.A04) || !Arrays.equals(this.A05, l9a.A05) || !Arrays.equals(this.A06, l9a.A06) || this.A02 != l9a.A02 || !equals || !equals2 || !Arrays.equals(this.A07, l9a.A07) || !Arrays.equals(this.A08, l9a.A08)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC167007dF.A0D(this.A02, ((((((Arrays.hashCode(this.A03) * 31) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A05)) * 31) + Arrays.hashCode(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31) + Arrays.hashCode(this.A07)) * 31) + Arrays.hashCode(this.A08);
    }
}
