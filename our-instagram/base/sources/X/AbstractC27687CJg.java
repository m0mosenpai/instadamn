package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1;

/* renamed from: X.CJg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27687CJg {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, long j) {
        int i3;
        AbstractC167007dF.A1E(interfaceC16820sZ, 0, str);
        AbstractC167007dF.A1G(str2, 4, userSession);
        AbstractC167007dF.A1H(interfaceC11380iw, 6, modifier);
        c5Tl.Enr(1929941123);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0F(c5Tl, j);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, str2);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, userSession);
        }
        if ((1572864 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0N(c5Tl, interfaceC11380iw);
        }
        if ((12582912 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0Y(c5Tl, modifier);
        }
        if ((4793491 & i3) == 4793490 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(915714062, "com.instagram.opal.impl.ui.OpalTeaseAnimation (OpalTeaseAnimation.kt:34)");
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) C6M6.A00(c5Tl, null, DDW.A00, new Object[0], 3072, 6);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2025862286);
            Object obj = C5UI.A00;
            C5Y1 c5y1 = (C5Y1) AbstractC25236BEt.A0W(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C0eB c0eB = C0eB.A00;
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c5y1, AbstractC25233BEq.A1X(c5Tl, userSession, interfaceC11380iw, AbstractC25227BEk.A1Y(c5Tl, interfaceC74953Yl, 2025864783) | AbstractC167007dF.A1P(i3 & 7168, C3OO.FLAG_MOVED), AbstractC25234BEr.A1W(i3))) | AbstractC25233BEq.A1I(i3) | AbstractC25228BEl.A1R(i3);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = new OpalTeaseAnimationKt$OpalTeaseAnimation$1$1(c5y1, interfaceC74953Yl, interfaceC11380iw, userSession, str, str2, null, interfaceC16820sZ, i);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc, c0eB, false);
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                C5Y2 c5y2 = c5y1.A04;
                AbstractC28397Cg3.A00(c5Tl, modifier, AbstractC25231BEo.A01(c5y2), AbstractC25231BEo.A01(c5y2), ((i3 >> 3) & 112) | 3072 | ((i3 >> 15) & 896), 0, j, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(1631444823);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DWU(userSession, interfaceC16820sZ, modifier, interfaceC11380iw, str, str2, i2, i, 1, j);
        }
    }
}
