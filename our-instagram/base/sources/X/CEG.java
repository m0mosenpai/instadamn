package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ThreadHeaderStyle;

/* loaded from: classes5.dex */
public abstract class CEG {
    public static final void A00(C5Tl c5Tl, Modifier modifier, ThreadHeaderStyle threadHeaderStyle, String str, int i, int i2) {
        int i3;
        long j;
        C118125Vw A0c;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-105960312);
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
            i3 |= AbstractC25232BEp.A0S(c5Tl, threadHeaderStyle);
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
                C0fH.A01(-1563536548, "com.instagram.barcelona.feed.post.ui.PostContainerHeader (PostContainerHeader.kt:22)");
            }
            boolean A1X = AbstractC167007dF.A1X(threadHeaderStyle, ThreadHeaderStyle.A04);
            Modifier A04 = AbstractC118175Wb.A04(C6HP.A00(AbstractC25232BEp.A0y(c5Tl, modifier2), 0.0f, false));
            InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A04);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Modifier AB6 = C6GM.A00.AB6(interfaceC118245Wl, Modifier.A00);
            if (A1X) {
                j = AbstractC25230BEn.A0O(c5Tl, -53818136);
            } else {
                j = AbstractC25227BEk.A0g(c5Tl, -53817110).A0t;
            }
            C117505Tk.A0L(c117505Tk, false);
            long A012 = AbstractC118155Vz.A01(14);
            if (A1X) {
                c5Tl.Eno(-53812916);
                A0c = AbstractC25226BEj.A0h(c5Tl);
            } else {
                c5Tl.Eno(-53811646);
                A0c = AbstractC25226BEj.A0c(c5Tl);
            }
            C117505Tk.A0L(c117505Tk, false);
            C5WR.A0K(c5Tl, AB6, A0c, str, (i3 & 14) | 3072, 16240, j, A012);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-665471572);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30222DTb(threadHeaderStyle, modifier2, str, i2, i, 0);
        }
    }
}