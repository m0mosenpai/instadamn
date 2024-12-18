package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CEk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27565CEk {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        AbstractC167007dF.A1K(modifier, interfaceC16820sZ);
        c5Tl.Enr(-305191923);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1480055972, "com.instagram.barcelona.permalink.ui.component.AppReviewPrompt (AppReviewPrompt.kt:20)");
            }
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            Modifier A02 = AbstractC118635Yc.A02(c5Tl, AbstractC118175Wb.A0E(modifier, 0.0f, 32.0f, 0.0f, 20.0f), AbstractC25225BEi.A0W(0), interfaceC16820sZ);
            InterfaceC1127857k A0Q = AbstractC25227BEk.A0Q(AbstractC118255Wn.A07, c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Q, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            String A002 = C5YD.A00(c5Tl, 2131953645);
            C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
            long j = AbstractC121605fB.A0N;
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 0.0f, 0.0f, 4.0f), A0c, A002, j);
            if (AbstractC25236BEt.A0y(c5Tl, C5YD.A00(c5Tl, 2131953644), j)) {
                C0fH.A00(979994606);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16820sZ, modifier, i, 23);
        }
    }
}
