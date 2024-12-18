package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LdA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48513LdA implements InterfaceC13000lm {
    public final java.util.Set A00;
    public final C18920wW A01;
    public final UserSession A02;

    public static final void A00(C48513LdA c48513LdA, String str, String str2, String str3, String str4, int i, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c48513LdA.A01, "ig_reels_stack");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, str);
            AbstractC31171DnF.A1C(A0f, str2);
            A0f.A9K(AbstractC111324zv.A00(5395), AbstractC31171DnF.A0V(i));
            A0f.A7v("is_play_stack", Boolean.valueOf(z));
            A0f.AAP("client_context", str3);
            AbstractC31171DnF.A1H(A0f, str4);
            A0f.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(getClass());
        this.A00.clear();
    }

    public C48513LdA(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A02 = userSession;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = AbstractC31171DnF.A0l();
    }
}
