package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ADz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23043ADz {
    public static final void A00(UserSession userSession) {
        AbstractC166987dD.A10(userSession).A03.EZT(true);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        if (A0x.contains("hidden_word_spam_scam_consent_accepted")) {
            InterfaceC19610xo ARD = A0x.ARD();
            ARD.EEj("hidden_word_spam_scam_consent_accepted");
            ARD.apply();
        }
    }

    public static final boolean A01(UserSession userSession) {
        Boolean CZ9 = AbstractC166987dD.A10(userSession).A03.CZ9();
        if (CZ9 != null && CZ9.booleanValue()) {
            return true;
        }
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        if (A0x.contains("hidden_word_spam_scam_consent_accepted")) {
            return A0x.getBoolean("hidden_word_spam_scam_consent_accepted", false);
        }
        return false;
    }
}
