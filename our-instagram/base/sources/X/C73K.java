package X;

import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.73K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C73K {
    public static final boolean A00(InterfaceC81873l7 interfaceC81873l7, UserSession userSession, User user) {
        boolean A06;
        C14360o3.A0B(userSession, 1);
        if (interfaceC81873l7.BNW() == IgUserBioLinkTypeEnum.A05) {
            if (C14360o3.A0K(user.getId(), userSession.userId)) {
                A06 = A02(userSession, user);
            } else {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36314004322650484L)) {
                    A06 = C18U.A06(c06090Tz, userSession, 36320090291707949L);
                } else {
                    return false;
                }
            }
            if (!A06) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, User user) {
        Boolean valueOf;
        if (!C14360o3.A0K(user.A03.BwJ(), true)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320090291118119L)) {
            return false;
        }
        if (C14360o3.A0K(userSession.userId, user.getId())) {
            valueOf = AbstractC31562Dtn.A00(userSession);
        } else {
            valueOf = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36320090291773486L));
        }
        return valueOf.booleanValue();
    }

    public static final boolean A02(UserSession userSession, User user) {
        Boolean valueOf;
        if (!C14360o3.A0K(user.A03.BwI(), true)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36314004322650484L)) {
            return false;
        }
        if (C14360o3.A0K(userSession.userId, user.getId())) {
            valueOf = AbstractC31562Dtn.A00(userSession);
        } else {
            valueOf = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36320090291707949L));
        }
        return valueOf.booleanValue();
    }
}
