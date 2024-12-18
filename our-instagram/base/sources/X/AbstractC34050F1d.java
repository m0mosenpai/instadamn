package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F1d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34050F1d {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_thread_armadillo_biz_tools_upsell_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9K("ig_userid", AbstractC25228BEl.A13(AbstractC166987dD.A10(userSession).getId()));
            AbstractC31171DnF.A1F(A0f, str2);
            A0f.Cht();
        }
    }
}
