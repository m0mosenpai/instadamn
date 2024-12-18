package androidx.compose.animation.core;

import X.AbstractC118405Xc;
import X.AbstractC118445Xg;
import X.AbstractC137336Kc;
import X.C0eB;
import X.C118475Xj;
import X.C12W;
import X.C1JX;
import X.C25251BFl;
import X.C57B;
import X.C5Y2;
import X.C5Y6;
import X.C62C;
import X.C62D;
import X.C62T;
import X.C6MY;
import X.C9F3;
import X.InterfaceC118485Xk;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;

/* loaded from: classes3.dex */
public abstract class SuspendAnimationKt {
    public static final Object A02(C5Y6 c5y6, C5Y2 c5y2, Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        long j;
        Object value = c5y2.A05.getValue();
        C62C c62c = new C62C(c5y6, c5y2.A02, c5y2.A04, value, obj);
        if (z) {
            j = c5y2.A01;
        } else {
            j = Long.MIN_VALUE;
        }
        Object A01 = A01(c62c, c5y2, interfaceC23621Ds, interfaceC16660sJ, j);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    public static final Object A04(C5Y2 c5y2, C6MY c6my, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        long j;
        C25251BFl c25251BFl = new C25251BFl(c5y2.A02, c6my, c5y2.A04, c5y2.A05.getValue());
        if (z) {
            j = c5y2.A01;
        } else {
            j = Long.MIN_VALUE;
        }
        Object A01 = A01(c25251BFl, c5y2, interfaceC23621Ds, interfaceC16660sJ, j);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    public static final void A05(C62D c62d, C62T c62t, C5Y2 c5y2, InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        long j2;
        if (f == 0.0f) {
            j2 = c62d.Azo();
        } else {
            j2 = ((float) (j - c62t.A03)) / f;
        }
        c62t.A01 = j;
        c62t.A06.Egh(c62d.CEW(j2));
        c62t.A02 = c62d.CEl(j2);
        if (c62d.CUo(j2)) {
            c62t.A00 = c62t.A01;
            c62t.A05.Egh(false);
        }
        A06(c62t, c5y2);
        interfaceC16660sJ.invoke(c62t);
    }

    public static final float A00(C12W c12w) {
        C57B c57b = (C57B) c12w.get(C57B.A00);
        if (c57b != null) {
            float BqR = c57b.BqR();
            if (BqR < 0.0f) {
                throw new IllegalStateException("negative scale factor");
            }
            return BqR;
        }
        return 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: CancellationException -> 0x011a, TryCatch #0 {CancellationException -> 0x011a, blocks: (B:15:0x0043, B:16:0x00c5, B:18:0x00da, B:20:0x0100, B:23:0x010e, B:29:0x0061, B:31:0x007e, B:32:0x008d, B:33:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5, types: [X.0ps] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0117 -> B:16:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C62D r24, X.C5Y2 r25, X.InterfaceC23621Ds r26, X.InterfaceC16660sJ r27, long r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.62D, X.5Y2, X.1Ds, X.0sJ, long):java.lang.Object");
    }

    public static final Object A03(C5Y6 c5y6, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, float f, float f2, float f3) {
        InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A02;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        InterfaceC16660sJ interfaceC16660sJ = ((C118475Xj) interfaceC118485Xk).A01;
        AbstractC118405Xc abstractC118405Xc = (AbstractC118405Xc) interfaceC16660sJ.invoke(f6);
        if (abstractC118405Xc == null) {
            abstractC118405Xc = AbstractC137336Kc.A01((AbstractC118405Xc) interfaceC16660sJ.invoke(f4));
        }
        Object A01 = A01(new C62C(c5y6, abstractC118405Xc, interfaceC118485Xk, f4, f5), new C5Y2(abstractC118405Xc, interfaceC118485Xk, f4, Long.MIN_VALUE, Long.MIN_VALUE, false), interfaceC23621Ds, new C9F3(0, interfaceC118485Xk, interfaceC16620sF), Long.MIN_VALUE);
        C1JX c1jx = C1JX.A02;
        if (A01 != c1jx) {
            A01 = C0eB.A00;
        }
        if (A01 != c1jx) {
            return C0eB.A00;
        }
        return A01;
    }

    public static final void A06(C62T c62t, C5Y2 c5y2) {
        c5y2.A05.Egh(c62t.A06.getValue());
        AbstractC118405Xc abstractC118405Xc = c5y2.A02;
        AbstractC118405Xc abstractC118405Xc2 = c62t.A02;
        int A01 = abstractC118405Xc.A01();
        for (int i = 0; i < A01; i++) {
            abstractC118405Xc.A03(i, abstractC118405Xc2.A00(i));
        }
        c5y2.A00 = c62t.A00;
        c5y2.A01 = c62t.A01;
        c5y2.A03 = ((Boolean) c62t.A05.getValue()).booleanValue();
    }
}
