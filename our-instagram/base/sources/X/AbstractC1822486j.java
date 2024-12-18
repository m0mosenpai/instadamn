package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;

/* renamed from: X.86j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1822486j {
    public static final java.util.Set A00;
    public static final java.util.Set A01;

    public static final Integer A00(C22P c22p, UserSession userSession) {
        C14360o3.A0B(c22p, 1);
        User A012 = C17060sy.A01.A01(userSession);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A01);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36318110311716755L) || (!A012.A1X() && C18U.A06(c06090Tz, userSession, 36318110311847829L))) {
            linkedHashSet.add(C22P.A3u);
        }
        if (linkedHashSet.isEmpty()) {
            return C05F.A0C;
        }
        if (linkedHashSet.contains(c22p)) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    public static final boolean A01(C22P c22p, UserSession userSession) {
        C14360o3.A0B(c22p, 1);
        if (A00(c22p, userSession) == C05F.A0C) {
            return false;
        }
        return true;
    }

    static {
        C22P[] c22pArr = {C22P.A0a, C22P.A5b, C22P.A5c, C22P.A43, C22P.A4d};
        C14360o3.A0B(c22pArr, 0);
        A01 = AbstractC009903n.A0K(c22pArr);
        C22P[] c22pArr2 = {C22P.A0o, C22P.A1F};
        C14360o3.A0B(c22pArr2, 0);
        A00 = AbstractC009903n.A0K(c22pArr2);
    }
}
