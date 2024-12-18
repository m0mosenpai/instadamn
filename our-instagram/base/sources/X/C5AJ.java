package X;

import java.util.Arrays;

/* renamed from: X.5AJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AJ {
    public final float[] A00;

    public static final void A02(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                fArr[(i2 * 4) + i] = f;
                i2++;
            } while (i2 < 4);
        }
    }

    public static final void A04(float[] fArr, float f, float f2) {
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14];
        float f6 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static final void A05(float[] fArr, float[] fArr2) {
        float A00 = AbstractC119525b9.A00(fArr, fArr2, 0, 0);
        float A002 = AbstractC119525b9.A00(fArr, fArr2, 0, 1);
        float A003 = AbstractC119525b9.A00(fArr, fArr2, 0, 2);
        float A004 = AbstractC119525b9.A00(fArr, fArr2, 0, 3);
        float A005 = AbstractC119525b9.A00(fArr, fArr2, 1, 0);
        float A006 = AbstractC119525b9.A00(fArr, fArr2, 1, 1);
        float A007 = AbstractC119525b9.A00(fArr, fArr2, 1, 2);
        float A008 = AbstractC119525b9.A00(fArr, fArr2, 1, 3);
        float A009 = AbstractC119525b9.A00(fArr, fArr2, 2, 0);
        float A0010 = AbstractC119525b9.A00(fArr, fArr2, 2, 1);
        float A0011 = AbstractC119525b9.A00(fArr, fArr2, 2, 2);
        float A0012 = AbstractC119525b9.A00(fArr, fArr2, 2, 3);
        float A0013 = AbstractC119525b9.A00(fArr, fArr2, 3, 0);
        float A0014 = AbstractC119525b9.A00(fArr, fArr2, 3, 1);
        float A0015 = AbstractC119525b9.A00(fArr, fArr2, 3, 2);
        float A0016 = AbstractC119525b9.A00(fArr, fArr2, 3, 3);
        fArr[0] = A00;
        fArr[1] = A002;
        fArr[2] = A003;
        fArr[3] = A004;
        fArr[4] = A005;
        fArr[5] = A006;
        fArr[6] = A007;
        fArr[7] = A008;
        fArr[8] = A009;
        fArr[9] = A0010;
        fArr[10] = A0011;
        fArr[11] = A0012;
        fArr[12] = A0013;
        fArr[13] = A0014;
        fArr[14] = A0015;
        fArr[15] = A0016;
    }

    public static final void A01(C119515b8 c119515b8, float[] fArr) {
        float f = c119515b8.A01;
        float f2 = c119515b8.A03;
        long A00 = A00(fArr, AbstractC119395aw.A00(f, f2));
        float f3 = c119515b8.A00;
        long A002 = A00(fArr, AbstractC119395aw.A00(f, f3));
        float f4 = c119515b8.A02;
        long A003 = A00(fArr, AbstractC119395aw.A00(f4, f2));
        long A004 = A00(fArr, AbstractC119395aw.A00(f4, f3));
        float min = Math.min(C119365at.A01(A00), C119365at.A01(A002));
        float A01 = C119365at.A01(A003);
        float A012 = C119365at.A01(A004);
        c119515b8.A01 = Math.min(min, Math.min(A01, A012));
        float A02 = C119365at.A02(A00);
        float A022 = C119365at.A02(A002);
        c119515b8.A03 = Math.min(Math.min(A02, A022), Math.min(C119365at.A02(A003), C119365at.A02(A004)));
        c119515b8.A02 = Math.max(Math.max(C119365at.A01(A00), C119365at.A01(A002)), Math.max(C119365at.A01(A003), A012));
        c119515b8.A00 = Math.max(Math.max(A02, A022), Math.max(C119365at.A02(A003), C119365at.A02(A004)));
    }

    public static final void A03(float[] fArr, float f, float f2) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static /* synthetic */ float[] A06() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final boolean equals(Object obj) {
        float[] fArr = this.A00;
        if (!(obj instanceof C5AJ) || !C14360o3.A0K(fArr, ((C5AJ) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        float[] fArr = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |");
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return AbstractC16490ru.A0p(sb.toString());
    }

    public static final long A00(float[] fArr, long j) {
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        float f = 1.0f / (((fArr[3] * A01) + (fArr[7] * A02)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return AbstractC119395aw.A00(((fArr[0] * A01) + (fArr[4] * A02) + fArr[12]) * f, f * ((fArr[1] * A01) + (fArr[5] * A02) + fArr[13]));
    }
}
