package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FPK {
    public final C18920wW A00;

    public final void A00(InterfaceC83713oG interfaceC83713oG, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_phone_number_menu_item_click");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, AbstractC92784Dr.A02(interfaceC83713oG));
            AbstractC31175DnJ.A1A(A0f, AbstractC140946Yw.A07(interfaceC83713oG));
            A0f.AAP("menu_item_type", str);
            A0f.Cht();
        }
    }

    public FPK(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
