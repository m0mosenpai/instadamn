package X;

import android.content.Context;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.FgX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35238FgX {
    public static final C1ON A00(Context context, UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        Object obj;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(str, userSession);
        C11820jg c11820jg = C11830jh.A04;
        C11830jh A01 = c11820jg.A01(userSession);
        C19T c19t = C19T.A2L;
        String A02 = A01.A02(c19t);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("address_book/link/");
        AbstractC31175DnJ.A1F(c19t, A0c, c11820jg.A01(userSession));
        A0c.A9s(AbstractC31186DnV.A01(0, 9, 92), AbstractC31172DnG.A10(context));
        A0c.A9s("contacts", str);
        A0c.A9s("module", str2);
        A0c.A0I("should_process_contacts_immediately", z);
        A0c.A0H(CacheBehaviorLogger.SOURCE, str3);
        A0c.A0I("has_seen_new_ci_content", z2);
        A0c.A0R(C168027ex.class, C168037ey.class);
        StringBuilder A11 = AbstractC166997dE.A11("address_book/link/");
        A11.append('_');
        if (!AbstractC167007dF.A1O(str.length())) {
            obj = "";
        } else {
            obj = Integer.valueOf(str.hashCode());
        }
        A11.append(obj);
        A11.append('_');
        if (A02 == null || A02.length() == 0) {
            A02 = "";
        }
        A0c.A0A = AbstractC166997dE.A0x(A02, A11);
        A0c.A04();
        ((AbstractC23721Ec) A0c).A00 = 1500L;
        A0c.A0V = true;
        return A0c.A0N();
    }

    public static final C1ON A02(UserSession userSession, String str, String str2) {
        return A05(userSession, str, null, str2, null, null, null, false, false, false, false, false);
    }

    public static final C1ON A03(UserSession userSession, String str, String str2, String str3) {
        return A05(userSession, str, str2, str3, null, null, null, false, false, false, false, false);
    }

    public static final C1ON A04(UserSession userSession, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 0);
        return A05(userSession, str, str2, str3, str4, null, null, false, false, false, false, false);
    }

    public static final C1ON A05(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A02 = new C25581Mo(new C07510aQ(userSession), C168037ey.class);
        A0q.A06();
        A0q.A0E = str;
        A0q.A0H("query", str2);
        A0q.A0H("search_surface", str3);
        A0q.A0H("max_id", str4);
        A0q.A0H("rank_token", str5);
        A0q.A0H("order", str6);
        if (z2) {
            A0q.A9s(AbstractC111324zv.A00(2946), "true");
        }
        if (z3) {
            A0q.A9s(AbstractC111324zv.A00(1007), "true");
        }
        if (z4) {
            A0q.A9s("enable_groups", "true");
        }
        if (z5) {
            A0q.A9s(MSV.A00(1643), "true");
        }
        if (z) {
            StringBuilder A11 = AbstractC166997dE.A11(str);
            A11.append(str2);
            A11.append(str6);
            A11.append('_');
            A0q.A0A = AbstractC166997dE.A0x(str4, A11);
            A0q.A04();
            ((AbstractC23721Ec) A0q).A00 = 3000L;
        }
        if ("nux_follow_from_logged_in_accounts".equals(str3)) {
            A0q.A9s(CacheBehaviorLogger.SOURCE, "nux_follow_from_logged_in_accounts");
            A0q.A0N = true;
        } else if ("search_in_dp".equals(str3)) {
            A0q.A9s(CacheBehaviorLogger.SOURCE, "search_in_dp");
        }
        return A0q.A0N();
    }

    public static final C1ON A01(Context context, UserSession userSession, String str, boolean z) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("address_book/unlink/");
        AbstractC31175DnJ.A1F(C19T.A2L, A0c, AbstractC31172DnG.A0P(userSession));
        A0c.A9s(AbstractC31186DnV.A01(0, 9, 92), AbstractC31172DnG.A10(context));
        A0c.A0I("user_initiated", z);
        A0c.A0H(CacheBehaviorLogger.SOURCE, str);
        return AbstractC31177DnL.A0Q(A0c);
    }
}
