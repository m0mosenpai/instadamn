package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LE0 {
    public final C18920wW A00;

    public LE0(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC31176DnK.A0O(userSession, "direct_thread_iab_interstitial");
    }

    public static final void A00(LE0 le0, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(le0.A00, "messaging_browser_interstitial");
        if (A0f.isSampled()) {
            A0f.AAP("interstitial_event_name", str);
            A0f.Cht();
        }
    }
}
