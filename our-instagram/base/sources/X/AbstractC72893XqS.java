package X;

/* renamed from: X.XqS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72893XqS {
    /* JADX WARN: Type inference failed for: r5v1, types: [X.XOQ, X.XZi] */
    public static final XOQ A00(C22853A5w c22853A5w, C8M7 c8m7) {
        char c;
        char c2;
        float f;
        C14360o3.A0B(c8m7, 0);
        Integer num = c8m7.A02;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3 && intValue != 4) {
                        if (intValue == 5) {
                            return new C72234XZl(c22853A5w);
                        }
                    } else {
                        return new C72233XZk();
                    }
                } else {
                    return new XOR();
                }
            } else {
                ?? xoq = new XOQ();
                xoq.A0C = null;
                xoq.A0D = null;
                xoq.A07 = null;
                xoq.A09 = null;
                xoq.A0B = null;
                xoq.A0F = null;
                xoq.A06 = null;
                xoq.A08 = null;
                xoq.A05 = null;
                xoq.A0E = null;
                xoq.A0G = null;
                xoq.A0A = null;
                xoq.A02 = 0.0f;
                xoq.A0H = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
                xoq.A0J = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
                xoq.A01 = 0.0f;
                xoq.A03 = 1.0f;
                xoq.A00 = 0.0f;
                xoq.A0I = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
                float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
                xoq.A0K = fArr;
                xoq.A04 = System.currentTimeMillis();
                int i = c8m7.A00;
                if (i == 702) {
                    A01(xoq);
                    xoq.A01 = 0.2f;
                    f = 1.4f;
                } else {
                    if (i != 703 && i != 705) {
                        if (i == 706) {
                            A01(xoq);
                            xoq.A01 = 0.2f;
                            f = 1.6f;
                        } else {
                            if (i == 707) {
                                A01(xoq);
                                xoq.A01 = 0.2f;
                                xoq.A03 = 1.0f;
                                xoq.A00 = 0.333f;
                                float[] fArr2 = xoq.A0I;
                                fArr2[0] = 10000.0f;
                                fArr2[1] = 10000.0f;
                                c = 2;
                                fArr2[2] = 10000.0f;
                                c2 = 3;
                                fArr2[3] = 0.1f;
                                fArr[0] = 0.0f;
                                fArr[1] = 0.0f;
                                fArr[c] = 0.0f;
                                fArr[c2] = 0.0f;
                                return xoq;
                            }
                            if (i != 709 && i != 710) {
                                return xoq;
                            }
                            A01(xoq);
                            xoq.A01 = 0.0f;
                            xoq.A03 = 0.0f;
                        }
                    } else {
                        A01(xoq);
                        xoq.A01 = 0.2f;
                        xoq.A03 = 1.6f;
                    }
                    xoq.A00 = 0.0f;
                    float[] fArr3 = xoq.A0I;
                    fArr3[0] = 0.0f;
                    fArr3[1] = 0.0f;
                    c = 2;
                    fArr3[2] = 0.0f;
                    c2 = 3;
                    fArr3[3] = 0.0f;
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[c] = 0.0f;
                    fArr[c2] = 0.0f;
                    return xoq;
                }
                xoq.A03 = f;
                xoq.A00 = 0.333f;
                float[] fArr32 = xoq.A0I;
                fArr32[0] = 0.0f;
                fArr32[1] = 0.0f;
                c = 2;
                fArr32[2] = 0.0f;
                c2 = 3;
                fArr32[3] = 0.0f;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[c] = 0.0f;
                fArr[c2] = 0.0f;
                return xoq;
            }
        }
        return new XOQ();
    }

    public static void A01(C72231XZi c72231XZi) {
        c72231XZi.A02 = 1.0f;
        float[] fArr = c72231XZi.A0H;
        fArr[0] = 1.0f;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        float[] fArr2 = c72231XZi.A0J;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.6f;
    }
}
