package X;

/* renamed from: X.59z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1133759z {
    public static final AbstractC1132959r A00(C5A8 c5a8, AbstractC1132959r abstractC1132959r, C1132759p c1132759p) {
        if (abstractC1132959r.A01 != AbstractC1133459w.A02) {
            return abstractC1132959r;
        }
        C1132859q c1132859q = (C1132859q) abstractC1132959r;
        C1132759p c1132759p2 = c1132859q.A07;
        if (A03(c1132759p2, c1132759p)) {
            return abstractC1132959r;
        }
        float[] A05 = A05(A06(c5a8.A00, c1132759p2.A00(), c1132759p.A00()), c1132859q.A0D);
        String str = ((AbstractC1132959r) c1132859q).A02;
        float[] fArr = c1132859q.A0C;
        return new C1132859q(c1132859q.A05, c1132859q.A03, c1132859q.A06, c1132759p, str, fArr, A05, c1132859q.A01, c1132859q.A00, -1);
    }

    public static final void A02(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final boolean A03(C1132759p c1132759p, C1132759p c1132759p2) {
        return c1132759p == c1132759p2 || (Math.abs(c1132759p.A00 - c1132759p2.A00) < 0.001f && Math.abs(c1132759p.A01 - c1132759p2.A01) < 0.001f);
    }

    public static final C5AR A01(AbstractC1132959r abstractC1132959r, AbstractC1132959r abstractC1132959r2) {
        if (abstractC1132959r == abstractC1132959r2) {
            return new C5AQ(abstractC1132959r);
        }
        long j = abstractC1132959r.A01;
        long j2 = AbstractC1133459w.A02;
        if (j == j2 && abstractC1132959r2.A01 == j2) {
            return new C25767Ba6((C1132859q) abstractC1132959r, (C1132859q) abstractC1132959r2);
        }
        return new C5AR(abstractC1132959r, abstractC1132959r2);
    }

    public static final float[] A04(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] A05(float[] fArr, float[] fArr2) {
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = fArr[2] * f7;
        float f11 = fArr[5];
        float f12 = f10 + (fArr2[1] * f11);
        float f13 = fArr[8];
        float f14 = fArr[0];
        float f15 = fArr2[3] * f14;
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        float f18 = fArr[1];
        float f19 = fArr2[3];
        float f20 = fArr[2];
        float f21 = f14 * fArr2[6];
        float f22 = fArr[3];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        float f25 = fArr2[6];
        return new float[]{f + (f2 * f3) + (f4 * f5), (f6 * f7) + (f3 * f8) + (f9 * f5), f12 + (f5 * f13), f15 + (f2 * f16) + (f4 * f17), (f18 * f19) + (f8 * f16) + (f9 * f17), (f19 * f20) + (f11 * fArr2[4]) + (f17 * f13), f21 + (f22 * f23) + (f4 * f24), (f18 * f25) + (fArr[4] * f23) + (f9 * f24), (f20 * f25) + (fArr[5] * fArr2[7]) + (f13 * f24)};
    }

    public static final float[] A06(float[] fArr, float[] fArr2, float[] fArr3) {
        A02(fArr, fArr2);
        A02(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] A04 = A04(fArr);
        float f = fArr4[0];
        float f2 = fArr4[1];
        float f3 = fArr4[2];
        return A05(A04, new float[]{fArr4[0] * fArr[0], fArr4[1] * fArr[1], fArr4[2] * fArr[2], fArr[3] * f, fArr[4] * f2, fArr[5] * f3, f * fArr[6], f2 * fArr[7], f3 * fArr[8]});
    }
}
