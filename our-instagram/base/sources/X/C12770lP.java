package X;

import java.lang.reflect.Array;
import org.tukaani.xz.lzma.LZMAEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* renamed from: X.0lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12770lP extends AbstractC20510zS {
    public final int[][] A00;
    public final int[] A01;
    public final /* synthetic */ LZMAEncoder A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12770lP(LZMAEncoder lZMAEncoder, int i, int i2) {
        super(lZMAEncoder);
        this.A02 = lZMAEncoder;
        int i3 = 1 << i;
        this.A01 = new int[i3];
        this.A00 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max((i2 - 2) + 1, 16));
    }

    @Override // X.AbstractC20510zS
    public final void A00() {
        super.A00();
        int i = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void A01() {
        int[] iArr;
        int i = 0;
        while (true) {
            int[] iArr2 = this.A01;
            if (i < iArr2.length) {
                if (iArr2[i] <= 0) {
                    iArr2[i] = 32;
                    short[] sArr = super.A00;
                    short s = sArr[0];
                    int[] iArr3 = RangeEncoder.A06;
                    int i2 = iArr3[s >>> 4];
                    int i3 = 0;
                    do {
                        iArr = this.A00[i];
                        iArr[i3] = RangeEncoder.A00(super.A02[i], i3) + i2;
                        i3++;
                    } while (i3 < 8);
                    int i4 = iArr3[(s ^ 2047) >>> 4];
                    short s2 = sArr[1];
                    int i5 = iArr3[s2 >>> 4];
                    while (i3 < 16) {
                        iArr[i3] = i4 + i5 + RangeEncoder.A00(this.A03[i], i3 - 8);
                        i3++;
                    }
                    int i6 = iArr3[(s2 ^ 2047) >>> 4];
                    while (i3 < iArr.length) {
                        iArr[i3] = i4 + i6 + RangeEncoder.A00(super.A01, (i3 - 8) - 8);
                        i3++;
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A02(int i, int i2) {
        short[] sArr;
        short[][] sArr2;
        int i3 = i - 2;
        LZMAEncoder lZMAEncoder = this.A02;
        Class cls = LZMAEncoder.A0F;
        RangeEncoder rangeEncoder = lZMAEncoder.A0B;
        short[] sArr3 = super.A00;
        if (i3 < 8) {
            rangeEncoder.A03(sArr3, 0, 0);
            sArr2 = super.A02;
        } else {
            rangeEncoder.A03(sArr3, 0, 1);
            i3 -= 8;
            if (i3 < 8) {
                rangeEncoder.A03(sArr3, 1, 0);
                sArr2 = this.A03;
            } else {
                rangeEncoder.A03(sArr3, 1, 1);
                sArr = super.A01;
                i3 -= 8;
                rangeEncoder.A02(sArr, i3);
                int[] iArr = this.A01;
                iArr[i2] = iArr[i2] - 1;
            }
        }
        sArr = sArr2[i2];
        rangeEncoder.A02(sArr, i3);
        int[] iArr2 = this.A01;
        iArr2[i2] = iArr2[i2] - 1;
    }
}
