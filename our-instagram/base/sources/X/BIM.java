package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class BIM {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        AbstractC167007dF.A1E(userSession, 0, interfaceC11380iw);
        AbstractC25234BEr.A1M(interfaceC11380iw, AbstractC12220kQ.A01(interfaceC11380iw, userSession), "follow_request_accept_tapped", str, i);
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        AbstractC167007dF.A1E(userSession, 0, interfaceC11380iw);
        AbstractC25234BEr.A1M(interfaceC11380iw, AbstractC12220kQ.A01(interfaceC11380iw, userSession), "follow_request_ignore_tapped", str, i);
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        C14360o3.A0B(interfaceC11380iw, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "follow_request_impression");
        A0f.A8p("position", Integer.valueOf(i));
        A0f.AAP("target_id", str);
        A0f.AAP("container_module", interfaceC11380iw.getModuleName());
        A0f.Cht();
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        AbstractC25234BEr.A1M(interfaceC11380iw, AbstractC12220kQ.A01(interfaceC11380iw, userSession), "follow_request_tapped", str, i);
    }
}
