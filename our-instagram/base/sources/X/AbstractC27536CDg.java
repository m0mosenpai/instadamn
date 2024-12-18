package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CDg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27536CDg {
    public static final void A00(C5Tl c5Tl, Modifier modifier, ImageUrl imageUrl, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AbstractC167017dG.A1R(interfaceC16660sJ, interfaceC16660sJ2);
        c5Tl.Enr(-1672106423);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, imageUrl);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1013613691, "com.instagram.archive.updateshub.UpdatesHubHeaderNux (UpdatesHubHeaderNux.kt:31)");
            }
            InterfaceC1127857k A0M = AbstractC25236BEt.A0M(c5Tl, C118195Wf.A00, i3);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            AbstractC27534CDe.A00(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 28.0f), imageUrl, interfaceC16660sJ, (i3 & 112) | 6 | (i3 & 896));
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131976303);
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 8.0f), C5XL.A01(c5Tl).A04, A002, AbstractC25226BEj.A0G(c5Tl));
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131976301);
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 24.0f), AbstractC25226BEj.A0c(c5Tl), A003, AbstractC25226BEj.A0G(c5Tl));
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131976302);
            Modifier A0E = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 12.0f);
            boolean z = false;
            C25267BGf A02 = C6GA.A00.A02(c5Tl);
            c5Tl.Eno(-1988652121);
            int i5 = i3 & 7168;
            if (i5 == 2048) {
                z = true;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = new C50162MDp(interfaceC16660sJ2, 15);
                c5Tl.FBy(EEc);
            }
            C6GE.A02(c5Tl, A0E, A02, A004, AbstractC25225BEi.A1A(c117505Tk, EEc, false));
            String A005 = AbstractC136736Hc.A00(c5Tl, 2131968142);
            Modifier A0E2 = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 28.0f);
            C6GB A006 = C6GA.A00(c5Tl);
            boolean A1S = AbstractC25229BEm.A1S(c5Tl, -1988642840, i5, C3OO.FLAG_MOVED);
            Object EEc2 = c5Tl.EEc();
            if (A1S || EEc2 == C5UI.A00) {
                EEc2 = new C50162MDp(interfaceC16660sJ2, 16);
                c5Tl.FBy(EEc2);
            }
            C6GE.A02(c5Tl, A0E2, A006, A005, AbstractC25225BEi.A1A(c117505Tk, EEc2, false));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(812500279);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC16660sJ, interfaceC16660sJ2, modifier2, imageUrl, i, i2, 6);
        }
    }
}
