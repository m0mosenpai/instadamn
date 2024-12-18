package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8mC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196218mC {
    public static final boolean A00(UserSession userSession) {
        InterfaceC19630xq interfaceC19630xq;
        String str;
        C14360o3.A0B(userSession, 0);
        if (C196018lq.A00(userSession).isCrossPostingSettingsPlatformizationReadEnabled()) {
            return C196018lq.A00(userSession).getDataProvider().B5Z();
        }
        if (AbstractC196078lx.A02(userSession)) {
            interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
            str = "PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING";
        } else {
            interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            str = "auto_cross_post_to_facebook_feed";
        }
        return interfaceC19630xq.getBoolean(str, false);
    }

    public final void A01(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        String str2;
        boolean z3;
        boolean z4;
        InterfaceC19630xq interfaceC19630xq;
        String str3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C131995xZ A00 = C196068lw.A00(userSession).A00(C196208mB.A02);
        if (num == null) {
            num = A00.A01;
        }
        Integer num2 = C05F.A00;
        if (num == num2) {
            str2 = "PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING";
            z3 = false;
            z4 = AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING", false);
            interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
        } else {
            str2 = "auto_cross_post_to_facebook_feed";
            z3 = false;
            z4 = AbstractC23021Ah.A00(userSession).A01.getBoolean("auto_cross_post_to_facebook_feed", false);
            interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        }
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E77(str2, z);
        ARD.apply();
        if (z4 != z) {
            AbstractC46542Bs.A00(userSession).A04(z);
            if (AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_SETTINGS_AUTO_XPOSTING_DEBUG_TOAST_ENABLED", z3)) {
                if (z) {
                    str3 = "enable";
                } else {
                    str3 = "disable";
                }
                C9GR.A0G(AnonymousClass001.A0g("[DEBUG ONLY] Attempting to ", str3, " feed auto-crossposting"));
            }
        }
        if (A00.A01 == num2 || C196068lw.A03(A00)) {
            String A01 = C9H5.A01(num);
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            InterfaceC02590Ai A002 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
            A002.AAP("flow_name", "ig_feed_share_to_fb");
            A002.AAP("event_name", "client_setting_updated");
            A002.AAP("xposting_setting_location", str);
            A002.A7v("client_setting", Boolean.valueOf(z));
            A002.A7v("user_interaction", Boolean.valueOf(z2));
            A002.AAP("account_type", AbstractC08690cX.A01(userSession).name());
            A002.AAP("destination_account_linkage_type", A01);
            A002.Cht();
        }
    }
}
