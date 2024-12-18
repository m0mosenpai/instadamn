package X;

import android.graphics.Path;

/* renamed from: X.BHn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25294BHn {
    public static final boolean A00(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        long j2 = AbstractC137646Lk.A00;
        float A00 = AbstractC25231BEo.A00(j);
        float A002 = AbstractC137646Lk.A00(j);
        if (((f5 * f5) / (A00 * A00)) + ((f6 * f6) / (A002 * A002)) > 1.0f) {
            return false;
        }
        return true;
    }

    public static final boolean A01(AbstractC119385av abstractC119385av, float f, float f2) {
        if (abstractC119385av instanceof C119375au) {
            C114205Dh c114205Dh = ((C119375au) abstractC119385av).A00;
            if (c114205Dh.A01 <= f && f < c114205Dh.A02 && c114205Dh.A03 <= f2 && f2 < c114205Dh.A00) {
                return true;
            }
            return false;
        }
        if (abstractC119385av instanceof C6Ln) {
            C137656Ll c137656Ll = ((C6Ln) abstractC119385av).A00;
            float f3 = c137656Ll.A01;
            if (f >= f3) {
                float f4 = c137656Ll.A02;
                if (f < f4) {
                    float f5 = c137656Ll.A03;
                    if (f2 >= f5) {
                        float f6 = c137656Ll.A00;
                        if (f2 < f6) {
                            long j = c137656Ll.A06;
                            long j2 = AbstractC137646Lk.A00;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                            long j3 = c137656Ll.A07;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
                            float f7 = f4 - f3;
                            if (intBitsToFloat + intBitsToFloat2 <= f7) {
                                long j4 = c137656Ll.A04;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32));
                                long j5 = c137656Ll.A05;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 >> 32));
                                if (intBitsToFloat3 + intBitsToFloat4 <= f7) {
                                    float A00 = AbstractC137646Lk.A00(j);
                                    float A002 = AbstractC137646Lk.A00(j4);
                                    float f8 = f6 - f5;
                                    if (A00 + A002 <= f8) {
                                        float A003 = AbstractC137646Lk.A00(j3);
                                        float A004 = AbstractC137646Lk.A00(j5);
                                        if (A003 + A004 <= f8) {
                                            float f9 = intBitsToFloat + f3;
                                            float f10 = A00 + f5;
                                            float f11 = f4 - intBitsToFloat2;
                                            float f12 = A003 + f5;
                                            float f13 = f4 - intBitsToFloat4;
                                            float f14 = f6 - A004;
                                            float f15 = f6 - A002;
                                            float f16 = intBitsToFloat3 + f3;
                                            if (f < f9 && f2 < f10) {
                                                return A00(f, f2, f9, f10, j);
                                            }
                                            if (f < f16 && f2 > f15) {
                                                return A00(f, f2, f16, f15, j4);
                                            }
                                            if (f > f11 && f2 < f12) {
                                                return A00(f, f2, f11, f12, j3);
                                            }
                                            if (f <= f13 || f2 <= f14) {
                                                return true;
                                            }
                                            return A00(f, f2, f13, f14, j5);
                                        }
                                    }
                                }
                            }
                            C60X A005 = C60W.A00();
                            A005.AAG(c137656Ll, C05F.A00);
                            return A02(A005, f, f2);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        if (abstractC119385av instanceof C119405ax) {
            return A02(((C119405ax) abstractC119385av).A00, f, f2);
        }
        throw new RuntimeException();
    }

    public static final boolean A02(C60Y c60y, float f, float f2) {
        C114205Dh c114205Dh = new C114205Dh(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C60X A00 = C60W.A00();
        A00.AA7(c114205Dh, C05F.A00);
        C60X A002 = C60W.A00();
        A002.E2G(c60y, A00, 1);
        Path path = A002.A03;
        boolean isEmpty = path.isEmpty();
        path.reset();
        A00.A03.reset();
        return !isEmpty;
    }
}
