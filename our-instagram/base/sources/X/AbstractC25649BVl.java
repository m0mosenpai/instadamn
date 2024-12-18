package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.BVl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25649BVl {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C5AH c5ah, InterfaceC16620sF interfaceC16620sF, float f, int i, int i2, long j) {
        long j2;
        float f2 = f;
        long j3 = j;
        C5AH c5ah2 = c5ah;
        Modifier modifier2 = modifier;
        c5Tl.Eno(371850831);
        if ((i2 & 1) != 0) {
            modifier2 = Modifier.A00;
        }
        if ((i2 & 2) != 0) {
            c5ah2 = C5AF.A00;
        }
        if ((i2 & 4) != 0) {
            j3 = C1132359l.A07;
        }
        if ((i2 & 8) != 0) {
            j2 = AbstractC25226BEj.A0G(c5Tl);
        } else {
            j2 = 0;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1295369452, "com.instagram.barcelona.bds.core.BdsSurface (BdsSurface.kt:27)");
        }
        C6L8.A01(null, c5Tl, modifier2, c5ah2, interfaceC16620sF, f2, AbstractC25234BEr.A01(i & 14, i & 112, i) | (i & 3670016), 0, j3, j2);
        if (C0fH.A02()) {
            C0fH.A00(810746905);
        }
        AbstractC25225BEi.A1V(c5Tl, false);
    }
}
