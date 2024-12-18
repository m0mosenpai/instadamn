package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OQA {
    public static final void A00(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_fb_xposting_client");
        EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
        A0f.AAP("event_name", str);
        A0f.AAP("ig_userid", userSession.userId);
        if (A0I != null) {
            str2 = String.valueOf(A0I.A00);
        } else {
            str2 = null;
        }
        A0f.AAP("ig_user_account_type", str2);
        A0f.Cht();
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3) {
        String str4;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_fb_xposting_client");
        EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
        AbstractC31171DnF.A1G(A0f, str2);
        A0f.AAP("event_name", str);
        MSW.A1U(A0f, str3);
        A0f.AAP("ig_userid", userSession.userId);
        if (A0I != null) {
            str4 = String.valueOf(A0I.A00);
        } else {
            str4 = null;
        }
        A0f.AAP("ig_user_account_type", str4);
        A0f.Cht();
    }
}
