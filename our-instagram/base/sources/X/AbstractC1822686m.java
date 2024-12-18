package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.86m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1822686m {
    public static final java.util.Set A00;
    public static final java.util.Set A01;
    public static final java.util.Set A02;

    public static final Integer A00(C22P c22p, UserSession userSession) {
        C14360o3.A0B(c22p, 1);
        if (c22p != C22P.A0a || !C18U.A06(C06090Tz.A05, userSession, 36326296518801211L)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(A01);
            linkedHashSet.addAll(A02);
            if (C18U.A06(C06090Tz.A05, userSession, 36321915652089740L)) {
                linkedHashSet.addAll(A00);
            } else {
                linkedHashSet.add(C22P.A5b);
                linkedHashSet.add(C22P.A5c);
            }
            if (linkedHashSet.isEmpty()) {
                return C05F.A0C;
            }
            if (!linkedHashSet.contains(c22p)) {
                return C05F.A01;
            }
        }
        return C05F.A00;
    }

    static {
        C22P c22p = C22P.A0a;
        C22P c22p2 = C22P.A5b;
        C22P c22p3 = C22P.A5c;
        C22P c22p4 = C22P.A43;
        C22P c22p5 = C22P.A4d;
        C22P c22p6 = C22P.A4W;
        C22P c22p7 = C22P.A4X;
        C22P c22p8 = C22P.A4Y;
        C22P[] c22pArr = {c22p, c22p2, c22p3, c22p4, c22p5, c22p6, c22p7, c22p8, C22P.A4b};
        C14360o3.A0B(c22pArr, 0);
        A00 = AbstractC009903n.A0K(c22pArr);
        C22P[] c22pArr2 = {c22p6, c22p7, c22p8};
        C14360o3.A0B(c22pArr2, 0);
        A02 = AbstractC009903n.A0K(c22pArr2);
        C22P[] c22pArr3 = {C22P.A3W, C22P.A3U};
        C14360o3.A0B(c22pArr3, 0);
        A01 = AbstractC009903n.A0K(c22pArr3);
    }

    public static final boolean A01(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36321915652155277L);
    }
}
