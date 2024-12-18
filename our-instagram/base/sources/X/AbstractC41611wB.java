package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41611wB {
    public static final int A00(UserSession userSession) {
        long A01;
        C14360o3.A0B(userSession, 0);
        boolean booleanValue = AbstractC41621wC.A00().booleanValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (booleanValue) {
            A01 = C1AD.A01(c06090Tz, 18586226161356746L);
        } else {
            A01 = C18U.A01(c06090Tz, userSession, 36601290390311062L);
        }
        return (int) Long.valueOf(A01).longValue();
    }

    public static final boolean A01(UserSession userSession) {
        long A01;
        C14360o3.A0B(userSession, 0);
        boolean booleanValue = AbstractC41621wC.A00().booleanValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (booleanValue) {
            A01 = C1AD.A01(c06090Tz, 18586226161422283L);
        } else {
            A01 = C18U.A01(c06090Tz, userSession, 36601290390376599L);
        }
        Long valueOf = Long.valueOf(A01);
        if (valueOf != null && valueOf.longValue() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        boolean A06;
        C14360o3.A0B(userSession, 0);
        boolean booleanValue = AbstractC41621wC.A00().booleanValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (booleanValue) {
            A06 = C1AD.A06(c06090Tz, 18304751183666187L);
        } else {
            A06 = C18U.A06(c06090Tz, userSession, 36319815413145276L);
        }
        Boolean valueOf = Boolean.valueOf(A06);
        C14360o3.A0A(valueOf);
        return valueOf.booleanValue();
    }
}
