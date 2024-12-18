package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class LGM {
    public final UserSession A00;

    public LGM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A01(L1W l1w, DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        String str = directThreadKey.A00;
        if (str != null) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36325592145278141L) && l1w != null) {
                if ((AbstractC46831KnQ.A00(l1w) || l1w.A00 == EnumC46242KdI.A05) && AbstractC43594JPz.A0c(userSession, directThreadKey) != null) {
                    A00(this, str, true);
                }
            }
        }
    }

    public final void A02(DirectThreadKey directThreadKey) {
        C81663kb A0c;
        String str;
        C14360o3.A0B(directThreadKey, 0);
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36320283568185647L) && (A0c = AbstractC43594JPz.A0c(userSession, directThreadKey)) != null && C6X6.A0M(userSession, A0c) && C6X6.A0O(userSession, A0c)) {
            C1118752z Ay9 = A0c.Ay9();
            if ((Ay9 == null || Ay9.A04 == null) && (str = directThreadKey.A00) != null) {
                A00(this, str, false);
            }
        }
    }

    public static final void A00(LGM lgm, String str, boolean z) {
        C25621Ms A0c = AbstractC167017dG.A0c(lgm.A00);
        A0c.A0L("direct_v2/threads/%s/sync_disappearing_messages_eligibility/", str);
        A0c.A0R(C40781ul.class, C55702hA.class);
        if (z) {
            A0c.A0D("skip_e2ee_attribution", 1);
        }
        C1GJ.A06(A0c.A0N(), -5, 2, true, false);
    }
}
