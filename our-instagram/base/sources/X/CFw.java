package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CFw {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC166407c9 interfaceC166407c9, C25814BbV c25814BbV, InterfaceC166367c5 interfaceC166367c5, InterfaceC30989Djo interfaceC30989Djo, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC25233BEq.A0v(0, interfaceC166367c5, interfaceC30989Djo, c25814BbV);
        c5Tl.Enr(-1970379759);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC166367c5) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, interfaceC166407c9);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, interfaceC30989Djo);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, c25814BbV);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((46811 & i3) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1988380505, "com.instagram.comments.mvvm.view.compose.composer.ComposerContainer (ComposerContainer.kt:24)");
            }
            int i5 = (i3 >> 12) & 14;
            InterfaceC1127857k A0D = AbstractC25233BEq.A0D(c5Tl, i5);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0D, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28386Cfp.A01(C6GM.A00, c5Tl, c25814BbV, interfaceC166367c5, ((((i5 >> 6) & 112) | 6) & 14) | ((i3 << 3) & 112) | ((i3 >> 3) & 896));
            CGA.A00(c5Tl, AbstractC25225BEi.A0Q(AbstractC118185Wd.A01(C118195Wf.A04, Modifier.A00)), interfaceC30989Djo, new C50627MWo(interfaceC166407c9, interfaceC166367c5), ((i3 >> 6) & 14) | 384, 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(177380527);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC30989Djo, c25814BbV, interfaceC166407c9, modifier2, interfaceC166367c5, i, i2, 4);
        }
    }
}
