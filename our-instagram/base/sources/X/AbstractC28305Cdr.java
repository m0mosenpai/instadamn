package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Cdr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28305Cdr {
    public static final void A02(C5Tl c5Tl, Modifier modifier, C5YL c5yl, C29229CuY c29229CuY, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1410067784);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c29229CuY) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, c5yl);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-815089681, "com.instagram.creation.genai.common.ui.CreationGenAIImage (CreationGenAIImage.kt:49)");
            }
            C6LZ c6lz = new C6LZ(c29229CuY.A00);
            C137026If c137026If = new C137026If(c6lz, AbstractC25236BEt.A08(c6lz.A00));
            c137026If.A00 = 1;
            C6LQ.A0B(c5Tl, modifier2.Eq3(AbstractC118185Wd.A01), c137026If, c5yl, str, ((i3 >> 3) & 112) | ((i3 << 3) & 57344));
            if (C0fH.A02()) {
                C0fH.A00(-1251508302);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUR(c5yl, c29229CuY, modifier2, str, i, i2, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r3 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r13, androidx.compose.ui.Alignment r14, androidx.compose.ui.Modifier r15, X.C5YL r16, X.InterfaceC30812Dgn r17, java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28305Cdr.A00(X.5Tl, androidx.compose.ui.Alignment, androidx.compose.ui.Modifier, X.5YL, X.Dgn, java.lang.String, int, int):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, int i, int i2, long j) {
        int i3;
        long j2 = j;
        Modifier modifier2 = modifier;
        c5Tl.Enr(438447019);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            c5Tl.EnE();
            if ((i & 1) != 0 && !c5Tl.AwS()) {
                c5Tl.Em9();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.A00;
                }
                if ((i2 & 2) != 0) {
                    j2 = C5XL.A00(c5Tl).A11;
                }
            }
            if (AbstractC25227BEk.A1S(c5Tl)) {
                C0fH.A01(-1555659821, "com.instagram.creation.genai.common.ui.CreationGenAIImageLoading (CreationGenAIImage.kt:64)");
            }
            CH6.A00(c5Tl, modifier2.Eq3(AbstractC118185Wd.A01), null, 0, 48, 12, 0L);
            if (C0fH.A02()) {
                C0fH.A00(591738391);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSL(modifier2, i, i2, j2);
        }
    }
}
