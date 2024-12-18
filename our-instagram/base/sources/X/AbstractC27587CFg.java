package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CFg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27587CFg {
    public static final void A00(C5Tl c5Tl, C169277h1 c169277h1, C166047bW c166047bW, C168497fj c168497fj, C115925Mi c115925Mi, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        C5UU ASZ;
        DV6 dv6;
        int i2;
        AbstractC167007dF.A1G(c168497fj, 0, interfaceC16820sZ);
        if (AbstractC25235BEs.A1W(c5Tl, 424844371)) {
            C0fH.A01(-927087978, "com.instagram.comments.mvvm.view.compose.CommentLikeToolTip (CommentLikeTooltip.kt:24)");
        }
        UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
        if (AbstractC28302Cdo.A02(A0u)) {
            i2 = 2131961140;
            AbstractC28302Cdo.A00(A0u);
        } else if (AbstractC28302Cdo.A01(c169277h1, c166047bW, c168497fj, A0u, c115925Mi)) {
            i2 = 2131956480;
            C14360o3.A0B(A0u, 0);
            AbstractC167017dG.A0g(AbstractC166987dD.A0x(A0u), "seen_share_comment_nux_count").apply();
        } else {
            interfaceC16820sZ.invoke();
            if (C0fH.A02()) {
                C0fH.A00(1608636933);
            }
            ASZ = c5Tl.ASZ();
            if (ASZ == null) {
                return;
            }
            dv6 = new DV6(c168497fj, c115925Mi, c166047bW, c169277h1, interfaceC16820sZ, i, 0, z);
            ASZ.A06 = dv6;
        }
        AbstractC28388Cfr.A03(c5Tl, C72.A02, null, C5YD.A00(c5Tl, i2), interfaceC16820sZ, ((i >> 9) & 112) | 384 | ((i >> 6) & 7168), 2032, 0L, z);
        if (C0fH.A02()) {
            C0fH.A00(-1127198510);
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            dv6 = new DV6(c168497fj, c115925Mi, c166047bW, c169277h1, interfaceC16820sZ, i, 1, z);
            ASZ.A06 = dv6;
        }
    }
}
