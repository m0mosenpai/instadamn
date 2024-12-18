package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class W3B {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final String A0A;
    public final List A0B;

    public static W3B A00(WFa wFa) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        try {
            wFa.A0P(4);
            int A05 = (wFa.A05() & 3) + 1;
            if (A05 != 3) {
                ArrayList arrayList = new ArrayList();
                int A052 = wFa.A05() & 31;
                for (int i8 = 0; i8 < A052; i8++) {
                    int A08 = wFa.A08();
                    int i9 = wFa.A01;
                    wFa.A0P(A08);
                    byte[] bArr = wFa.A02;
                    byte[] bArr2 = new byte[A08 + 4];
                    System.arraycopy(AbstractC70062W0w.A00, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i9, bArr2, 4, A08);
                    arrayList.add(bArr2);
                }
                int A053 = wFa.A05();
                for (int i10 = 0; i10 < A053; i10++) {
                    int A082 = wFa.A08();
                    int i11 = wFa.A01;
                    wFa.A0P(A082);
                    byte[] bArr3 = wFa.A02;
                    byte[] bArr4 = new byte[A082 + 4];
                    System.arraycopy(AbstractC70062W0w.A00, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i11, bArr4, 4, A082);
                    arrayList.add(bArr4);
                }
                String str = null;
                int i12 = -1;
                if (A052 <= 0) {
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    i7 = 16;
                    f = 1.0f;
                } else {
                    byte[] bArr5 = (byte[]) arrayList.get(0);
                    C69455Vne A03 = WFG.A03((byte[]) arrayList.get(0), A05 + 1, bArr5.length);
                    i = A03.A0C;
                    i12 = A03.A07;
                    i2 = A03.A02 + 8;
                    i3 = A03.A01 + 8;
                    i4 = A03.A04;
                    i5 = A03.A03;
                    i6 = A03.A05;
                    i7 = A03.A09;
                    f = A03.A00;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(A03.A0A), Integer.valueOf(A03.A06), Integer.valueOf(A03.A08));
                }
                return new W3B(str, arrayList, f, A05, i, i12, i2, i3, i4, i5, i6, i7);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new VCM(AbstractC111324zv.A00(3594), e, 1, true);
        }
    }

    public W3B(String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A0B = list;
        this.A08 = i;
        this.A09 = i2;
        this.A06 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A04 = i6;
        this.A03 = i7;
        this.A05 = i8;
        this.A07 = i9;
        this.A00 = f;
        this.A0A = str;
    }
}
