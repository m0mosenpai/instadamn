package X;

import java.util.List;

/* renamed from: X.BWi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25672BWi {
    public static float A00;
    public static final List A01;

    public static final C51722Yv A00(C51722Yv c51722Yv, float f, float f2, float f3, float f4) {
        float f5 = f2 - f3;
        float A002 = AbstractC25227BEk.A00(f5, f);
        boolean z = true;
        boolean A1O = AbstractC167007dF.A1O((f > f5 ? 1 : (f == f5 ? 0 : -1)));
        boolean A1P = AbstractC25230BEn.A1P((A002 > f4 ? 1 : (A002 == f4 ? 0 : -1)));
        if (f + f4 > f5) {
            z = false;
        }
        if (A1O) {
            f4 = 0.0f;
        } else if (!A1P || !z) {
            f4 = A002;
        }
        A00 = f4;
        return C9CU.A00(c51722Yv, C05F.A0N, 1, AbstractC25229BEm.A0K((int) f4));
    }

    static {
        C09530e4 A0o = AbstractC167007dF.A0o(318, 108);
        Integer A0p = AbstractC25227BEk.A0p();
        A01 = AbstractC16960so.A1Q(A0o, AbstractC167007dF.A0o(258, 80), AbstractC167007dF.A0o(224, 72), AbstractC167007dF.A0o(186, 40), AbstractC167007dF.A0o(94, 28), new C09530e4(24, 24), new C09530e4(A0p, A0p));
    }
}
