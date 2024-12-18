package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196078lx {
    public static final Integer A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        int ordinal = AbstractC08690cX.A01(userSession).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return C05F.A0C;
                }
            } else if (!C18U.A06(C06090Tz.A05, userSession, 36326721720432689L)) {
                return C05F.A00;
            }
            InterfaceC19630xq interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
            Integer num = C05F.A0N;
            String string = interfaceC19630xq.getString("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", "OTHER");
            for (Integer num2 : C05F.A00(4)) {
                if (C14360o3.A0K(C9H5.A00(num2), string)) {
                    return num2;
                }
            }
            return num;
        }
        return C05F.A01;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C08730cb.A00(userSession).A00().A0I() != EnumC222416a.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession) == C05F.A00;
    }
}
