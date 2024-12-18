package X;

import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.Hyl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40565Hyl {
    public static final boolean A00(UserSession userSession, Long l) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36312174666646472L);
        if (l == null) {
            l = AbstractC166997dE.A0i(c06090Tz, userSession, 36593649644537295L);
        }
        long longValue = l.longValue();
        if (!A06) {
            return false;
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        if (C18U.A06(c06090Tz2, userSession, 36312174667367376L)) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            if (new BitSet(0).nextClearBit(0) >= 0) {
                C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.async.components.CPDPScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), 719983200, longValue, true);
                WTY wty = new WTY(null, null, null, null);
                AnonymousClass637 A00 = VRA.A00(userSession, false);
                C14360o3.A0B(A00, 2);
                c63719SsZ.E5D(wty, A00, null, false);
            } else {
                throw AbstractC166987dD.A14("Missing required params");
            }
        } else {
            AbstractC191798eb.A03(C1LZ.A00().A00, new C191778eZ(userSession), "com.bloks.www.bloks.cxf.cpdp", null, AbstractC191768eY.A01(AbstractC31177DnL.A0h()), longValue);
        }
        if (C18U.A06(c06090Tz2, userSession, 36312174669071336L) && C18U.A06(c06090Tz2, userSession, 36312174669005799L)) {
            AbstractC191798eb.A03(C1LZ.A00().A00, new C191778eZ(userSession), "com.bloks.www.bloks.cxf.cpdp.browseheavy", null, AbstractC191768eY.A01(AbstractC31177DnL.A0h()), longValue);
            return true;
        }
        return true;
    }
}
