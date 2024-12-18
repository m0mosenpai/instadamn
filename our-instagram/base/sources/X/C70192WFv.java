package X;

import java.nio.ShortBuffer;
import java.util.Arrays;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.WFv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70192WFv {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public short[] A0B;
    public short[] A0C;
    public short[] A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(C70192WFv c70192WFv, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = c70192WFv.A0G;
        int i4 = length / i3;
        if (i + i2 > i4) {
            return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }
        return sArr;
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A03 = i5 / i7;
        this.A02 = i8 / i6;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C70192WFv r22) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70192WFv.A01(X.WFv):void");
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A04 = A04(this, this.A0C, this.A06, i2);
        this.A0C = A04;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A04, this.A06 * i3, i3 * i2);
        this.A06 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public C70192WFv(float f, float f2, int i, int i2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A00 = f2;
        this.A0E = i / i3;
        this.A0K = i / ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 * 2;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0B = new short[i6];
        this.A0C = new short[i6];
        this.A0D = new short[i6];
    }

    public final void A05(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.A0G;
        int min = Math.min(remaining / i, this.A06);
        shortBuffer.put(this.A0C, 0, i * min);
        int i2 = this.A06 - min;
        this.A06 = i2;
        short[] sArr = this.A0C;
        System.arraycopy(sArr, min * i, sArr, 0, i2 * i);
    }
}
