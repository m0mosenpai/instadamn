package X;

/* renamed from: X.Rco, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60966Rco extends AbstractC53634Nnf {
    public final AbstractC64290T7z A00 = C60739RPd.A00();

    @Override // X.AbstractC53634Nnf
    public final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        String A03 = AbstractC64290T7z.A03(this.A00, str);
        if (AbstractC58322PtE.A0A(A03) != 10) {
            return C05F.A01;
        }
        int[] A00 = S53.A00(A03);
        int i = A00[9];
        int i2 = 0;
        int i3 = (A00[0] * 10) + A00[1];
        if (i3 < 1 || (i3 > 24 && i3 != 30)) {
            return C05F.A0u;
        }
        if (A00[2] > 6) {
            return C05F.A0N;
        }
        int length = A00.length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = 1;
            if (i5 % 2 == 0) {
                i6 = 2;
            }
            int i7 = A00[i5] * i6;
            if (i7 > 9) {
                i7 -= 9;
            }
            i4 += i7;
        }
        int i8 = i4 % 10;
        if (i8 != 0) {
            i2 = 10 - i8;
        }
        if (i == i2) {
            return C05F.A00;
        }
        return C05F.A0Y;
    }

    @Override // X.AbstractC53634Nnf
    public final String A01(String str) {
        C14360o3.A0B(str, 0);
        String A03 = AbstractC64290T7z.A03(this.A00, str);
        if (AbstractC58322PtE.A0A(A03) >= 10) {
            return AnonymousClass001.A0T(AbstractC25227BEk.A0w(A03, 0, 9), AbstractC25227BEk.A0w(A03, 9, 10), '-');
        }
        return A03;
    }
}
