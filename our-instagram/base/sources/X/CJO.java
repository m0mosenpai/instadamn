package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CJO {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-584648997);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1090813897, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsError (FollowRequestsError.kt:19)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, -337347416);
            C117505Tk.A0L(c117505Tk, false);
            boolean A1X = AbstractC25230BEn.A1X(AbstractC27467CAn.A00(c5xo, c5Tl, 6));
            int i3 = R.drawable.loadmore_icon_refresh;
            if (A1X) {
                i3 = R.drawable.loadmore_icon_refresh_pressed;
            }
            C5YS.A07(c5Tl, C5XR.A04(c5xo, AbstractC25225BEi.A0P(c119645bN, c1130158n), interfaceC16820sZ), C5Y7.A00(c5Tl, i3, 0), null, C5YD.A00(c5Tl, 2131972568), 0, 24, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(269891138);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, interfaceC16820sZ, i, 26);
        }
    }
}
