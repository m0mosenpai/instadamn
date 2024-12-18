package X;

/* renamed from: X.Tei, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65169Tei extends C64531TIl {
    public final transient int[] A00;
    public final transient byte[][] A01;

    public C65169Tei(TWX twx, int i) {
        super(null);
        SUN.A00(twx.A00, 0L, i);
        C63304ShA c63304ShA = twx.A01;
        C63304ShA c63304ShA2 = c63304ShA;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (c63304ShA.A00 != c63304ShA.A01) {
                i3 += c63304ShA.A00 - c63304ShA.A01;
                i4++;
                c63304ShA = c63304ShA.A02;
            } else {
                throw AbstractC58318PtA.A0W("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        this.A01 = bArr;
        int[] iArr = new int[i4 * 2];
        this.A00 = iArr;
        int i5 = 0;
        while (i2 < i) {
            bArr[i5] = c63304ShA2.A06;
            i2 += c63304ShA2.A00 - c63304ShA2.A01;
            if (i2 > i) {
                i2 = i;
            }
            iArr[i5] = i2;
            iArr[i4 + i5] = c63304ShA2.A01;
            c63304ShA2.A05 = true;
            i5++;
            c63304ShA2 = c63304ShA2.A02;
        }
    }

    @Override // X.C64531TIl
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C64531TIl) {
                C64531TIl c64531TIl = (C64531TIl) obj;
                int A05 = c64531TIl.A05();
                int A052 = A05();
                if (A05 != A052 || !A0B(c64531TIl, A052)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.C64531TIl
    public final int hashCode() {
        int i = super.A00;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A01;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.A00;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        super.A00 = i4;
        return i4;
    }

    @Override // X.C64531TIl
    public final String toString() {
        return new C64531TIl(A0D()).toString();
    }
}
