package X;

import java.util.Locale;

/* renamed from: X.Rcp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60967Rcp extends AbstractC53634Nnf {
    public final AbstractC64290T7z A00 = C60739RPd.A00();
    public final AbstractC64290T7z A01 = AbstractC64290T7z.A01("Kk");

    @Override // X.AbstractC53634Nnf
    public final Integer A00(String str) {
        char c;
        C14360o3.A0B(str, 0);
        if (str.equals(A01(str))) {
            String A08 = this.A00.A07(this.A01).A06().A08(str);
            C14360o3.A0A(A08);
            String A10 = AbstractC166997dE.A10(Locale.ROOT, A08);
            int A0A = AbstractC58322PtE.A0A(A10);
            if (A0A != 8 && A0A != 9) {
                return C05F.A01;
            }
            int A04 = AbstractC001900j.A04(A10, 'K', 0);
            if (A04 == -1 || A04 == A0A - 1) {
                int i = A0A - 1;
                int[] A00 = S53.A00(AbstractC25227BEk.A0w(A10, 0, i));
                char charAt = A10.charAt(i);
                int length = A00.length - 1;
                int i2 = 0;
                if (length >= 0) {
                    int i3 = 2;
                    while (true) {
                        int i4 = length - 1;
                        i2 += A00[length] * i3;
                        i3++;
                        if (i3 == 8) {
                            i3 = 2;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        length = i4;
                    }
                }
                int i5 = 11 - (i2 % 11);
                if (i5 != 10) {
                    if (i5 != 11) {
                        c = (char) String.valueOf(i5).codePointAt(0);
                    } else {
                        c = '0';
                    }
                } else {
                    c = 'K';
                }
                if (charAt == c) {
                    return C05F.A00;
                }
                return C05F.A0j;
            }
        }
        return C05F.A15;
    }

    @Override // X.AbstractC53634Nnf
    public final String A01(String str) {
        C14360o3.A0B(str, 0);
        String A08 = this.A00.A07(this.A01).A06().A08(str);
        C14360o3.A0A(A08);
        String A10 = AbstractC166997dE.A10(Locale.ROOT, A08);
        int A0A = AbstractC58322PtE.A0A(A10);
        StringBuilder A1C = AbstractC166987dD.A1C();
        int max = Math.max(0, A0A - 9);
        for (int i = max; i < A0A; i++) {
            char c = '-';
            if (i != max + 1) {
                c = '.';
                if (i != max + 4 && i != max + 7) {
                    A1C.append(A10.charAt((A0A - 1) - i));
                }
            }
            A1C.append(c);
            A1C.append(A10.charAt((A0A - 1) - i));
        }
        A1C.reverse();
        return AbstractC166987dD.A19(A1C);
    }
}
