package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ff0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35158Ff0 {
    public static final C35158Ff0 A00 = new Object();

    public final void A01(C26069Bfx c26069Bfx, UserSession userSession, String str) {
        C14360o3.A0B(c26069Bfx, 1);
        A00(c26069Bfx, userSession, "deeplink_pass", "deeplink", str, null);
    }

    public final void A02(C26069Bfx c26069Bfx, UserSession userSession, String str, String str2) {
        C14360o3.A0B(c26069Bfx, 1);
        A00(c26069Bfx, userSession, "deeplink_fail", "deeplink", str, str2);
    }

    public static final void A00(C26069Bfx c26069Bfx, UserSession userSession, String str, String str2, String str3, String str4) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_permissions_event");
        AbstractC31171DnF.A1B(A0f, str);
        AbstractC31171DnF.A19(A0f, c26069Bfx.A01);
        A0f.AAP("flow_id", c26069Bfx.A02);
        AbstractC31171DnF.A1G(A0f, c26069Bfx.A00);
        A0f.AAP("component", str3);
        AbstractC31171DnF.A1A(A0f, str2);
        AbstractC31171DnF.A1E(A0f, c26069Bfx.A03);
        A0f.AAP("error_identifier", str4);
        A0f.Cht();
    }
}
