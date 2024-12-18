package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class W35 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final String A08;
    public final List A09;

    public static W35 A00(WFa wFa) {
        List singletonList;
        try {
            wFa.A0P(21);
            int A05 = wFa.A05() & 3;
            int A052 = wFa.A05();
            int i = wFa.A01;
            int i2 = 0;
            for (int i3 = 0; i3 < A052; i3++) {
                wFa.A0P(1);
                int A08 = wFa.A08();
                for (int i4 = 0; i4 < A08; i4++) {
                    int A082 = wFa.A08();
                    i2 += A082 + 4;
                    wFa.A0P(A082);
                }
            }
            wFa.A0O(i);
            byte[] bArr = new byte[i2];
            String str = null;
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            int i11 = -1;
            for (int i12 = 0; i12 < A052; i12++) {
                int A053 = wFa.A05() & 63;
                int A083 = wFa.A08();
                for (int i13 = 0; i13 < A083; i13++) {
                    int A084 = wFa.A08();
                    System.arraycopy(WFG.A01, 0, bArr, i5, 4);
                    int i14 = i5 + 4;
                    System.arraycopy(wFa.A02, wFa.A01, bArr, i14, A084);
                    if (A053 == 33 && i13 == 0) {
                        C69471Vnu A02 = WFG.A02(bArr, i14 + 2, i14 + A084);
                        i6 = A02.A02 + 8;
                        i7 = A02.A01 + 8;
                        i8 = A02.A05;
                        i9 = A02.A04;
                        i10 = A02.A06;
                        f = A02.A00;
                        i11 = A02.A0C;
                        int i15 = A02.A0A;
                        boolean z = A02.A0E;
                        A053 = 33;
                        str = AbstractC70062W0w.A00(A02.A0F, i15, A02.A09, A02.A08, A02.A07, z);
                    }
                    i5 = i14 + A084;
                    wFa.A0P(A084);
                }
            }
            if (i2 != 0) {
                singletonList = Collections.singletonList(bArr);
            } else {
                singletonList = Collections.emptyList();
            }
            return new W35(str, singletonList, f, A05 + 1, i6, i7, i8, i9, i10, i11);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new VCM("Error parsing HEVC config", e, 1, true);
        }
    }

    public W35(String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A09 = list;
        this.A07 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
        this.A00 = f;
        this.A06 = i7;
        this.A08 = str;
    }
}
