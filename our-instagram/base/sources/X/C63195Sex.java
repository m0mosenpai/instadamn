package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* renamed from: X.Sex, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63195Sex {
    public final InterfaceC65701TsN A06;
    public final List A05 = AbstractC166987dD.A1E();
    public C63205Sf9[] A04 = new C63205Sf9[8];
    public int A03 = 7;
    public int A01 = 0;
    public int A00 = 0;
    public int A02 = 4096;

    public static C64531TIl A00(C63195Sex c63195Sex, int i) {
        C63205Sf9 c63205Sf9;
        boolean z = i >= 0 && i <= 60;
        C63205Sf9[] c63205Sf9Arr = AbstractC62867SUq.A01;
        if (z) {
            c63205Sf9 = c63205Sf9Arr[i];
        } else {
            int i2 = c63195Sex.A03 + 1 + (i - 61);
            if (i2 >= 0) {
                C63205Sf9[] c63205Sf9Arr2 = c63195Sex.A04;
                if (i2 < c63205Sf9Arr2.length) {
                    c63205Sf9 = c63205Sf9Arr2[i2];
                }
            }
            throw AbstractC58320PtC.A0i("Header index too large ", i + 1);
        }
        return c63205Sf9.A01;
    }

    public static void A01(C63195Sex c63195Sex, int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            C63205Sf9[] c63205Sf9Arr = c63195Sex.A04;
            int length = c63205Sf9Arr.length;
            while (true) {
                length--;
                i2 = c63195Sex.A03;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = c63205Sf9Arr[length].A00;
                i -= i4;
                c63195Sex.A00 -= i4;
                c63195Sex.A01--;
                i3++;
            }
            int i5 = i2 + 1;
            System.arraycopy(c63205Sf9Arr, i5, c63205Sf9Arr, i5 + i3, c63195Sex.A01);
            c63195Sex.A03 += i3;
        }
    }

    public final int A02(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int A00 = InterfaceC65701TsN.A00(this.A06);
            if ((A00 & 128) != 0) {
                i2 += (A00 & StringTreeSet.MAX_SYMBOL_COUNT) << i4;
                i4 += 7;
            } else {
                return i2 + (A00 << i4);
            }
        }
    }

    public C63195Sex(InterfaceC65677Tr7 interfaceC65677Tr7) {
        this.A06 = new TWW(interfaceC65677Tr7);
    }

    public final C64531TIl A03() {
        InterfaceC65701TsN interfaceC65701TsN = this.A06;
        int A00 = InterfaceC65701TsN.A00(interfaceC65701TsN);
        boolean A1P = AbstractC167007dF.A1P(A00 & 128, 128);
        int A02 = A02(A00, StringTreeSet.MAX_SYMBOL_COUNT);
        if (A1P) {
            C62889SVu c62889SVu = C62889SVu.A01;
            byte[] E7v = interfaceC65701TsN.E7v(A02);
            ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
            SWQ swq = c62889SVu.A00;
            int i = 0;
            int i2 = 0;
            for (byte b : E7v) {
                i = (i << 8) | (b & 255);
                i2 += 8;
                while (i2 >= 8) {
                    swq = swq.A02[(i >>> (i2 - 8)) & 255];
                    if (swq.A02 == null) {
                        A0U.write(swq.A00);
                        i2 -= swq.A01;
                        swq = swq;
                    } else {
                        i2 -= 8;
                    }
                }
            }
            while (i2 > 0) {
                SWQ swq2 = swq.A02[(i << (8 - i2)) & 255];
                if (swq2.A02 != null || swq2.A01 > i2) {
                    break;
                }
                A0U.write(swq2.A00);
                i2 -= swq2.A01;
                swq = swq;
            }
            return C64531TIl.A03(A0U.toByteArray());
        }
        return interfaceC65701TsN.E7w(A02);
    }
}
