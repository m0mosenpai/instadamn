package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JU2 {
    public final C18920wW A00;
    public final EnumC31318Dpe A01;

    public final void A00(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "smart_suggestion_accept");
        if (str2 != null && str3 != null && A0f.isSampled()) {
            JQ0.A14(this.A01.A00, A0f, str, str2, str3);
        }
    }

    public final void A01(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "smart_suggestion_dismiss");
        if (str2 != null && str3 != null && A0f.isSampled()) {
            JQ0.A14(this.A01.A00, A0f, str, str2, str3);
        }
    }

    public final void A02(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "smart_suggestion_impression");
        if (str2 != null && str3 != null && A0f.isSampled()) {
            JQ0.A14(this.A01.A00, A0f, str, str2, str3);
        }
    }

    public JU2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC31318Dpe enumC31318Dpe) {
        this.A01 = enumC31318Dpe;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
