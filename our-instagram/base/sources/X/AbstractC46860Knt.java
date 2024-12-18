package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Knt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46860Knt {
    public static final boolean A00(UserSession userSession, DirectThreadKey directThreadKey) {
        C81663kb A0c;
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        if (directThreadKey == null || (A0c = AbstractC43594JPz.A0c(userSession, directThreadKey)) == null) {
            return false;
        }
        if (A0c.CYg()) {
            c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36325669453837559L)) {
                return false;
            }
            j = 36325669454820613L;
        } else {
            if (A0c.CPl() || C4GR.A04(A0c.C7g())) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36325669453903096L)) {
                return false;
            }
            j = 36325669454689539L;
        }
        return AbstractC31176DnK.A1a(c06090Tz, userSession, j);
    }
}
