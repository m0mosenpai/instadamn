package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FU1 {
    public static final boolean A01(UserSession userSession, String str, int i) {
        if (str != null) {
            return (i == 0 || i == 1) && !C18U.A06(C06090Tz.A06, userSession, 36329315880747275L);
        }
        return false;
    }

    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        C14360o3.A0B(interfaceC11380iw, 4);
        if (str != null) {
            C36881nl A01 = C36881nl.A01(fragmentActivity, interfaceC11380iw, userSession, str2);
            A01.A00 = null;
            AbstractC31179DnN.A1R(A01, str);
            A01.A0F = null;
            A01.A0K = str3;
            AbstractC31174DnI.A1P(A01);
        }
    }
}
