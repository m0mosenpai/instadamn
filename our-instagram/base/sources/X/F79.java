package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F79 {
    public static final void A00(UserSession userSession, int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "mwb_hidden_words_nux_event");
        if (A0f.isSampled()) {
            AbstractC166997dE.A1N(A0f, "action", i);
            A0f.Cht();
        }
    }
}
