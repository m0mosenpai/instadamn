package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.F0r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34038F0r {
    public static final C1ON A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Collection collection, Collection collection2) {
        AbstractC25233BEq.A0v(0, userSession, collection, collection2);
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A1W(it, A0p);
        }
        JSONArray A0p2 = AbstractC31171DnF.A0p();
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            AbstractC31172DnG.A1W(it2, A0p2);
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("friendships/update_feed_favorites/");
        A0c.A9s("module", interfaceC11380iw.getModuleName());
        A0c.A9s("block_on_empty_thread_creation", "false");
        A0c.A0R(EBK.class, C35048FcL.class);
        A0c.AA6("add", A0p.toString());
        A0c.AA6("remove", A0p2.toString());
        return AbstractC31176DnK.A0P(A0c);
    }
}
