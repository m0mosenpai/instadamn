package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CXL {
    public static final void A01(C5Tl c5Tl, C45126Jxv c45126Jxv, int i) {
        int i2;
        C14360o3.A0B(c45126Jxv, 0);
        c5Tl.Enr(489306567);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c45126Jxv) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(76631682, "com.instagram.aistudio.editor.AiPreparationScreen (AiPreparationScreen.kt:48)");
            }
            List A1Q = AbstractC16960so.A1Q(C5YD.A00(c5Tl, 2131952697), C5YD.A00(c5Tl, 2131952699), C5YD.A00(c5Tl, 2131952698), C5YD.A00(c5Tl, 2131952696));
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 2108263504);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new C5Y1(AbstractC118445Xg.A05, 0, null);
                c5Tl.FBy(A0q);
            }
            C5Y1 c5y1 = (C5Y1) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String username = C17060sy.A01.A01(AbstractC25228BEl.A0u(c5Tl)).getUsername();
            C0eB c0eB = C0eB.A00;
            boolean A1X = AbstractC25232BEp.A1X(c5Tl, c5y1, A1Q, 2108269246);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = new MCH(c5y1, A1Q, (InterfaceC23621Ds) null, 23);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc, c0eB, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier Eq3 = c1130158n.Eq3(AbstractC118185Wd.A00);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            A00(c5Tl, 0);
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n.Eq3(fillElement), 46.0f, 32.0f, 46.0f, 0.0f);
            C6ID A03 = AbstractC118255Wn.A03(C118195Wf.A05, 20.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            InterfaceC1127857k A012 = AbstractC119595bH.A01(A03, c5Tl, interfaceC118245Wl);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A012, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            AbstractC27526CCw.A00(c5Tl, (ImageUrl) c45126Jxv.A00, c45126Jxv.A02, null, C5YD.A00(c5Tl, 2131952700), username, null, 0.6f, 1597824, 160, false, false);
            c5Tl.ASW();
            Modifier Eq32 = c6gm.A00(c1130158n, true).Eq3(fillElement);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(A0K);
            Modifier A014 = C5X3.A01(c5Tl, Eq32);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0a, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            AbstractC28284CdW.A02(c5Tl, null, AbstractC118175Wb.A0E(c1130158n, 32.0f, 0.0f, 32.0f, 0.0f), A1Q.get(AbstractC166987dD.A0H(c5y1.A04.getValue())), "animated_content", DKL.A00, null, CM1.A00, 1597872, 40);
            c5Tl.ASW();
            C5WR.A0Z(c5Tl, c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A0E(c1130158n, 32.0f, 0.0f, 32.0f, 12.0f)), AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131952695), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2045019129);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, c45126Jxv, i, 10);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(-1467207857);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(252072375, "com.instagram.aistudio.editor.GradientProgressBar (AiPreparationScreen.kt:112)");
            }
            long j = C5XL.A00(c5Tl).A0Q;
            long j2 = C5XL.A00(c5Tl).A0J;
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1651225443);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.1f));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            InterfaceC74963Ym A02 = AbstractC28454Ch4.A02(BHA.A00(DKM.A00), c5Tl, null, AbstractC25231BEo.A03(interfaceC74953Yl), 3120, 20);
            C0eB c0eB = C0eB.A00;
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1651208085);
            if (A0q2 == obj) {
                A0q2 = new MW8(interfaceC74953Yl, null, 42);
                c5Tl.FBy(A0q2);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, A0q2, c0eB, false);
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC118185Wd.A08(Modifier.A00, 3.0f));
            c5Tl.Eno(-1651204403);
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, A02, c5Tl.AH3(j), c5Tl.AH3(j2));
            Object EEc = c5Tl.EEc();
            if (A1V || EEc == obj) {
                EEc = new MI4(A02, j, 0, j2);
                c5Tl.FBy(EEc);
            }
            AbstractC119685bS.A00(c5Tl, AbstractC25233BEq.A0A(A0K, A0Q, EEc));
            if (C0fH.A02()) {
                C0fH.A00(278766173);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30494Dbd.A01(ASZ, i, 7);
        }
    }
}
