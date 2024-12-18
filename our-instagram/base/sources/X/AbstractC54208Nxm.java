package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nxm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54208Nxm {
    public static final void A00(UserSession userSession, String str, String str2, boolean z) {
        String valueOf;
        EnumC222416a A0I = AbstractC31178DnM.A0T(userSession).A0I();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_fb_xposting_toggle");
        if (A0f.isSampled()) {
            A0f.AAP("toggle_name", "ig_fb_xposting_setting_option");
            A0f.AAP("event_name", str);
            A0f.AAP("toggle_surface", "ig_feed_composer");
            if (A0I == null) {
                valueOf = "unknown";
            } else {
                valueOf = String.valueOf(A0I.A00);
            }
            A0f.A7v("toggle_state", AbstractC31173DnH.A0e(A0f, "account_type", valueOf, z));
            A0f.AAP("toggle_context", str2);
            A0f.Cht();
        }
    }
}
