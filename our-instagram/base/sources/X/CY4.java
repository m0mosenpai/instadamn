package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import com.facebook.R;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes5.dex */
public abstract class CY4 {
    @Deprecated(message = "This component is deprecated. Use FacePile instead.", replaceWith = @ReplaceWith(expression = "FacePile", imports = {"com.instagram.compose.ui.facepile"}))
    public static final void A01(C5Tl c5Tl, List list, int i) {
        int i2;
        C5UU ASZ;
        int i3;
        C14360o3.A0B(list, 0);
        c5Tl.Enr(2070366453);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(152393839, "com.instagram.compose.ui.facepiledeprecated.FacePileDeprecated (FacePileDeprecated.kt:42)");
            }
            if (list.size() != 2) {
                if (C0fH.A02()) {
                    C0fH.A00(1004397817);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 36;
                C30499Dbi.A01(ASZ, list, i, i3);
            }
            long A00 = AbstractC119585bG.A00(c5Tl, AbstractC53242c7.A02(AbstractC25228BEl.A0K(c5Tl)));
            C1130158n c1130158n = Modifier.A00;
            Modifier A08 = AbstractC118175Wb.A08(AbstractC25226BEj.A0X(c1130158n, A00), 1.0f);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A08);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A002, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A04;
            C5XJ.A00(c5Tl, A01, interfaceC16620sF3);
            C119645bN c119645bN = C119645bN.A00;
            Modifier Eq3 = c1130158n.Eq3(new ZIndexElement(1.0f));
            InterfaceC1127857k A004 = C5XX.A00(alignment, false);
            int A005 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A004, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A012, interfaceC16620sF3);
            A00(c5Tl, AbstractC25225BEi.A0P(c119645bN, c1130158n), (C9C) AbstractC001800i.A0J(list), 0, 0);
            C6LQ.A03(c5Tl, c119645bN.AB5(C118195Wf.A0B, AbstractC25231BEo.A0R(c1130158n, 104.0f)), new C25770Ba9(A00));
            c5Tl.ASW();
            Modifier AB5 = c119645bN.AB5(C118195Wf.A0A, AbstractC118175Wb.A0E(c1130158n, 90.0f, 0.0f, 0.0f, 0.0f));
            InterfaceC1127857k A006 = C5XX.A00(alignment, false);
            int A007 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, AB5);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A006, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A013, interfaceC16620sF3);
            A00(c5Tl, null, (C9C) AbstractC001800i.A0L(list), 0, 2);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1225864789);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 37;
            C30499Dbi.A01(ASZ, list, i, i3);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, C9C c9c, int i, int i2) {
        int i3;
        C5UU ASZ;
        int i4;
        c5Tl.Enr(-772165944);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c9c) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1158068328, "com.instagram.compose.ui.facepiledeprecated.RenderProfileImage (FacePileDeprecated.kt:67)");
            }
            if (c9c == null) {
                if (C0fH.A02()) {
                    C0fH.A00(-39798052);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i4 = 26;
                ASZ.A06 = C30504Dbn.A01(c9c, modifier, i2, i, i4);
            }
            C6KV A00 = C6G9.A00(1.0f, AbstractC119585bG.A00(c5Tl, AbstractC53242c7.A0H(AbstractC25228BEl.A0K(c5Tl), R.attr.igds_color_photo_border)));
            if (c9c instanceof C27104BxT) {
                C2DC c2dc = ((C27104BxT) c9c).A00;
                Modifier A0C = AbstractC118185Wd.A0C(modifier.Eq3(new ZIndexElement(2.0f)), 96.0f);
                C5WI c5wi = C5WF.A00;
                C6LQ.A03(c5Tl, C6L7.A01(A00, C6L2.A01(A0C, c5wi), c5wi), c2dc);
                if (C0fH.A02()) {
                    C0fH.A00(681640734);
                }
            } else {
                throw B4Z.A00();
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i4 = 27;
            ASZ.A06 = C30504Dbn.A01(c9c, modifier, i2, i, i4);
        }
    }
}
