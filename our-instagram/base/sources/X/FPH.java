package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FPH {
    public final C18920wW A00;

    public final void A00(InterfaceC83733oI interfaceC83733oI, String str) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_message_translation_error");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, AbstractC31177DnL.A0f(interfaceC83733oI));
            A0f.AAP("error_message", str);
            A0f.Cht();
        }
    }

    public FPH(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
