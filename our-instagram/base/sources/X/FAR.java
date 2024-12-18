package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FAR {
    public static final void A00(UserSession userSession, String str, String str2) {
        boolean A1X = AbstractC167007dF.A1X(AbstractC166997dE.A0Y(userSession).A0M(), C05F.A0C);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_reels_inspiration_acr_upsell");
        if (A0f.isSampled()) {
            A0f.AAP("upsell_name", "story_highlight_acr_upsell");
            A0f.AAP("event_name", str);
            A0f.A7v("is_private", AbstractC31173DnH.A0e(A0f, "upsell_surface", "self_profile", A1X));
            A0f.AAP(MSV.A00(1628), str2);
            A0f.Cht();
        }
    }
}
