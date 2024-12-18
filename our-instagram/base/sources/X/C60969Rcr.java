package X;

/* renamed from: X.Rcr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60969Rcr extends AbstractC53634Nnf {
    public static final int[] A01 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] A02 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    public final AbstractC64290T7z A00 = C60739RPd.A00();

    @Override // X.AbstractC53634Nnf
    public final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        String A03 = AbstractC64290T7z.A03(this.A00, str);
        if (AbstractC58322PtE.A0A(A03) != 11) {
            return C05F.A01;
        }
        int[] A00 = S53.A00(A03);
        int i = 0;
        while (i < A00.length - 1) {
            int i2 = i + 1;
            if (A00[i] != A00[i2]) {
                break;
            }
            i = i2;
        }
        if (i == 10) {
            return C05F.A0C;
        }
        int[] iArr = A01;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            i5 += iArr[i4] * A00[i4];
            i4++;
        } while (i4 < 9);
        int i6 = (i5 * 10) % 11;
        if (i6 != 10) {
            i3 = i6;
        }
        if (i3 != A00[9]) {
            return C05F.A0N;
        }
        int[] iArr2 = A02;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        do {
            i9 += iArr2[i8] * A00[i8];
            i8++;
        } while (i8 < 10);
        int i10 = (i9 * 10) % 11;
        if (i10 != 10) {
            i7 = i10;
        }
        if (i7 != A00[10]) {
            return C05F.A0Y;
        }
        return C05F.A00;
    }

    @Override // X.AbstractC53634Nnf
    public final String A01(String str) {
        char c;
        C14360o3.A0B(str, 0);
        String A03 = AbstractC64290T7z.A03(this.A00, str);
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (int i = 0; i < AbstractC58322PtE.A0A(A03) && A1C.length() < 14; i++) {
            if (i != 3 && i != 6) {
                if (i == 9) {
                    c = '-';
                } else {
                    A1C.append(A03.charAt(i));
                }
            } else {
                c = '.';
            }
            A1C.append(c);
            A1C.append(A03.charAt(i));
        }
        return AbstractC166987dD.A19(A1C);
    }
}
