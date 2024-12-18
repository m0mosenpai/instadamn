package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.Iterator;

/* renamed from: X.CCs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27522CCs {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(527062864);
        if ((i & 6) == 0) {
            i = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        }
        if ((i & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1678040200, "com.instagram.aistudio.editor.UpdatePublicAiConfirmationScreen (AiUpdatePublicStatusConfirmationScreen.kt:26)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, A0T);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A022, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A00;
            InterfaceC1127857k A023 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl2, 48);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C5WR.A0x(c5Tl, AbstractC25226BEj.A0d(c5Tl), C5YD.A00(c5Tl, 2131952842), AbstractC25226BEj.A0G(c5Tl));
            String A003 = C5YD.A00(c5Tl, 2131952841);
            C5WR.A0T(c5Tl, AbstractC118175Wb.A0A(c1130158n, 30.0f, 16.0f), AbstractC25226BEj.A0c(c5Tl), A003, AbstractC25226BEj.A0G(c5Tl));
            c5Tl.ASW();
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, AbstractC16960so.A1Q(2131952837, 2131952838, 2131952839), -728604819);
            while (A0x.hasNext()) {
                AbstractC28474ChS.A02(c5Tl, C5Y7.A00(c5Tl, R.drawable.primary_text_bullet_point, 0), C26177Bi2.A00(c5Tl, AbstractC167007dF.A0B(A0x)));
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC28506Chz.A00(c5Tl, c6gm.AB6(interfaceC118245Wl2, c1130158n), C5YD.A00(c5Tl, 2131952840), C5YD.A00(c5Tl, 2131956564), null, interfaceC16820sZ, null, (i << 3) & 112, 23544);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            C0eB c0eB = C0eB.A00;
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, AJX, -728581550);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new MW8(AJX, null, 44);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc, c0eB, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-421875842);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 12);
        }
    }
}
