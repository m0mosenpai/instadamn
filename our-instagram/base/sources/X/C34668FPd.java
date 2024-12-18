package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FPd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34668FPd {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;

    public C34668FPd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C19270xB A0D = AbstractC31171DnF.A0D("CreatorMonetizationSupportInboxLogger");
        this.A00 = A0D;
        this.A01 = AbstractC12220kQ.A01(A0D, userSession);
    }

    public final void A00(String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "ig_creator_monetization_support_inbox");
        AbstractC31171DnF.A1A(A0f, str);
        AbstractC31171DnF.A1C(A0f, str2);
        A0f.AAP("client_extra", str3);
        A0f.Cht();
    }
}
