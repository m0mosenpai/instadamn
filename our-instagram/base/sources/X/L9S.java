package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L9S {
    public final C18920wW A00;

    public L9S(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(Long l, Long l2, String str, String str2, String str3, long j) {
        C14360o3.A0B(str2, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_recs_from_friends_recommendation_viewer_click_events");
        AbstractC31171DnF.A1C(A0f, str);
        A0f.A9K("target_id", l);
        AbstractC31171DnF.A1D(A0f, str2);
        A0f.AAP("follow_type", str3);
        A0f.A9K("number_of_users", Long.valueOf(j));
        A0f.A9K("index", l2);
        A0f.Cht();
    }

    public final void A01(Long l, String str, String str2) {
        C14360o3.A0B(str2, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_recs_from_friends_impression_events");
        A0f.AAP("flows", str);
        A0f.A9K("target_id", l);
        AbstractC31171DnF.A1D(A0f, str2);
        A0f.Cht();
    }

    public final void A02(Long l, String str, String str2, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_recs_from_friends_sender_view_click_events");
        AbstractC31171DnF.A1C(A0f, str);
        A0f.A9K("target_id", l);
        AbstractC31171DnF.A1D(A0f, "recs_from_friends_sender");
        A0f.A7v("has_custom_text", AbstractC31173DnH.A0e(A0f, "selected_user_ids", str2, z));
        A0f.Cht();
    }
}
