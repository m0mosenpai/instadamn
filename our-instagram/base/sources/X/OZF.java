package X;

import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OZF {
    public static final OZF A00 = new Object();

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_smb_sensitive_event");
        String str2 = userSession.userId;
        C14360o3.A0B(str2, 0);
        A0f.A9K("ig_userid", Long.valueOf(AbstractC167027dH.A03(str2)));
        A0f.AAP("product", "support_diversity_business_sticker_produce");
        AbstractC31171DnF.A1A(A0f, "support_diversity_business_sticker_tray");
        AbstractC31171DnF.A1C(A0f, str);
        A0f.AAP("event_source", DexOptimization.OPT_KEY_CLIENT);
        A0f.Cht();
    }
}
