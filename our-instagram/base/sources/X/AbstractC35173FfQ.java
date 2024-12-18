package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.FfQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35173FfQ {
    public static final void A02(C1ON c1on, UserSession userSession, GZ1 gz1) {
        EE9.A00(c1on, userSession, gz1, 8);
    }

    public static final String A00(Collection collection) {
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A1W(it, A0p);
        }
        return AbstractC166987dD.A19(A0p);
    }

    public static void A01(C25621Ms c25621Ms, UserSession userSession, GZ1 gz1, Collection collection) {
        c25621Ms.A9s("user_ids", A00(collection));
        c25621Ms.A0R(C1574875f.class, C75g.class);
        A02(c25621Ms.A0N(), userSession, gz1);
    }

    public static final void A03(UserSession userSession, GZ1 gz1, String str, List list) {
        AbstractC167017dG.A1N(userSession, str);
        if (AbstractC166987dD.A1b(list)) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0L("direct_v2/threads/%s/approve_participant_requests/", str);
            A01(A0c, userSession, gz1, list);
        }
    }
}
