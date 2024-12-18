package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196008lp {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C196018lq.A00(userSession).isCrossPostingSettingsPlatformizationReadEnabled()) {
            return C196018lq.A00(userSession).getDataProvider().C1B();
        }
        if (AbstractC196078lx.A02(userSession)) {
            return AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", false);
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        return ((Boolean) A00.A1B.CES(A00, C23031Ai.A8c[132])).booleanValue();
    }

    public final void A01(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        boolean A00;
        String str2;
        String str3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        if (AbstractC196078lx.A02(userSession)) {
            A00 = AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", false);
            InterfaceC19610xo ARD = AbstractC46542Bs.A00(userSession).A04.ARD();
            ARD.E77("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", z);
            ARD.apply();
        } else {
            A00 = A00(userSession);
            AbstractC23021Ah.A00(userSession).A1L(z);
            if (A00 != z) {
                AbstractC46542Bs.A00(userSession).A05(z);
            }
        }
        if (A00 != z && AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_SETTINGS_AUTO_XPOSTING_DEBUG_TOAST_ENABLED", false)) {
            if (z) {
                str3 = "enable";
            } else {
                str3 = "disable";
            }
            C9GR.A0G(AnonymousClass001.A0g("[DEBUG ONLY] Attempting to ", str3, " story auto-crossposting"));
        }
        if (num != null) {
            str2 = C9H5.A01(num);
        } else {
            str2 = null;
        }
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A002 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A002.AAP("flow_name", "ig_story_share_to_fb");
        A002.AAP("event_name", "client_setting_updated");
        A002.AAP("xposting_setting_location", str);
        A002.A7v("client_setting", Boolean.valueOf(z));
        A002.A7v("user_interaction", Boolean.valueOf(z2));
        A002.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A002.AAP("destination_account_linkage_type", str2);
        A002.Cht();
    }
}
