package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LEW {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;

    public static final void A00(LEW lew, String str, String str2, String str3, String str4, int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(lew.A00, lew.A01), "direct_request_filter");
        AbstractC31171DnF.A1C(A0f, str);
        A0f.A9T("e_counter_channel", "");
        A0f.A9K("total_requests", AbstractC31171DnF.A0V(i));
        if (str2 != null) {
            A0f.AAP("from_filter", str2);
        }
        if (str3 != null) {
            A0f.AAP("to_filter", str3);
        }
        if (str4 != null) {
            A0f.AAP("sort_and_filter_options", str4);
        }
        A0f.Cht();
    }

    public LEW(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1R(str, interfaceC11380iw);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = interfaceC11380iw;
    }
}
