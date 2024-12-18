package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FPG {
    public final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        String obj;
        if (!z && str != null && str2 != null && !C18U.A06(C06090Tz.A05, userSession, 36324097495412614L)) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            android.net.Uri A012 = AbstractC08820cl.A01(this.A00, str);
            if (A012 != null) {
                String host = A012.getHost();
                if (host != null && AbstractC001900j.A0a(host, AbstractC58317Pt9.A00(306), false)) {
                    obj = String.valueOf(A012.getQueryParameter("u"));
                } else {
                    obj = A012.toString();
                    C14360o3.A0A(obj);
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "messaging_outbound_click");
                if (A0f.isSampled()) {
                    A0f.A9K("sender_id", AbstractC166997dE.A0j(str2));
                    A0f.AAP("url", obj);
                    A0f.Cht();
                }
            }
        }
    }
}
