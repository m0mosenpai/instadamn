package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CWf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28008CWf {
    public static final void A00(C28252Ccw c28252Ccw, C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        C5UU ASZ;
        int i4;
        Modifier modifier2 = modifier;
        c5Tl.Enr(645832757);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c28252Ccw) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-846606578, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:63)");
            }
            C92 c92 = (C92) c28252Ccw.A00.getValue();
            if (!(c92 instanceof BZU)) {
                if (C0fH.A02()) {
                    C0fH.A00(-1780568114);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 0;
                ASZ.A06 = new C30492Dbb(c28252Ccw, interfaceC16820sZ, modifier2, interfaceC16660sJ, i, i2, i4);
            }
            boolean AH4 = c5Tl.AH4(c92);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = new C28870Coe(AbstractC113765Bo.A01(((BZU) c92).A00));
                c5Tl.FBy(EEc);
            }
            AbstractC28453Ch3.A03(c5Tl, modifier2, (C28870Coe) EEc, interfaceC16820sZ, interfaceC16660sJ, AbstractC25229BEm.A05(i3, i3 & 112), 0);
            if (C0fH.A02()) {
                C0fH.A00(-413824949);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 1;
            ASZ.A06 = new C30492Dbb(c28252Ccw, interfaceC16820sZ, modifier2, interfaceC16660sJ, i, i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C28252Ccw r14, X.C5Tl r15, androidx.compose.ui.Modifier r16, X.InterfaceC16820sZ r17, X.InterfaceC16660sJ r18, X.InterfaceC16620sF r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28008CWf.A01(X.Ccw, X.5Tl, androidx.compose.ui.Modifier, X.0sZ, X.0sJ, X.0sF, int, int, boolean):void");
    }
}
