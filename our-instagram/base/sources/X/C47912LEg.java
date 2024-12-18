package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LEg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47912LEg {
    public final UserSession A00;
    public final L7X A01;
    public final C2DS A02;
    public final L8o A03;

    public static final List A00(C2EC c2ec, C47912LEg c47912LEg, String str, int i, int i2, long j, long j2) {
        Object obj;
        String id;
        Object kx0;
        String C7I = c2ec.C7I();
        if (C7I != null) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = c47912LEg.A00;
            Long BTC = c08730cb.A01(userSession).BTC();
            L1W l1w = null;
            if (BTC != null && BTC.longValue() == j) {
                id = userSession.userId;
            } else {
                Iterator it = c2ec.BSH().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        Long BTC2 = ((User) obj).BTC();
                        if (BTC2 != null && BTC2.longValue() == j) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                User user = (User) obj;
                if (user != null) {
                    id = user.getId();
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (id != null) {
                if (i != 1) {
                    if (i == 2) {
                        l1w = LC9.A01(Long.valueOf(SandboxRepository.CACHE_TTL), null);
                    }
                } else {
                    l1w = LC9.A00();
                }
                boolean A0O = C6X6.A0O(userSession, c2ec);
                long longValue = c2ec.C7O().longValue();
                Boolean valueOf = Boolean.valueOf(A0O);
                String A04 = C4H6.A04(str, j2);
                L5O l5o = new L5O(l1w, valueOf, C05F.A0j, A04, str, C7I, id, null, null, null, longValue, C4H6.A01(A04), false, false, false);
                if (c47912LEg.A02.BSg(c2ec.BKb(), l5o.A05) == null) {
                    kx0 = new C45984KWy(LGi.A00.A00(userSession, l5o, i2), c2ec);
                } else {
                    String str2 = l5o.A06;
                    L8o l8o = c47912LEg.A03;
                    l8o.A00(str2, AbstractC43594JPz.A10(i2), 7101, 0);
                    l8o.A01(str2, false);
                    kx0 = new KX0("Existing placeholder found");
                }
                return AbstractC166987dD.A1J(kx0);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C47912LEg(UserSession userSession, L7X l7x, C2DS c2ds, L8o l8o) {
        AbstractC167027dH.A13(userSession, c2ds, l8o);
        this.A00 = userSession;
        this.A02 = c2ds;
        this.A03 = l8o;
        this.A01 = l7x;
    }
}
