package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CXk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28036CXk {
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r32, androidx.compose.ui.Modifier r33, com.instagram.api.schemas.LineType r34, X.InterfaceC132185xw r35, X.C38641Gyi r36, X.C25982BeW r37, X.InterfaceC16820sZ r38, int r39, int r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28036CXk.A00(X.5Tl, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.5xw, X.Gyi, X.BeW, X.0sZ, int, int, boolean):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, String str, String str2, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        c5Tl.Enr(-333548245);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(111453379, "com.instagram.barcelona.sponsored.ui.AdMetadata (AdCard.kt:143)");
            }
            if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                if (C0fH.A02()) {
                    C0fH.A00(-612604237);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 3;
                ASZ.A06 = new C30489DbY(modifier, str, str2, i, i3);
            }
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A01(4.0f), c5Tl, C118195Wf.A02, AbstractC25228BEl.A01(((i2 >> 6) & 14) | 48));
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(2129682527);
            if (str != null && str.length() != 0) {
                C5WR.A0M(c5Tl, AbstractC25228BEl.A0W(), AbstractC25225BEi.A0Y(c5Tl), str, (i2 & 14) | 48, AbstractC25226BEj.A0M(c5Tl));
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(2129692557);
            if (str2 != null && str2.length() != 0) {
                C5WR.A0F(c5Tl, AbstractC25228BEl.A0W(), AbstractC25226BEj.A0c(c5Tl), str2, 2, 2, AbstractC25225BEi.A03(i2), AbstractC25226BEj.A0G(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-496727852);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 4;
            ASZ.A06 = new C30489DbY(modifier, str, str2, i, i3);
        }
    }
}
