package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L8S {
    public final C18920wW A00;

    public final void A00(int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_muted_words_settings_event");
        AbstractC166997dE.A1N(A0f, "action", 8);
        A0f.A9K("word_count", 1L);
        A0f.A9K("word_list_size", AbstractC31171DnF.A0V(i));
        A0f.Cht();
    }

    public final void A01(int i, int i2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mwb_muted_words_settings_event");
        AbstractC166997dE.A1N(A0f, "action", 5);
        A0f.A9K("word_count", AbstractC31171DnF.A0V(i));
        A0f.A9K("word_list_size", AbstractC31171DnF.A0V(i2));
        A0f.Cht();
    }

    public L8S(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
