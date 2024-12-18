package X;

/* renamed from: X.CAd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27460CAd {
    public int A00;
    public int A01;
    public CAV A02;
    public String A03;

    public final int A00() {
        CAV cav = this.A02;
        int length = this.A03.length();
        if (cav != null) {
            return (length - (this.A00 - this.A01)) + (cav.A00 - (cav.A01 - cav.A02));
        }
        return length;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.CAV] */
    public final void A01(int i, int i2, String str) {
        int i3;
        if (i <= i2) {
            if (i >= 0) {
                CAV cav = this.A02;
                if (cav == null) {
                    int length = str.length();
                    int max = Math.max(255, length + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    String str2 = this.A03;
                    int min2 = Math.min(str2.length() - i2, 64);
                    int i4 = i - min;
                    String A00 = AbstractC111324zv.A00(244);
                    C14360o3.A0C(str2, A00);
                    str2.getChars(i4, i, cArr, 0);
                    String str3 = this.A03;
                    int i5 = max - min2;
                    int i6 = min2 + i2;
                    C14360o3.A0C(str3, A00);
                    str3.getChars(i2, i6, cArr, i5);
                    C14360o3.A0C(str, A00);
                    str.getChars(0, length, cArr, min);
                    ?? obj = new Object();
                    obj.A00 = max;
                    obj.A03 = cArr;
                    obj.A02 = min + length;
                    obj.A01 = i5;
                    this.A02 = obj;
                    this.A01 = i4;
                    this.A00 = i6;
                    return;
                }
                int i7 = this.A01;
                int i8 = i - i7;
                int i9 = i2 - i7;
                if (i8 >= 0) {
                    int i10 = cav.A00;
                    int i11 = cav.A01;
                    int i12 = cav.A02;
                    int i13 = i11 - i12;
                    if (i9 <= i10 - i13) {
                        int length2 = str.length();
                        int i14 = length2 - (i9 - i8);
                        if (i14 > i13) {
                            int i15 = i10;
                            do {
                                i15 *= 2;
                            } while (i15 - i10 < i14 - i13);
                            char[] cArr2 = new char[i15];
                            char[] cArr3 = cav.A03;
                            C14360o3.A0B(cArr3, 0);
                            System.arraycopy(cArr3, 0, cArr2, 0, i12);
                            int i16 = cav.A00;
                            int i17 = cav.A01;
                            int i18 = i16 - i17;
                            i11 = i15 - i18;
                            char[] cArr4 = cav.A03;
                            C14360o3.A0B(cArr4, 0);
                            System.arraycopy(cArr4, i17, cArr2, i11, (i18 + i17) - i17);
                            cav.A03 = cArr2;
                            cav.A00 = i15;
                            cav.A01 = i11;
                        }
                        int i19 = cav.A02;
                        if (i8 < i19 && i9 <= i19) {
                            int i20 = i19 - i9;
                            char[] cArr5 = cav.A03;
                            C14360o3.A0B(cArr5, 0);
                            System.arraycopy(cArr5, i9, cArr5, i11 - i20, i19 - i9);
                            cav.A02 = i8;
                            i3 = cav.A01 - i20;
                        } else {
                            if (i8 < i19 && i9 >= i19) {
                                cav.A01 = i9 + (i11 - i19);
                                cav.A02 = i8;
                                char[] cArr6 = cav.A03;
                                C14360o3.A0C(str, AbstractC111324zv.A00(244));
                                str.getChars(0, length2, cArr6, i8);
                                cav.A02 += length2;
                                return;
                            }
                            int i21 = i11 - i19;
                            int i22 = i8 + i21;
                            i3 = i9 + i21;
                            char[] cArr7 = cav.A03;
                            C14360o3.A0B(cArr7, 0);
                            System.arraycopy(cArr7, i11, cArr7, i19, i22 - i11);
                            i8 = cav.A02 + (i22 - i11);
                            cav.A02 = i8;
                        }
                        cav.A01 = i3;
                        char[] cArr62 = cav.A03;
                        C14360o3.A0C(str, AbstractC111324zv.A00(244));
                        str.getChars(0, length2, cArr62, i8);
                        cav.A02 += length2;
                        return;
                    }
                }
                this.A03 = toString();
                this.A02 = null;
                this.A01 = -1;
                this.A00 = -1;
                A01(i, i2, str);
                return;
            }
            throw AbstractC25230BEn.A0n("start must be non-negative, but was ", i);
        }
        throw AbstractC25230BEn.A0o("start index must be less than or equal to end index: ", " > ", i, i2);
    }

    public final String toString() {
        CAV cav = this.A02;
        if (cav == null) {
            return this.A03;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append((CharSequence) this.A03, 0, this.A01);
        A1C.append(cav.A03, 0, cav.A02);
        char[] cArr = cav.A03;
        int i = cav.A01;
        A1C.append(cArr, i, cav.A00 - i);
        String str = this.A03;
        A1C.append((CharSequence) str, this.A00, str.length());
        return A1C.toString();
    }
}
