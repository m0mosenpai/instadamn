package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CDf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27535CDf {
    public static final void A00(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        C14360o3.A0B(modifier, 0);
        c5Tl.Enr(1238903169);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2033080416, "com.instagram.archive.updateshub.UpdatesHubEmptyState (UpdatesHubEmptyState.kt:24)");
            }
            InterfaceC1127857k A0M = AbstractC25236BEt.A0M(c5Tl, C118195Wf.A00, i2);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C1130158n c1130158n = Modifier.A00;
            C5YS.A01(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 16.0f), C5Y7.A00(c5Tl, R.drawable.instagram_users_outline_96, 0), 432, 24, 0L);
            C5WR.A0S(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 12.0f), C5XL.A01(c5Tl).A04, "No Lately stories to show", AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0P(c5Tl, AbstractC25226BEj.A0T(c1130158n), AbstractC25226BEj.A0c(c5Tl), "When followers you follow back share stories from the last 7 days to their Lately, you’ll see them here.", 54, AbstractC25226BEj.A0G(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2124035330);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, modifier, i, 18);
        }
    }
}
