package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3Mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72293Mc {
    public final boolean A02(C9C7 c9c7, UserSession userSession) {
        List list;
        List list2;
        C14360o3.A0B(c9c7, 0);
        Object obj = c9c7.A04;
        Object obj2 = c9c7.A05;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36318114606028696L)) {
            list = AbstractC72283Mb.A01;
        } else {
            list = AbstractC72283Mb.A02;
        }
        if (!list.contains(obj)) {
            if ((C18U.A06(c06090Tz, userSession, 36318114606618529L) && obj == AnonymousClass317.A08 && obj2 == EnumC64222vh.A03) || (list2 = (List) AbstractC72283Mb.A03.get(obj)) == null || !list2.contains(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean A00(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36316362259566884L);
    }

    public static final boolean A01(UserSession userSession) {
        return C18U.A06(C06090Tz.A06, userSession, 36316091676364754L);
    }
}
