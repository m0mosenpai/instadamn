package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CJN {
    public static final void A00(String str, String str2, C5Tl c5Tl, int i) {
        int i2;
        AbstractC167007dF.A1K(str, str2);
        c5Tl.Enr(-486015089);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1075770847, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsEmpty (FollowRequestsEmpty.kt:19)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 32.0f, 32.0f, 32.0f, 64.0f);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YS.A01(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 16.0f), 96.0f), C5Y7.A00(c5Tl, R.drawable.empty_state_follow, 0), 432, 24, 0L);
            C5WR.A0P(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 14.0f), AbstractC25226BEj.A0e(c5Tl), str, (i2 & 14) | 48, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0n(c5Tl, AbstractC25226BEj.A0c(c5Tl), str2, (i2 >> 3) & 14, 16250, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(413917883);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30195DSa(str, str2, i, 2);
        }
    }
}
