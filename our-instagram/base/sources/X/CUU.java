package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CUU {
    public static float[] A0I;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final float[] A0H;

    public CUU(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        boolean z;
        float f7;
        float f8 = f3;
        this.A09 = f;
        this.A0A = f2;
        this.A0B = f8;
        this.A0D = f4;
        this.A0C = f5;
        this.A0E = f6;
        float f9 = f5 - f3;
        float f10 = f6 - f4;
        boolean z2 = true;
        if (i == 1 || (i == 4 ? f10 > 0.0f : !(i != 5 || f10 >= 0.0f))) {
            z = true;
        } else {
            z = false;
        }
        this.A0G = z;
        float f11 = f2 - f;
        float f12 = 1.0f / f11;
        this.A08 = f12;
        if (!(3 == i) && Math.abs(f9) >= 0.001f && Math.abs(f10) >= 0.001f) {
            this.A0H = new float[101];
            this.A04 = (z ? -1 : 1) * f9;
            this.A05 = f10 * (z ? 1 : -1);
            this.A06 = z ? f5 : f8;
            this.A07 = z ? f4 : f6;
            float f13 = f4 - f6;
            int length = AbstractC27463CAh.A00().length;
            int i2 = 0;
            int i3 = 0;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i3 < length) {
                double radians = (float) Math.toRadians((i3 * 90.0d) / (AbstractC27463CAh.A00().length - 1));
                float sin = ((float) Math.sin(radians)) * f9;
                float cos = ((float) Math.cos(radians)) * f13;
                if (i3 > 0) {
                    f14 += (float) Math.hypot(sin - f15, cos - f16);
                    AbstractC27463CAh.A00()[i3] = f14;
                }
                i3++;
                f16 = cos;
                f15 = sin;
            }
            this.A00 = f14;
            int length2 = AbstractC27463CAh.A00().length;
            for (int i4 = 0; i4 < length2; i4++) {
                float[] A00 = AbstractC27463CAh.A00();
                A00[i4] = A00[i4] / f14;
            }
            float[] fArr = this.A0H;
            do {
                float f17 = i2 / 100.0f;
                float[] A002 = AbstractC27463CAh.A00();
                int binarySearch = Arrays.binarySearch(A002, 0, A002.length, f17);
                if (binarySearch >= 0) {
                    f7 = binarySearch;
                } else if (binarySearch == -1) {
                    fArr[i2] = 0.0f;
                    i2++;
                } else {
                    int i5 = -binarySearch;
                    int i6 = i5 - 2;
                    f7 = i6 + ((f17 - AbstractC27463CAh.A00()[i6]) / (AbstractC27463CAh.A00()[i5 - 1] - AbstractC27463CAh.A00()[i6]));
                }
                fArr[i2] = f7 / (AbstractC27463CAh.A00().length - 1);
                i2++;
            } while (i2 < 101);
            this.A03 = this.A00 * f12;
            z2 = false;
        } else {
            float hypot = (float) Math.hypot(f10, f9);
            this.A00 = hypot;
            this.A03 = hypot * f12;
            this.A06 = f9 / f11;
            this.A07 = f10 / f11;
            this.A0H = new float[101];
            this.A04 = Float.NaN;
            this.A05 = Float.NaN;
        }
        this.A0F = z2;
    }

    public final void A00(float f) {
        float f2;
        if (this.A0G) {
            f2 = this.A0A - f;
        } else {
            f2 = f - this.A09;
        }
        float f3 = f2 * this.A08;
        float f4 = 0.0f;
        if (f3 > 0.0f) {
            f4 = 1.0f;
            if (f3 < 1.0f) {
                float[] fArr = this.A0H;
                float f5 = f3 * 100.0f;
                int i = (int) f5;
                float f6 = fArr[i];
                f4 = f6 + ((f5 - i) * (fArr[i + 1] - f6));
            }
        }
        double d = f4 * 1.5707964f;
        this.A02 = (float) Math.sin(d);
        this.A01 = (float) Math.cos(d);
    }
}
