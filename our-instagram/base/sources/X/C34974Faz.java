package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import org.json.JSONArray;

/* renamed from: X.Faz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34974Faz {
    public static final C1ON A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String A06 = AbstractC13670mt.A06(AbstractC111324zv.A00(3283), userSession.userId);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B(A06);
        return AbstractC25227BEk.A0e(A0M, C2045893s.class, C2046093u.class);
    }

    @Deprecated(message = "")
    public final C1ON A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Collection collection, Collection collection2) {
        String str;
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
        A0c.A0B("friendships/set_besties/");
        switch (num.intValue()) {
            case 0:
                str = "audience_dialog";
                break;
            case 1:
                str = "audience_manager";
                break;
            case 2:
                str = AbstractC111324zv.A00(1188);
                break;
            default:
                str = "netego_unit";
                break;
        }
        A0c.A9s(CacheBehaviorLogger.SOURCE, str);
        A0c.A9s("module", interfaceC11380iw.getModuleName());
        A0c.A9s("block_on_empty_thread_creation", "false");
        AbstractC31173DnH.A1N(A0c);
        A0c.AA6("add", A0p.toString());
        A0c.AA6("remove", A0p2.toString());
        return AbstractC31176DnK.A0P(A0c);
    }
}
