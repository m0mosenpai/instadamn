package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9LK, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9LK {
    public static final void A02(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0f.AAP("flow_name", "ig_feed_share_to_fb");
        A01(A0f, str2, str, str3, z);
        A00(A0f, userSession, false, "user_interaction", str4);
    }

    public static final void A03(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0f.AAP("flow_name", "ig_reels_share_to_fb");
        A01(A0f, str2, str, str3, z);
        A00(A0f, userSession, false, "user_interaction", str4);
    }

    public static final void A04(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0f.AAP("flow_name", "ig_story_share_to_fb");
        A01(A0f, str2, str, str3, z);
        A00(A0f, userSession, false, "user_interaction", str4);
    }

    public static final void A05(UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0f.AAP("flow_name", "ig_feed_share_to_fb");
        A01(A0f, str2, str, str3, z);
        A0f.A7v("user_interaction", true);
        A00(A0f, userSession, Boolean.valueOf(z2), "user_attempted_client_setting", str4);
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3, boolean z) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.AAP("xposting_setting_location", str2);
        interfaceC02590Ai.A7v("client_setting", Boolean.valueOf(z));
        interfaceC02590Ai.AAP("server_setting", str3);
    }

    public static final void A06(UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0f.AAP("flow_name", "ig_reels_share_to_fb");
        A01(A0f, str, "reels", str2, z);
        A0f.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A0f.A7v("user_attempted_client_setting", Boolean.valueOf(z2));
        A0f.AAP("destination_account_linkage_type", str3);
        A0f.Cht();
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll, Boolean bool, String str, String str2) {
        interfaceC02590Ai.A7v(str, bool);
        interfaceC02590Ai.AAP("account_type", AbstractC08690cX.A01(abstractC12990ll).name());
        interfaceC02590Ai.AAP("destination_account_linkage_type", str2);
        interfaceC02590Ai.Cht();
    }
}
