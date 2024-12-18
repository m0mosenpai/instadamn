package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7D {
    public final String A00;
    public final String A01;
    public final C18920wW A02;

    public L7D(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(EnumC46300KeW enumC46300KeW, EnumC46261Kdt enumC46261Kdt) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "direct_group_change_name_image");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, this.A01);
            A0f.A8R(enumC46300KeW, "action");
            AbstractC31171DnF.A1G(A0f, this.A00);
            A0f.A8R(enumC46261Kdt, "image_type");
            A0f.Cht();
        }
    }
}
