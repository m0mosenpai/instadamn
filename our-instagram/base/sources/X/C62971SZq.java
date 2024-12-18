package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.SZq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62971SZq {
    public boolean A05;
    public final TWX A07;
    public int A04 = Integer.MAX_VALUE;
    public C63205Sf9[] A06 = new C63205Sf9[8];
    public int A03 = 7;
    public int A01 = 0;
    public int A00 = 0;
    public int A02 = 4096;

    public static void A00(C62971SZq c62971SZq, int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            C63205Sf9[] c63205Sf9Arr = c62971SZq.A06;
            int length = c63205Sf9Arr.length;
            while (true) {
                length--;
                i2 = c62971SZq.A03;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = c63205Sf9Arr[length].A00;
                i -= i4;
                c62971SZq.A00 -= i4;
                c62971SZq.A01--;
                i3++;
            }
            int i5 = i2 + 1;
            System.arraycopy(c63205Sf9Arr, i5, c63205Sf9Arr, i5 + i3, c62971SZq.A01);
            C63205Sf9[] c63205Sf9Arr2 = c62971SZq.A06;
            int i6 = c62971SZq.A03 + 1;
            Arrays.fill(c63205Sf9Arr2, i6, i6 + i3, (Object) null);
            c62971SZq.A03 += i3;
        }
    }

    public C62971SZq(TWX twx) {
        this.A07 = twx;
    }

    public final void A01(int i, int i2, int i3) {
        int i4;
        TWX twx = this.A07;
        if (i < i2) {
            i4 = i | i3;
        } else {
            twx.A0B(i3 | i2);
            i4 = i - i2;
            while (i4 >= 128) {
                twx.A0B(128 | (i4 & StringTreeSet.MAX_SYMBOL_COUNT));
                i4 >>>= 7;
            }
        }
        twx.A0B(i4);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.TWX, java.lang.Object] */
    public final void A02(C64531TIl c64531TIl) {
        int A05;
        int i;
        long j = 0;
        int i2 = 0;
        while (true) {
            A05 = c64531TIl.A05();
            if (i2 >= A05) {
                break;
            }
            j += C62889SVu.A02[c64531TIl.A04(i2) & 255];
            i2++;
        }
        if (((int) ((j + 7) >> 3)) < A05) {
            ?? obj = new Object();
            long j2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < c64531TIl.A05(); i4++) {
                int A04 = c64531TIl.A04(i4) & 255;
                int i5 = C62889SVu.A03[A04];
                byte b = C62889SVu.A02[A04];
                j2 = (j2 << b) | i5;
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    obj.A0B((int) (j2 >> i3));
                }
            }
            if (i3 > 0) {
                obj.A0B((int) ((255 >>> i3) | (j2 << (8 - i3))));
            }
            c64531TIl = obj.A08();
            A05 = c64531TIl.A05();
            i = 128;
        } else {
            i = 0;
        }
        A01(A05, StringTreeSet.MAX_SYMBOL_COUNT, i);
        c64531TIl.A0A(this.A07);
    }
}
