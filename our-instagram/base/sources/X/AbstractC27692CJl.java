package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CJl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27692CJl {
    public static final void A00(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ3 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ4 = interfaceC16820sZ;
        AbstractC167007dF.A1F(modifier, 0, interfaceC16660sJ);
        c5Tl.Enr(-133241998);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ4);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((46811 & i3) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ4 = DDZ.A00;
            }
            if (i5 != 0) {
                interfaceC16820sZ3 = C29808DDa.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1741712776, "com.instagram.profile.fragment.ProfileMyWeekNuxContent (ProfileMyWeekNuxContent.kt:33)");
            }
            InterfaceC1127857k A0D = AbstractC25233BEq.A0D(c5Tl, i3 & 14);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0D, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier Eq3 = c1130158n.Eq3(fillElement);
            int i6 = i3 >> 9;
            AbstractC27533CDd.A00(c5Tl, Eq3, imageUrl, interfaceC16660sJ, ((i3 >> 3) & 14) | 3456 | (i6 & 112), 0, false);
            AbstractC119685bS.A00(c5Tl, AbstractC25226BEj.A0X(AbstractC118185Wd.A08(c1130158n, 1.0f).Eq3(fillElement), AbstractC25226BEj.A0K(c5Tl)));
            C6GE.A05(c5Tl, AbstractC118175Wb.A0E(AbstractC118175Wb.A0A(Eq3, 16.0f, 0.0f), 0.0f, 16.0f, 0.0f, 0.0f), AbstractC25225BEi.A0u(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131968143), interfaceC16820sZ4, ((i3 >> 6) & 14) | 1573248);
            C6GE.A05(c5Tl, AbstractC118175Wb.A08(Eq3, 16.0f), C6GA.A00(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131968142), interfaceC16820sZ3, (i6 & 14) | 1573248);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1610624456);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC16660sJ, interfaceC16820sZ3, imageUrl, interfaceC16820sZ4, modifier, i, i2, 13);
        }
    }
}
