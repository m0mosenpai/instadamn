package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.CIy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27679CIy {
    public static final void A00(SpannableStringBuilder spannableStringBuilder, UserSession userSession, C38321qM c38321qM, InterfaceC75453aC interfaceC75453aC, int i) {
        boolean A1Y = AbstractC25229BEm.A1Y(c38321qM);
        int length = spannableStringBuilder.length();
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            String CAk = A2E.A03.CAk();
            if (CAk != null) {
                spannableStringBuilder.append((CharSequence) CAk);
                spannableStringBuilder.setSpan(new C27281C2g(c38321qM, interfaceC75453aC, i), length, spannableStringBuilder.length(), 33);
                AnonymousClass730 anonymousClass730 = new AnonymousClass730(userSession);
                String id = A2E.getId();
                String CAl = A2E.A03.CAl();
                Rie rie = Rie.FEED;
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    anonymousClass730.A00(rie, id, CAl, A2u, A1Y);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
