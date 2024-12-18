package X;

import android.graphics.Typeface;

/* renamed from: X.2f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54502f7 {
    public final Typeface A00;
    public final C54522f9 A01 = new C54522f9(1024);
    public final C2f4 A02;
    public final char[] A03;

    public C54502f7(Typeface typeface, C2f4 c2f4) {
        int i;
        int i2;
        int i3;
        int i4;
        this.A00 = typeface;
        this.A02 = c2f4;
        int A00 = c2f4.A00(6);
        if (A00 != 0) {
            int i5 = A00 + c2f4.A00;
            i = c2f4.A04.getInt(i5 + c2f4.A04.getInt(i5));
        } else {
            i = 0;
        }
        this.A03 = new char[i * 2];
        int A002 = c2f4.A00(6);
        if (A002 != 0) {
            int i6 = A002 + c2f4.A00;
            int i7 = c2f4.A04.getInt(i6 + c2f4.A04.getInt(i6));
            for (int i8 = 0; i8 < i7; i8++) {
                C54532fA c54532fA = new C54532fA(this, i8);
                C54542fB A003 = C54532fA.A00(c54532fA);
                int A004 = A003.A00(4);
                if (A004 != 0) {
                    i2 = A003.A04.getInt(A004 + A003.A00);
                } else {
                    i2 = 0;
                }
                Character.toChars(i2, this.A03, i8 * 2);
                C54542fB A005 = C54532fA.A00(c54532fA);
                int A006 = A005.A00(16);
                if (A006 != 0) {
                    int i9 = A006 + A005.A00;
                    i3 = A005.A04.getInt(i9 + A005.A04.getInt(i9));
                } else {
                    i3 = 0;
                }
                C02R.A06(i3 > 0, "invalid metadata codepoint length");
                C54522f9 c54522f9 = this.A01;
                C54542fB A007 = C54532fA.A00(c54532fA);
                int A008 = A007.A00(16);
                if (A008 != 0) {
                    int i10 = A008 + A007.A00;
                    i4 = A007.A04.getInt(i10 + A007.A04.getInt(i10));
                } else {
                    i4 = 0;
                }
                c54522f9.A00(c54532fA, 0, i4 - 1);
            }
        }
    }
}
