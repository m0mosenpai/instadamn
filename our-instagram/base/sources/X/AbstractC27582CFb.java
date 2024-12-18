package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CFb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27582CFb {
    public static final void A00(C5Tl c5Tl, Modifier modifier, MUW muw, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C2DB A00;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1K(muw, interfaceC16820sZ);
        c5Tl.Enr(-411504457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, muw) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1457084794, "com.instagram.comments.mvvm.view.compose.CTA (CTA.kt:18)");
            }
            Alignment alignment = C118195Wf.A06;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A002, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String str = muw.A02;
            ImageUrl imageUrl = (ImageUrl) muw.A01;
            c5Tl.Eno(773834505);
            C1132359l c1132359l = null;
            if (imageUrl == null) {
                A00 = null;
            } else {
                A00 = AbstractC43541zP.A00(c5Tl, imageUrl);
            }
            C117505Tk.A0L(c117505Tk, false);
            String str2 = muw.A03;
            if (((Number) muw.A00) != null) {
                c1132359l = AbstractC25227BEk.A0O(r0.intValue());
            }
            CGX.A00(c5Tl, modifier2, c1132359l, A00, str, str2, interfaceC16820sZ, (i3 & 112) | 4096 | (i3 & 896), 32, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-618511718);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 17, muw, interfaceC16820sZ, modifier2);
        }
    }
}
