package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Cfk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28381Cfk {
    public static final void A03(C5Tl c5Tl, C51748MtX c51748MtX, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(c51748MtX, 0);
        AbstractC25233BEq.A0v(1, interfaceC16820sZ, interfaceC16620sF, interfaceC16820sZ2);
        c5Tl.Enr(626002639);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c51748MtX) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-360660215, "com.instagram.aistudio.editor.AiCreationTopicPickerScreen (AiCreationTopicPickerScreen.kt:42)");
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator A1J = AbstractC25226BEj.A1J(c51748MtX.A01);
            int i3 = 0;
            while (A1J.hasNext()) {
                Object next = A1J.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                if (i3 % 2 != 0) {
                    A1E.add(next);
                } else {
                    A1E2.add(next);
                }
                i3 = i4;
            }
            boolean z = c51748MtX.A04;
            Modifier A05 = AbstractC118175Wb.A05(AbstractC25226BEj.A0X(AbstractC25226BEj.A0T(Modifier.A00), AbstractC25226BEj.A09(c5Tl)));
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, A1E2, AbstractC25228BEl.A1U(c5Tl, A1E, AbstractC25226BEj.A1Y(c5Tl, z, AbstractC25227BEk.A1Z(c5Tl, c51748MtX, -1193719296)) | AbstractC25233BEq.A1I(i2), AbstractC25233BEq.A1J(i2)), AbstractC25233BEq.A1K(i2));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new DIF(0, c51748MtX, interfaceC16820sZ, interfaceC16620sF, A1E, interfaceC16820sZ2, A1E2, z);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A01(null, null, null, null, c5Tl, interfaceC118245Wl, A05, (InterfaceC16660sJ) EEc, 196608, 222, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-1646534038);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(c51748MtX, interfaceC16820sZ2, interfaceC16620sF, interfaceC16820sZ, i, 1);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-1923444909);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1842306539, "com.instagram.aistudio.editor.CreatorCardShimmer (AiCreationTopicPickerScreen.kt:217)");
            }
            C1130158n c1130158n = Modifier.A00;
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier Eq3 = c1130158n.Eq3(fillElement);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28487Chf.A05(c5Tl, AbstractC25235BEs.A0J(AbstractC25227BEk.A0J(AbstractC118185Wd.A08(c1130158n, 400.0f), 12.0f)).Eq3(fillElement));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(546205635);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 4);
        }
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(-431909886);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-211700563, "com.instagram.aistudio.editor.TemplateCardsColumnPlaceholder (AiCreationTopicPickerScreen.kt:186)");
            }
            int i2 = 0;
            do {
                C1130158n c1130158n = Modifier.A00;
                Modifier A0A = AbstractC118175Wb.A0A(AbstractC28015CWn.A00(c5Tl, AbstractC25227BEk.A0J(AbstractC25225BEi.A0Q(AbstractC118185Wd.A08(c1130158n, 200.0f)), 12.0f), true), 8.0f, 12.0f);
                InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A0A);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0O, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6LQ.A03(c5Tl, AbstractC25236BEt.A0H(c5Tl, c1130158n, 120.0f), AbstractC43541zP.A01(c5Tl, null, 6));
                c5Tl.ASW();
                i2++;
            } while (i2 < 3);
            if (C0fH.A02()) {
                C0fH.A00(199654932);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 5);
        }
    }

    public static final void A02(C5Tl c5Tl, int i) {
        c5Tl.Enr(1198046736);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1695456444, "com.instagram.aistudio.editor.TemplateCardsColumnShimmer (AiCreationTopicPickerScreen.kt:172)");
            }
            int i2 = 0;
            do {
                C1130158n c1130158n = Modifier.A00;
                FillElement fillElement = AbstractC118185Wd.A02;
                Modifier Eq3 = c1130158n.Eq3(fillElement);
                InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, Eq3);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0Y, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                AbstractC28487Chf.A05(c5Tl, AbstractC25235BEs.A0J(AbstractC25227BEk.A0J(AbstractC118185Wd.A08(c1130158n, 200.0f), 12.0f)).Eq3(fillElement));
                c5Tl.ASW();
                i2++;
            } while (i2 < 3);
            if (C0fH.A02()) {
                C0fH.A00(-1016044981);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 6);
        }
    }
}
