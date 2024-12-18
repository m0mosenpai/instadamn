package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CXh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28033CXh {
    public static final void A00(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        C14360o3.A0B(modifier, 0);
        c5Tl.Enr(-595744493);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-282050137, "com.instagram.barcelona.location.ui.PinIcon (LocationTag.kt:43)");
            }
            C5YS.A02(c5Tl, modifier, C5Y7.A00(c5Tl, R.drawable.barcelona_location_outline_12, 0), ((i2 << 6) & 896) | 48, AbstractC25226BEj.A0L(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(282436083);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, modifier, i, 23);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C118125Vw A00;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, str, interfaceC16820sZ);
        c5Tl.Enr(480201501);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1143084675, "com.instagram.barcelona.location.ui.LocationTag (LocationTag.kt:21)");
            }
            Modifier A02 = AbstractC118635Yc.A02(c5Tl, modifier2, AbstractC25225BEi.A0W(0), interfaceC16820sZ);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            A00 = C118125Vw.A00(null, null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, 0, 0, 0, 16777213, 0L, AbstractC118155Vz.A01(13), 0L, 0L);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            C5WR.A0M(c5Tl, c6l0.FE5(c1130158n, 1.0f, false), A00, str, i3 & 14, A0M);
            A00(c5Tl, AbstractC25227BEk.A0K(c1130158n, 1.0f), 6);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(111733719);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30222DTb(modifier2, interfaceC16820sZ, str, i2, i, A1R ? 1 : 0);
        }
    }
}
